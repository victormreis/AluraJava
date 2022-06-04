
public class TesteFuncionario {
	public static void main(String[] args) {
		
		Funcionario func = new Funcionario();
		
		func.setNome("Victor");
		func.setSalario(2000);
		
		System.out.println(func.getSalario());
		
		System.out.println(func.getBonificacao());
		
		func.setSalario(func.getBonificacao());
		
		System.out.println(func.getSalario());
		
	
	}

}

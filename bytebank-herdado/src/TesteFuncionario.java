
public class TesteFuncionario {
	public static void main(String[] args) {
		
		
		Gerente gen = new Gerente();
		ControlaBonificacao controle = new ControlaBonificacao();
		
		gen.setNome("Daiane");
		gen.setSalario(5000);
	
		
		
		controle.registra(gen);
		
		System.out.println(controle.getSoma());
		
		
		
	
	}

}

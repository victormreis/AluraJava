
public class TestaBanco {

	public static void main(String[] args) {
		Cliente victor = new Cliente();
		victor.nome = "Victor Martins";
		victor.cpf = "415.164.288-97";
		victor.profissao = "Programador";
		
		Conta contaDoVictor = new Conta();
		contaDoVictor.titular = victor;
		
		contaDoVictor.deposita(500);
	
		System.out.println(contaDoVictor.titular.nome);
		

	}

}

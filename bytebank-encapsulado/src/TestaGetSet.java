
public class TestaGetSet {

	public static void main(String[] args) {
		Conta conta = new Conta(2799, 1299);		
			
		System.out.println("Agencia: " + conta.getNumero());
		
		Cliente victor = new Cliente();
		victor.setNome("Victor Martins");
		conta.setTitular(victor);
		
		conta.deposita(100);
		System.out.println(conta.getSaldo());
	}

}

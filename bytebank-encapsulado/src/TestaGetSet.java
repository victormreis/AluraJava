
public class TestaGetSet {

	public static void main(String[] args) {
		Conta conta = new Conta(2799, 1299);	
		Conta conta2 = new Conta(2799, 1568);
		Conta conta3 = new Conta(2799, 1925);
			
		System.out.println("Agencia: " + conta.getNumero());
		
		Cliente victor = new Cliente();
		victor.setNome("Victor Martins");
		conta.setTitular(victor);
		
		conta.deposita(100);
		System.out.println(conta.getSaldo());
		
		System.out.println("total de contas: " + Conta.getTotal());
	}

}

package byteBank;

public class CriaConta {

	public static void main(String[] args) {
		
		Conta victor = new Conta();
		Conta teste = new Conta();	
		
		System.out.println(victor.titular);
		
		teste.deposita(500);
		victor.deposita(100);
		System.out.println(teste.saldo);
		System.out.println(victor.saldo);
		teste.transferir(150, victor);
		System.out.println(teste.saldo);
		System.out.println(victor.saldo);
	}

}

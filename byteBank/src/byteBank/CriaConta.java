package byteBank;

public class CriaConta {

	public static void main(String[] args) {
		
		Conta primeiraConta = new Conta();		
		Conta segundaConta= primeiraConta;
		primeiraConta.saldo = 200;
		System.out.println("Saldo da primeira conta �: " + primeiraConta.saldo);
		segundaConta.saldo += 100;
		
		System.out.println("Saldo da primeira conta �: " + primeiraConta.saldo);
		
		
	

	}

}

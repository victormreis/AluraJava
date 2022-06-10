

public class Conta {

	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int tota ;
	
	public void deposita(double valor){
		this.saldo += valor;
	}
	
	public boolean sacar(double valor) {
		if(valor <= this.saldo) {
			this.saldo -= valor;
			return true;
		}else {
			return false;
		}
	}
	
	public boolean transferir(double valor, Conta destino) {
		if(this.saldo >= valor) {
			this.sacar(valor);
			destino.deposita(valor);
			return true;
		}
			return false;
		}
		
	}


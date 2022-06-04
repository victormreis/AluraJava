
public class Conta {

	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total;

	public Conta(int numero, int agencia) {
		total++;
		System.out.println("Criando conta...");
		
		this.numero = numero;
		this.agencia = agencia;
		System.out.println("Total de contas criadas: "+ Conta.total);

	}

	public void deposita(double valor) {
		if (valor > 0) {
			this.saldo += valor;
		}

	}

	public boolean sacar(double valor) {
		if (valor <= this.saldo) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}

	public boolean transferir(double valor, Conta destino) {
		if (this.saldo >= valor) {
			this.sacar(valor);
			destino.deposita(valor);
			return true;
		}
		return false;
	}

	public double getSaldo() {
		return saldo;
	}

	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getAgencia() {
		return this.agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public static int getTotal() {
		return Conta.total;
	}

	
	

}

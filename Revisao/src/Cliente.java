
public class Cliente extends Pessoa {
	
	private boolean temCartao;
	
	public String compra() {
		
		return "o Cliente " + super.getNome() + "comprou o produto:";
	}

}

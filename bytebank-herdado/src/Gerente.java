
public class Gerente extends Funcionario {
	
	private int senha;
	
	public boolean autentica(int senha) {
		if(this.senha == senha) {
			return true;
		}
		return false;
	}

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

	@Override
	public double getBonificacao() {
		// TODO Auto-generated method stub
		return super.getSalario()+1000;
	}
	
	
}
	
	
	
	
	
	



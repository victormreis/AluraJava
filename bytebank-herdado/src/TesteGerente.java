
public class TesteGerente {
	
	public static void main(String[] args) {
		Gerente g1 = new Gerente();
		
		g1.setNome("Daiane");
		g1.setSenha(1994);
		g1.setSalario(5000);

		boolean autenticou = g1.autentica(1994);
		
		System.out.println(g1.getBonificacao());
		System.out.println(autenticou);
	}

}

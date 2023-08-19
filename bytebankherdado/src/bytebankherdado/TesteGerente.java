package bytebankherdado;

public class TesteGerente {

	public static void main(String[] args) {
		
		Autenticavel referencia = new Gerente();
		
		
		Gerente g1 = new Gerente();
		g1.setNome("Fábio");
		g1.setCpf("222.222.222-22");
		g1.setSalario(5000.0);
		
		System.out.println(g1.getNome());
		System.out.println(g1.getCpf());
		System.out.println(g1.getSalario());
		
		g1.setSenha(2222);
		
		boolean autentica = g1.autentica(2222);
		System.out.println(autentica);
		
		System.out.println(g1.getBonificacao());
		

	}

}

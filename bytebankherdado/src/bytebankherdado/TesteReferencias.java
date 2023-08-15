package bytebankherdado;

public class TesteReferencias {
	public static void main(String[] args) {
		
		Funcionario g1 = new Gerente();
		g1.setNome("Igor");
		
		String showname = g1.getNome();
		
		System.out.println(showname);
		
	}

}

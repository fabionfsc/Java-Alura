package bytebankherdado;

public class TesteReferencias {
	public static void main(String[] args) {
		
		Funcionario g = new Gerente();
		g.setNome("Igor");
		g.setSalario(5000.0);
		
		Funcionario e = new EditorVideo();
		e.setSalario(2000);
		
	
		ControleBonificacao controle = new ControleBonificacao();
		
		controle.registra(g);
		controle.registra(e);
		
		System.out.println(controle.getSoma());
		
		
		
	}

}

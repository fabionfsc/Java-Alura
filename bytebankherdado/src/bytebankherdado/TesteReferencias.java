package bytebankherdado;

public class TesteReferencias {
	public static void main(String[] args) {
		
		Funcionario g = new Gerente();
		g.setNome("Igor");
		g.setSalario(5000);
		
		Funcionario e = new EditorVideo();
		e.setSalario(2000);
		
		Funcionario d = new Designer();
		d.setSalario(500);
	
		ControleBonificacao controle = new ControleBonificacao();
		
		controle.registra(g);
		controle.registra(e);
		controle.registra(d);
		
		System.out.println(controle.getSoma());
		
	}

}

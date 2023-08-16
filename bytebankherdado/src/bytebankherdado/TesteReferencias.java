package bytebankherdado;

public class TesteReferencias {
	public static void main(String[] args) {
		
		Funcionario g = new Gerente();
		g.setNome("Igor");
		g.setSalario(5000.0);
		
		Funcionario f = new Funcionario();
		f.setSalario(1000);
		
		Funcionario e = new EditorVideo();
		e.setSalario(2000);
		
	
		ControleBonificacao controle = new ControleBonificacao();
		
		controle.registra(g);
		controle.registra(f);
		controle.registra(e);
		
		System.out.println(controle.getSoma());
		
		
		
	}

}

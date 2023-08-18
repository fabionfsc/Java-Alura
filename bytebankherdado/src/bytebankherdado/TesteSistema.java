package bytebankherdado;

public class TesteSistema {
	
	public static void main(String[] args) {
	
		SistemaInterno si = new SistemaInterno();
		
		Gerente g = new Gerente();
		g.setSenha(2222);
		
		Administrador adm = new Administrador();
		adm.setSenha(1000);
		
		si.autentica(g);
		si.autentica(adm);
	}
}

package bytebankherdado;

public class SistemaInterno {

	private int senha = 2222;

	public void autentica(FuncionarioAutenticavel g) {
		boolean autenticou = g.autentica(this.senha);
		if (autenticou) {
			System.out.println("Autenticado com sucesso!");
		} else {
			System.out.println("Senha incorreta");
		}
	}
}

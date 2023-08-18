package bytebankherdado;

public class Gerente extends FuncionarioAutenticavel {
	
	public double getBonificacao() {
		System.out.println("Método de bonificação do Gerente");
		return super.getSalario();
	}
	
}

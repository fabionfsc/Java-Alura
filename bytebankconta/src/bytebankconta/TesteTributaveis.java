package bytebankconta;

public class TesteTributaveis {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(222, 333);
		cc.deposita(100);
		
		SeguroDeVida segurocc = new SeguroDeVida();
		
		CalculadorDeImposto calccc = new CalculadorDeImposto();
		
		calccc.registra(segurocc);
		calccc.registra(cc);
		
		System.out.println(calccc.getTotalImposto());
		

	}

}

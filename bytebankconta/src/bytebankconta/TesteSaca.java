package bytebankconta;

public class TesteSaca {

	public static void main(String[] args) {
		
		Conta cc = new ContaCorrente(100, 200);
		cc.deposita(1000);
		
		System.out.println(cc.getSaldo());
		
		cc.saca(1001);
		
		System.out.println(cc.getSaldo());
		
	}

}

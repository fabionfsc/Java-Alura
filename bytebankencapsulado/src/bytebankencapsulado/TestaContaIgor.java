package bytebankencapsulado;

public class TestaContaIgor {
	public static void main(String[] args) {
		
		Conta contaDoIgor = new Conta();
		
		contaDoIgor.deposita(10000);
		System.out.print(contaDoIgor.getSaldo());
		
	}
}

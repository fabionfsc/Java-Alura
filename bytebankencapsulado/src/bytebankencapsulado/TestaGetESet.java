package bytebankencapsulado;

public class TestaGetESet {
	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.setNumero(1337);
		
		conta.deposita(1500);
		System.out.println(conta.getSaldo());
	}
}

package bytebank;

public class TestaMetodos {
	public static void main(String[] args) {
		Conta contaDoFabio = new Conta();
		
		contaDoFabio.deposita(1000);
		System.out.println("Seu saldo é de " + contaDoFabio.saldo);
		
		contaDoFabio.saca(900);
		System.out.println(contaDoFabio.saldo);
		
		Conta contaDoIgor = new Conta();
		
		contaDoIgor.deposita(1500);
		
		contaDoFabio.titular = "Fabio Silva";
		contaDoIgor.titular = "Igor Eger";
		
		System.out.println(contaDoIgor.titular + " & " + contaDoFabio.titular);

	}
}

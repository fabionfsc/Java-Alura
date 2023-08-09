package bytebankcomposto;

public class TestaContaSemCliente {
	public static void main(String[] args) {
		Conta contaDoCaio = new Conta();
		System.out.println(contaDoCaio.saldo);
		
		System.out.println(contaDoCaio.titular);
		
		contaDoCaio.titular = new Cliente();
		
		contaDoCaio.titular.nome = "Caio";
		System.out.println(contaDoCaio.titular.nome);
	}

}

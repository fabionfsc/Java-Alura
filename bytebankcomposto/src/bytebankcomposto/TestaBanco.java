package bytebankcomposto;

public class TestaBanco {
	public static void main(String[] args) {
		Cliente fabio = new Cliente();
		fabio.nome = "Fábio Silva";
		fabio.cpf = "057.876.351-67";
		fabio.profissao = "Programador";
		
		Conta contaDoFabio = new Conta();
		contaDoFabio.deposita(2000);
		
		contaDoFabio.titular = fabio;
		System.out.println(fabio.profissao);
	}
}

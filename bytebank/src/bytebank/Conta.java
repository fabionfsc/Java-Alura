package bytebank;

public class Conta {
	int agencia;
	int conta;
	double saldo;
	String titular;

	public void deposita(double valor) {
		saldo = saldo + valor;
	}

	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			saldo = saldo - valor;
			return true;
		}
		return false;
	}

	public boolean transfere(double valor, Conta destino) {
		if (valor >= saldo) {
			saldo = saldo - valor;
			destino.saldo = saldo + valor;
			return true;
		}
		return false;

	}
}

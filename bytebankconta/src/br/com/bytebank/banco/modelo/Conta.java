package br.com.bytebank.banco.modelo;

public abstract class Conta {
	protected double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total;

	public Conta(int agencia, int numero) {
		Conta.total++;
		System.out.println("O total de contas é de " + total);
		this.agencia = agencia;
		this.numero = numero;
	}

	public abstract void deposita(double valor);

	public void saca(double valor) throws SaldoInsuficienteException {
		if (this.saldo < valor) {
			throw new SaldoInsuficienteException("Saldo insuficiente. Seu saldo é de: " + this.saldo + " Valor solicitado: " + valor);
		} else {
			this.saldo -= valor;
		}
	}

	public void transfere(double valor, Conta destino) throws SaldoInsuficienteException {
		this.saca(valor);
		destino.deposita(valor);
	}

	public double getSaldo() {
		return this.saldo;
	}

	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int novoNumero) {
		this.numero = novoNumero;
	}

	public int getAgencia() {
		return this.agencia;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
}

package br.com.bytebank.banco.modelo;

public class GuardadorDeReferencias {
	
	private Conta[] referencias;
	private int posicaoLivre;
	
	public GuardadorDeReferencias() {
		this.referencias = new Conta[10];
		this.posicaoLivre = 0;
	}
	
	public void adiciona(Conta conta) {
		this.referencias[this.posicaoLivre] = conta;
		this.posicaoLivre++;
	}

}

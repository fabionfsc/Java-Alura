package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.CalculadorDeImposto;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.SeguroDeVida;

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

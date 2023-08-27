package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.SaldoInsuficienteException;

public class TesteSaca {

	public static void main(String[] args) {
		
		Conta cc = new ContaCorrente(100, 200);
		cc.deposita(1000);
		
		System.out.println(cc.getSaldo());
		
		try {
			cc.saca(1001);
		} catch (SaldoInsuficienteException ex) {
			ex.getMessage();
		}
		
		System.out.println(cc.getSaldo());
		
	}

}

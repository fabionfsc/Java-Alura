package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.SaldoInsuficienteException;
import br.com.bytebank.banco.modelo.Conta;

public class TesteArrayReferencias {

	public static void main(String[] args) throws SaldoInsuficienteException {
		
		
		Conta[] contas = new ContaCorrente[5];
		ContaCorrente cc1 = new ContaCorrente(111, 222);
		
		contas[0] = cc1;
		
		contas[0].deposita(1000);
		
		System.out.println(contas[0].getSaldo());
		
		ContaCorrente cc2 = new ContaCorrente(111, 333);
		
		contas[1] = cc2;
		
		contas[1].deposita(1500);
		
		contas[1].transfere(1000, contas[0]);
		
		System.out.println(contas[1].getSaldo());
		
		contas[2] = new ContaCorrente(10, 22);
		
		System.out.println(contas[2].getAgencia());
		
	}

}

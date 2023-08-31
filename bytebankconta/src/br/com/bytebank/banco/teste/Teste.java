package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.*;
import br.com.bytebank.banco.modelo.GuardadorDeReferencias;

public class Teste {

	public static void main(String[] args) {
		
		GuardadorDeReferencias guardador = new GuardadorDeReferencias();
		
		Conta ccref = new ContaCorrente(100, 200);
		
		guardador.adiciona(ccref);
		
		Conta ccref2 = new ContaCorrente(101, 201);
		
		guardador.adiciona(ccref2);
		
		System.out.println();

	}

}

package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.*;
import br.com.bytebank.banco.modelo.GuardadorDeContas;

public class Teste {

	public static void main(String[] args) {
		
		GuardadorDeContas guardador = new GuardadorDeContas();
		
		Conta ccref = new ContaCorrente(100, 200);
		
		guardador.adiciona(ccref);
		
		Conta ccref2 = new ContaCorrente(101, 201);
		
		guardador.adiciona(ccref2);
		
		int tamanho = guardador.getQuantidadeDeElementos();
		System.out.println(tamanho);
		
		Conta ref = guardador.getReferencia(1);
		
		System.out.println(ref.getNumero());
	}

}

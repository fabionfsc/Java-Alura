package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class Teste {

	public static void main(String[] args) {

		ArrayList lista = new ArrayList();

		Conta ccref = new ContaCorrente(100, 200);
		lista.add(ccref);

		Conta ccref2 = new ContaCorrente(101, 201);
		lista.add(ccref2);

		System.out.println(lista.size());

		// For Clássico
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}

		// For Simplificado
		for (Object oRef : lista) {
			System.out.println(oRef);
		}
	}

}

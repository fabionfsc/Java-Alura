package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import br.com.bytebank.banco.modelo.*;

public class TesteArrayListEquals {

	public static void main(String[] args) {

		// Generics
		ArrayList<Conta> lista = new ArrayList<Conta>();

		Conta ccref = new ContaCorrente(100, 200);
		lista.add(ccref);

		Conta ccref2 = new ContaCorrente(101, 201);
		lista.add(ccref2);

		Conta ccref3 = new ContaCorrente(101, 201);
		
		boolean verifica = lista.contains(ccref2);

		if (verifica == true) {
			System.out.println("A conta existe");
		} else {
			System.out.println("A conta não existe");
		}

		for (Object conta : lista) {
			System.out.println(conta);
		}
	}

}

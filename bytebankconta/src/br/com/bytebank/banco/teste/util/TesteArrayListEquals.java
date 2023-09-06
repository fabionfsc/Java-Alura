package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import br.com.bytebank.banco.modelo.*;

public class TesteArrayListEquals {

	public static void main(String[] args) {

		//Generics
		ArrayList<Conta> lista = new ArrayList<Conta>();

		Conta ccref = new ContaCorrente(100, 200);
		lista.add(ccref);

		Conta ccref2 = new ContaCorrente(101, 201);
		lista.add(ccref2);
		
		boolean verifica = lista.contains(ccref2);
		
		System.out.println(verifica);
		
		for (Object conta : lista) {
			System.out.println(conta);
		}
	}

}

package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import br.com.bytebank.banco.modelo.*;

public class TesteArrayList {

	public static void main(String[] args) {

		//Generics
		ArrayList<Conta> lista = new ArrayList<Conta>();
		
		ArrayList<String> nomes = new ArrayList<String>();

		Conta ccref = new ContaCorrente(100, 200);
		Cliente cliente = new Cliente();
		
		lista.add(ccref);
		ccref.setTitular(cliente);
		cliente.setNome("Fábio");
		
		System.out.println(cliente.getNome());
		
		nomes.add(cliente.getNome());
		
		System.out.println(nomes.get(0));
		
		System.out.println("---");

		Conta ccref2 = new ContaCorrente(101, 201);
		lista.add(ccref2);
		
		//Cliente cliente = new Cliente();
		
		System.out.println(lista.size());
		
		Conta ref = lista.get(0);
		System.out.println(ref);

		// For Clássico
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}

		// For Simplificado
		for (Object conta : lista) {
			System.out.println(conta);
		}
	}

}

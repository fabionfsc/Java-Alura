package br.com.bytebank.banco.teste.util;

import java.util.*;

public class TesteWrapperInteger {

	public static void main(String[] args) {


		Integer numero = Integer.valueOf(23);

		int shownumero = numero.intValue();

		System.out.println(shownumero);

		List list = new ArrayList();

		list.add(numero);

		System.out.println(list.get(0));

	}

}

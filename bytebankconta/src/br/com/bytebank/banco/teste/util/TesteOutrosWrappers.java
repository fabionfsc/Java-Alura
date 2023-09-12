package br.com.bytebank.banco.teste.util;

import java.util.*;

public class TesteOutrosWrappers {
	public static void main(String[] args) {
		
		
		Double dRef = Double.valueOf(3.14);
		System.out.println(dRef.doubleValue());
		
		Boolean bRef = Boolean.valueOf(true);
		System.out.println(bRef.booleanValue());
		
		List<Number> lista = new ArrayList<>();
		
		lista.add(10);
		lista.add(3.14);
	}

}

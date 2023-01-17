package com.bytebank.test;

import java.util.ArrayList;
import java.util.List;

public class TestRepasoArray {

	public static void main(String[] args) {

		int[] numeros = new int[10];

		//List lista = new ArrayList();
		
		int numero = 40;
		Integer numeroObjeto = new Integer(40);
		
		List<Integer> lista = new ArrayList<Integer>();
		lista.add(numero); //Autoboxing
		lista.add(new Integer(40));
		lista.add(numeroObjeto);
		

		//PRIMITIVO != OBJECT	
		
		//System.out.println(lista.add.get());
	}

}

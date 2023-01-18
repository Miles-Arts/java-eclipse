package com.bytebank.test;

import java.util.ArrayList;

import java.util.List;

public class TestRepasoArray {

	public static void main(String[] args) {

		int[] numeros = new int[10];

		//List lista = new ArrayList();
		
		int numero = 40;
		//WARPPER
		//Integer numeroObjeto = new Integer(40); DEPRECADO  Integer será desactualizado por JAVA
		Integer numeroObjeto = Integer.valueOf(40);
		
		List<Integer> lista = new ArrayList<Integer>();
		lista.add(numero); //Autoboxing
		//lista.add(new Integer(40));
		lista.add(Integer.valueOf(40));
		lista.add(numeroObjeto);
		
		//unboxing
		//int valorPrimitivo = numerObjeto;
		
		
		int valorPrimitivo = numeroObjeto.intValue();
		
		byte byteInteger = numeroObjeto.byteValue();
		double doubleInteger = numeroObjeto.doubleValue();
		float floatInteger = numeroObjeto.floatValue();
		
		
		//El numero ENTERO más alto y bajo  que puede guardar
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		System.out.println(Integer.SIZE); //BITS
		System.out.println(Integer.BYTES); //BYTES
		
		//PRIMITIVO != OBJECT	
		
		//System.out.println(lista.add.get());
	}

}

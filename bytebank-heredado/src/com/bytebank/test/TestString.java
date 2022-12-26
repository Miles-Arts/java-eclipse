package com.bytebank.test;

public class TestString {

	/**
	 * Aprendiendo a usar distintos mpetodos de STRING
	 * REPLACE
	 * CONCAT
	 * TOUPPERCASE
	 * TOLOWECASE
	 * @param args
	 */
	
	public static void main(String[] args) {
		
		//En JAVa STRING es un objeto y Java nos ayuda con una sixtais fácil de usar
		String nombre = "mercedes benz"; 
		//String nombre2 = new String("Clase E430"); //No se usa en el mundo REAL
		
		System.out.println(nombre);
		nombre = nombre.replace("m" , "M");
		nombre = nombre.replace("b" , "B");
		nombre = nombre.concat(" - Clase E430");
		
		System.out.println(nombre);
		nombre = nombre.toUpperCase();
		
		//System.out.println(nombre + " " + nombre2);
		System.out.println(nombre);
		nombre = nombre.toLowerCase();
		System.out.println(nombre);
	}
	
	
}

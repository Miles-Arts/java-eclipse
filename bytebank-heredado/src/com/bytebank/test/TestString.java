package com.bytebank.test;

import java.awt.SystemColor;

import com.bytebank.modelo.CuentaAhorros;

public class TestString {

	/**
	 * Aprendiendo a usar distintos mpetodos de STRING REPLACE CONCAT TOUPPERCASE
	 * TOLOWERCASE
	 * 
	 * @param args
	 */

	public static void main(String[] args) {

		// En JAVa STRING es un objeto y Java nos ayuda con una sixtais fácil de usar
		String nombre = "mercedes benz";
		// String nombre2 = new String("Clase E430"); //No se usa en el mundo REAL

		System.out.println(nombre);
		nombre = nombre.replace("m", "M");
		nombre = nombre.replace("b", "B");
		nombre = nombre.concat(" - Clase E430");

		System.out.println(nombre);
		nombre = nombre.toUpperCase();

		// System.out.println(nombre + " " + nombre2);
		System.out.println(nombre);
		nombre = nombre.toLowerCase();
		System.out.println(nombre);

		char letra = nombre.charAt(23);
		System.out.println(letra);

		int indice = nombre.indexOf("3");
		System.out.println(indice);

		System.out.println("---------");

		/**
		 * ABAJO ES Ejemplo de clase
		 */
		String nombre1 = "Mario";
		nombre1 = nombre1.replace('o', 'a');
		System.out.println(nombre1);

		System.out.println("---------");

		String texto = "¡Ayuda";
		texto = texto.concat(" - ");
		texto = texto.concat("me ");
		texto = texto.concat("fui ");
		texto = texto.concat("en el ");
		texto = texto.concat("bus ");
		texto = texto.concat("equivocado! ");
		System.out.println(texto);

		System.out.println("---------");

		StringBuilder builder = new StringBuilder("Ayuda");
		builder.append("-");
		builder.append("me ");
		builder.append("subi ");
		builder.append("en el ");
		builder.append("omnibus ");
		builder.append("equivocado ");
		// String texto = builder.toString();
		texto = builder.toString();
		System.out.println(texto);

		System.out.println("---------");

		/**
		 * OBJECT es una súper clase, la más importante en JAVA
		 */
		
		Object cuenta = new CuentaAhorros(20, 30);
		
		printLine("Hola" );
		printLine("Hola " + nombre);
		printLine("Hola " + texto);
		printLine(letra);
		printLine(indice);
		printLine(1);
		printLine(new CuentaAhorros(200, 300));
		//printLine(cuenta);

	}

	public static void printLine(Object valor) {

		//valor = valor.toUpperCase();
		System.out.println(valor.toString());

	}

//	public static void printLine(String valor) {

//		valor = valor.toUpperCase();
//		System.out.println(valor);

//	}
	
//	public static void printLine(char valor) {

		//valor = valor.toUpperCase();
//		System.out.println(valor);

//	}
//	public static void printLine(CuentaAhorros) {

//		//valor = valor.toUpperCase();
//		System.out.println(valor);

//	}

}

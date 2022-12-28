package com.bytebank.test;

import com.bytebank.modelo.Cliente;

public class TestCanelo {
	
	
	public static void main(String[] args) {
		
		Cliente clienteNormal = new Cliente();
		clienteNormal.setNombre("Flavio");

		Cliente clienteVip = new Cliente();
		clienteVip.setNombre("Romulo");

		Object[] refs = new Object[5];
		refs[0]  = clienteNormal;
		refs[1]  = clienteVip;

		System.out.println(((Cliente) refs[1]).getNombre());
	
		
		/**
		 * Cats implicito.
		 * Un DOUBLE puede alojar un INT
		 * ya que cualquier entero cabe dentro de un double
		 */
		int numero = 3;
		double valor = numero; //cast implícito
		System.out.println(valor);
		
		/**
		 * un DOUBLE no cabe en un INT
		 */
		double valor33 = 3.56;
		int numero33 = (int) valor33; //cast explícito es exigido por el compilador
		System.out.println(numero33);
	}
	/*
		public static void main (String[] args) {
		char numero = 2; // Compila correctamente.
		final int otroNumero = 3;
		numero = otroNumero; // Compila correctamente.
		
		System.out.println(numero);
		}*/
/*
	int cuatro = 4;
	int cinco = 5;
	byte numero = (byte) cuatro + cinco;*/
		
}

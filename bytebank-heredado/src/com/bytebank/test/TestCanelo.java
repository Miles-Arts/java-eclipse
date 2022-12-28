package com.bytebank.test;

import com.bytebank.modelo.Cliente;
import com.bytebank.modelo.Cuenta;
import com.bytebank.modelo.CuentaCorriente;

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
		 * 
		 * En este caso, el compilador desecha todo 
		 * el valor fraccionario 3.56 y almacena solo 
		 * el valor entero 3.
		 */
		double valor33 = 3.56;
		int numero33 = (int) valor33; //cast explícito es exigido por el compilador
		System.out.println(numero33);
		
		
		CuentaCorriente cc1 = new CuentaCorriente(22, 33);
		Cuenta cuenta = cc1; //cast implícito
		
		System.out.println(cuenta);
		
		CuentaCorriente cc2 = new CuentaCorriente(22, 33);
		Cuenta cuenta1 = (Cuenta) cc2; //cast explícito mas desnecessário
		System.out.println(cuenta1);
		
		
		/**
		 * Como el cliente no extiende la clase de Cuenta 
		 * ni implementa una interfaz de tipo de Cuenta, 
		 * es imposible que funcione ese cast, 
		 * ya que una referencia de tipo de Cuenta 
		 * nunca puede apuntar a un objeto del 
		 * tipo de Cliente.
		 */
		Cliente cliente = new Cliente();
		Cuenta cuenta2 = (Cuenta) cliente; //imposible, no compila
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

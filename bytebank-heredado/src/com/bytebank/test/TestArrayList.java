package com.bytebank.test;

import java.util.ArrayList;
import java.util.Iterator;

import com.bytebank.modelo.Cuenta;
import com.bytebank.modelo.CuentaCorriente;

public class TestArrayList {

	public static void main(String[] args) {

		// Array List se puede usar sin <> operador DIAMANTE
		// ArrayList lista = new ArrayList<>();

		// Forzar <> a que acepte sólo un tipo de objeto
		// -Generics- Espacios que tiene un objeto como parámetros
		// de la construcción de un objeto, Generics acepta un parámatro por otro
		ArrayList<Cuenta> lista = new ArrayList<>();

		Cuenta cuentaCorriente1 = new CuentaCorriente(88, 99);
		Cuenta cuentaCorriente2 = new CuentaCorriente(13, 42);

		lista.add(cuentaCorriente1);
		lista.add(cuentaCorriente2);

		// se pone el cats para pasar de Lista a CUENTA
		Cuenta obtenerCuenta = (Cuenta) lista.get(0);

		// System.out.println(ObtenerCuenta);
		// System.out.println(lista.add(cuenta2));

		// Un método para llamar lista Array con ARRAYList
		// for ( int i = 0; i < lista.size(); i++) {
		// System.out.println((Cuenta) lista.get(i));
		// }

		// por cada cuenta en la lista imprime
		// FOR se usa operador <> DIAMANTE
		for (Cuenta cuenta : lista) {
			System.out.println(cuenta);
		}
	}
}

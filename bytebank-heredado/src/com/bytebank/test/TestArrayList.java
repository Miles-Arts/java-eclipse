package com.bytebank.test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

import com.bytebank.modelo.Cuenta;
import com.bytebank.modelo.CuentaCorriente;

public class TestArrayList {

	public static void main(String[] args) {

		// Array List se puede usar sin <> operador DIAMANTE
		// ArrayList lista = new ArrayList<>();

		// Forzar <> a que acepte sólo un tipo de objeto
		// -Generics- Espacios que tiene un objeto como parámetros
		// de la construcción de un objeto, Generics acepta un parámatro por otro
		// ArrayList<Cuenta> lista = new ArrayList<>();

		// anexando LIST con CLIENTES
		// List<Cuenta> listaClientes = new LinkedList<>();

		// Implementando java.util.LIST
		// Obligatorio Especificar  || Acá no
		List<Cuenta> lista = new ArrayList<>();

		// Usando Vector funciona modo Hilos
		//List<Cuenta> lista = new Vector<>();
		
		// Referencia Objeto->HEAP || Los números son atributos
		Cuenta cuentaCorriente1 = new CuentaCorriente(11, 22);
		Cuenta cuentaCorriente2 = new CuentaCorriente(13, 42);
		Cuenta cuentaCorriente3 = new CuentaCorriente(11, 22);

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

		// el método CONTAINS en Boolean
		// boolean contiene = lista.contains(cuentaCorriente1);
		lista.contains(cuentaCorriente3);

		// Comparando por REFERENCIA
		if (lista.contains(cuentaCorriente3)) {
			System.out.println("Si es igual (Equals)");
		} else {
			System.out.println("Es otra cuenta");
		}

		// Comparando por VALORES
		// if (cuentaCorriente1.esIgual(cuentaCorriente3)) {
		// System.out.println("Si es igual XD");
		// } else {
		// System.out.println("Es diferete cuenta");
		// }
	}
}

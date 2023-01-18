package com.bytebank.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import com.bytebank.modelo.Cuenta;
import com.bytebank.modelo.CuentaCorriente;

public class TestOrdenarLista {

	public static void main(String[] args) {

		Cuenta cuentaCorriente1 = new CuentaCorriente(22, 33);
		cuentaCorriente1.depositar(333.0);

		Cuenta cuentaCorriente2 = new CuentaCorriente(22, 44);
		cuentaCorriente2.depositar(444.0);

		Cuenta cuentaCorriente3 = new CuentaCorriente(22, 11);
		cuentaCorriente3.depositar(111.0);

		Cuenta cuentaCorriente4 = new CuentaCorriente(22, 22);
		cuentaCorriente4.depositar(222.0);

		List<Cuenta> lista = new ArrayList<Cuenta>();
		lista.add(cuentaCorriente1);
		lista.add(cuentaCorriente2);
		lista.add(cuentaCorriente3);
		lista.add(cuentaCorriente4);
		
		
		System.out.println("Antes de ordenar");
		for (Cuenta cuenta : lista) {
			System.out.println(cuenta);
			
		}

		// Ordenar las cuentas
		// Cualquier clase hija de Cuenta
		// Comparator <? extend Cuenta> c
		// Comparator<Cuenta> comparator = new OrdenadorPorNumeroCuenta(); //
		// Implementacion de la interfaz
		// lista.sort(comparator);
		// Comparator<T>
		
		Comparator<Cuenta> comparator = new OrdenadorPorNumeroCuenta();
		lista.sort(comparator);
	}
}

// creando class para ejmplo de clase
class OrdenadorPorNumeroCuenta implements Comparator<Cuenta> {

	@Override
	public int compare(Cuenta cuentaCorriente1, Cuenta cuentaCorriente2) {

		if (cuentaCorriente1.getNumero() == cuentaCorriente2.getNumero()) {
			return 0;
		} else if (cuentaCorriente1.getNumero() == cuentaCorriente2.getNumero()) {
			return 1;
		} else {
			return -1;
		}

		
	}

}

package com.bytebank.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import com.bytebank.modelo.Cuenta;
import com.bytebank.modelo.CuentaAhorros;
import com.bytebank.modelo.CuentaCorriente;

public class TestOrdenarLista {

	public static void main(String[] args) {

		Cuenta cuentaCorriente1 = new CuentaCorriente(22, 33);
		cuentaCorriente1.depositar(333.0);

		Cuenta cuentaAhorro2 = new CuentaAhorros(22, 44);
		cuentaAhorro2.depositar(444.0);

		Cuenta cuentaCorriente3 = new CuentaCorriente(22, 11);
		cuentaCorriente3.depositar(111.0);

		Cuenta cuentaAhorro4 = new CuentaAhorros(22, 22);
		cuentaAhorro4.depositar(222.0);

		List<Cuenta> lista = new ArrayList<Cuenta>();
		lista.add(cuentaCorriente1);
		lista.add(cuentaAhorro2);
		lista.add(cuentaCorriente3);
		lista.add(cuentaAhorro4);
		
		
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
		
		System.out.println("Después de ordenar");
		for (Cuenta cuenta : lista) {
			System.out.println(cuenta);
			
		}
	}
}

// creando class para ejmplo de clase
class OrdenadorPorNumeroCuenta implements Comparator<Cuenta> {

	@Override
	public int compare(Cuenta o1, Cuenta o2) {

		if (o1.getNumero() == o2.getNumero()) {
			return 0;
		} else if (o1.getNumero() > o2.getNumero()) {
			return 1;
		} else {
			return -1;
		}
	}

}

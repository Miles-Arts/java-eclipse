package com.bytebank.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import com.bytebank.modelo.Cliente;
import com.bytebank.modelo.Cuenta;
import com.bytebank.modelo.CuentaAhorros;
import com.bytebank.modelo.CuentaCorriente;

public class TestOrdenarLista {

	public static void main(String[] args) {

		/*
		 * Cuenta cuentaCorriente1 = new CuentaCorriente(22, 33);
		 * cuentaCorriente1.depositar(333.0);
		 * 
		 * Cuenta cuentaAhorro2 = new CuentaAhorros(22, 44);
		 * cuentaAhorro2.depositar(444.0);
		 * 
		 * Cuenta cuentaCorriente3 = new CuentaCorriente(22, 11);
		 * cuentaCorriente3.depositar(111.0);
		 * 
		 * Cuenta cuentaAhorro4 = new CuentaAhorros(22, 22);
		 * cuentaAhorro4.depositar(222.0);
		 * 
		 * List<Cuenta> lista = new ArrayList<Cuenta>(); lista.add(cuentaCorriente1);
		 * lista.add(cuentaAhorro2); lista.add(cuentaCorriente3);
		 * lista.add(cuentaAhorro4);
		 */

		Cuenta cuentaCorriente1 = new CuentaCorriente(62, 33);
		Cliente clienteCuentaCorriente1 = new Cliente();
		clienteCuentaCorriente1.setNombre("Diego");
		cuentaCorriente1.setTitular(clienteCuentaCorriente1);
		cuentaCorriente1.depositar(333.0);

		Cuenta cuentaAhorros2 = new CuentaAhorros(32, 44);
		Cliente clienteCuentaAhorros2 = new Cliente();
		clienteCuentaAhorros2.setNombre("Renato");
		cuentaAhorros2.setTitular(clienteCuentaAhorros2);
		cuentaAhorros2.depositar(444.0);

		Cuenta cuentaCorriente3 = new CuentaCorriente(22, 11);
		Cliente clienteCuentaCorriente3 = new Cliente();
		clienteCuentaCorriente3.setNombre("Liam");
		cuentaCorriente3.setTitular(clienteCuentaCorriente3);
		cuentaCorriente3.depositar(111.0);

		Cuenta cuentaAhorros4 = new CuentaAhorros(22, 22);
		Cliente clienteCuentaAhorros4 = new Cliente();
		clienteCuentaAhorros4.setNombre("Noél");
		cuentaAhorros4.setTitular(clienteCuentaAhorros4);
		cuentaAhorros4.depositar(222.0);

		List<Cuenta> lista = new ArrayList<Cuenta>();
		lista.add(cuentaCorriente1);
		lista.add(cuentaAhorros2);
		lista.add(cuentaCorriente3);
		lista.add(cuentaAhorros4);

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
		// Comparator<T>*/

		Comparator<Cuenta> comparator = new OrdenadorPorNumeroCuenta();
		lista.sort(comparator);

		//System.out.println("Después de ordenar");
		//for (Cuenta cuenta : lista) {
			//System.out.println(cuenta);
			
		Comparator<Cuenta> comparatorNombreTitular = new OrdenandoPorNombreTitular();
		lista.sort(comparatorNombreTitular);
		
		System.out.println("Después de ordenar por nombre titular");
		for (Cuenta cuenta : lista) {
			System.out.println(cuenta);
		
		}
	}
}

// creando class para ejmplo de clase
class OrdenadorPorNumeroCuenta implements Comparator<Cuenta> {

	@Override
	public int compare(Cuenta o1, Cuenta o2) {
		
	// ABAJO FORMA BÁSICA
		//if (o1.getNumero() == o2.getNumero()) {
		//	return 0;
		//} else if (o1.getNumero() > o2.getNumero()) {
		//	return 1;
		//} else {
		//	return -1;
		//}
		
	// FORMA INTERMEDIA
		//return o1.getNumero() - o2.getNumero();
		
	//FORMA WRAPPER	 optima
		return Integer.compare(o1.getNumero(), o2.getNumero());
	}

}

// create class new example, for classroom 
class OrdenandoPorNombreTitular implements Comparator<Cuenta> {

	@Override
	public int compare(Cuenta o1, Cuenta o2) {

		// o1.getTitular().getNombre().compareTo(o2.getTitular().getNombre());
		return o1.getTitular().getNombre().compareTo(o2.getTitular().getNombre());

		// return 0;
	}

}

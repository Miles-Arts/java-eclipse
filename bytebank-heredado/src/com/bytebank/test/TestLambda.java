package com.bytebank.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.bytebank.modelo.Cliente;
import com.bytebank.modelo.Cuenta;
import com.bytebank.modelo.CuentaAhorros;
import com.bytebank.modelo.CuentaCorriente;

public class TestLambda {

	public static void main(String[] args) {

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

		Cuenta cuentaAhorros4 = new CuentaAhorros(2, 22);
		Cliente clienteCuentaAhorros4 = new Cliente();
		clienteCuentaAhorros4.setNombre("Noél");
		cuentaAhorros4.setTitular(clienteCuentaAhorros4);
		cuentaAhorros4.depositar(222.0);

		List<Cuenta> lista = new ArrayList<Cuenta>();
		lista.add(cuentaCorriente1);
		lista.add(cuentaAhorros2);
		lista.add(cuentaCorriente3);
		lista.add(cuentaAhorros4);

		
		// USANDO LAMBDAS
		lista.sort((Cuenta o1, Cuenta o2) -> Integer.compare(o1.getNumero(), o2.getNumero()));

		
		System.out.println("Antes de ordenar");
		for (Cuenta cuenta : lista) {
			System.out.println(cuenta);
		}

		
		
		lista.forEach((Cuenta cuenta) -> {
			System.out.println(cuenta);
		});
		
		Collections.sort(lista, (cc1, ca2) ->  
			cc1.getTitular().getNombre().compareTo(ca2.getTitular().getNombre())
		);

		
		System.out.println("Después de ordenar por nombre titular");
		for (Cuenta cuenta : lista) {
			System.out.println(cuenta);

		}

		System.out.println("--Después de ordenar por nombre titular");
		for (Cuenta cuenta : lista) {
			System.out.println(cuenta);

		}

		Collections.sort(lista);

		System.out.println("--Después de ordenar por orden Natural");
		for (Cuenta cuenta : lista) {
			System.out.println(cuenta);

		}
	}
}

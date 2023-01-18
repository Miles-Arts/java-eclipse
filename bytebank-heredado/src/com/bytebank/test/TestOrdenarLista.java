package com.bytebank.test;

import java.util.ArrayList;
import java.util.List;

import com.bytebank.modelo.Cuenta;
import com.bytebank.modelo.CuentaCorriente;


public class TestOrdenarLista {

	public static void main(String[] args) {

		Cuenta cuentaCorriente1 =new CuentaCorriente(22, 33);
		cuentaCorriente1.depositar(333.0);
		
		Cuenta cuentaCorriente2 =new CuentaCorriente(22, 44);
		cuentaCorriente2.depositar(444.0);
		
		Cuenta cuentaCorriente3 =new CuentaCorriente(22, 11);
		cuentaCorriente3.depositar(111.0);
		
		Cuenta cuentaCorriente4 =new CuentaCorriente(22, 22);
		cuentaCorriente4.depositar(222.0);
		
		List<Cuenta> lista = new ArrayList<Cuenta>();
		lista.add(cuentaCorriente1);
		lista.add(cuentaCorriente2);
		lista.add(cuentaCorriente3);
		lista.add(cuentaCorriente4);
		
		 // Ordenar las cuentas
	    //             Cualquier clase hija de Cuenta
	    // Comparator <? extend Cuenta> c
	    // Comparator<Cuenta> comparator = new OrdenadorPorNumeroCuenta(); // Implementacion de la interfaz
	    //lista.sort(comparator);
		//Comparator<T>
	}
}


class OrdenadorPorNumeroCuenta implements Comparator<Cuenta> {
	
}








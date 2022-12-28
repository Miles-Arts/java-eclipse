package com.bytebank.test;

import com.bytebank.modelo.Cuenta;
import com.bytebank.modelo.CuentaCorriente;
import com.bytebank.modelo.GuardaCuentas;

public class TestGuardaCuentas {

	public static void main(String[] args) {

		GuardaCuentas guardaCuentas = new GuardaCuentas();

		Cuenta cuentaCorriente = new CuentaCorriente(11, 22);
		guardaCuentas.adicionar(cuentaCorriente);

		//System.out.println(guardaCuentas.adicionar[0]);
		
		Cuenta cuentaCorriente2 = new CuentaCorriente(22, 44);
	
		guardaCuentas.adicionar(cuentaCorriente2);
		
		//guardaCuentas.obtener(1);
		System.out.println(guardaCuentas.obtener(0));
		System.out.println(guardaCuentas.obtener(1));
	}

}

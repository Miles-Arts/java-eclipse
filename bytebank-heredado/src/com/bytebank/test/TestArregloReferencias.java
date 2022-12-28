package com.bytebank.test;

import com.bytebank.modelo.Cuenta;
import com.bytebank.modelo.CuentaAhorros;
import com.bytebank.modelo.CuentaCorriente;

public class TestArregloReferencias {

	public static void main(String[] args) {
		
		CuentaCorriente cuentaCorriente = new CuentaCorriente(23, 44);
		
						//numero del indice:  0   1   2   3   4
						//		array       [ 0 | 1 | 2 | 3 | 4 ]                                 []  
		Object[] cuentas = new Object[5];
		//Cuenta[] cuentas = new Cuenta[5];
		cuentas[1] = cuentaCorriente; 
		
		Cliente cliente = new Clente();
		
		
		CuentaAhorros cuentaAhorros = new CuentaAhorros(44, 55);
		
		cuentas[3] = cuentaAhorros;
		
		//System.out.println(cuentaCorriente);
		System.out.println(cuentas[1]);
		
		cuentas[0] = new CuentaCorriente(11, 99);
		System.out.println(cuentas[0]);
		
		//Nuevo concepto Cast
		CuentaCorriente cuenta = (CuentaCorriente) cuentas[1];
		System.out.println(cuenta);
		
		//System.out.println(cuentaCorriente);
		//System.out.println(cuentasCorrientes[0]);
		
		for (int i = 0; i < cuentas.length; i++) {
			System.out.println(cuentas[i]);
		
			
		}
		
	}
}

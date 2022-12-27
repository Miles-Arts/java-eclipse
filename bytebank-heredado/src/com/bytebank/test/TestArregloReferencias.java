package com.bytebank.test;

import com.bytebank.modelo.CuentaCorriente;

public class TestArregloReferencias {

	public static void main(String[] args) {
		
		CuentaCorriente cuentaCorriente = new CuentaCorriente(23, 44);
		
						//numero del indice:  0   1   2   3   4
						//		array       [ 0 | 1 | 2 | 3 | 4 ]                                 []  
		CuentaCorriente[] cuentasCorrientes = new CuentaCorriente[5];
		
		cuentasCorrientes[1] = cuentaCorriente; 
		
		//System.out.println(cuentaCorriente);
		System.out.println(cuentasCorrientes[1]);
		
		cuentasCorrientes[0] = new CuentaCorriente(11, 99);
		
		//System.out.println(cuentaCorriente);
		//System.out.println(cuentasCorrientes[0]);
		
		for (int i = 0; i < cuentasCorrientes.length; i++) {
			System.out.println(cuentasCorrientes[i]);
		}
		
	}
}

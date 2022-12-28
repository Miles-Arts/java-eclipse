package com.bytebank.test;

import com.bytebank.modelo.Cliente;
import com.bytebank.modelo.Cuenta;
import com.bytebank.modelo.CuentaAhorros;
import com.bytebank.modelo.CuentaCorriente;

public class TestArregloReferencias {

	public static void main(String[] args) {
		
		
		Object[] referencias = new Object[5];
		
		
		
		CuentaCorriente cuentaCorriente = new CuentaCorriente(23, 44);
		
						//numero del indice:  0   1   2   3   4
						//		array       [ 0 | 1 | 2 | 3 | 4 ]                                 []  
		//Object[] cuentas = new Object[5];
		//Cuenta[] cuentas = new Cuenta[5];
		referencias[1] = cuentaCorriente; 
		
		Cliente cliente = new Cliente();
		referencias[4] = cliente;
		
		Cliente obtenido = (Cliente)referencias[4];
		System.out.println(obtenido);
		
		CuentaAhorros cuentaAhorros = new CuentaAhorros(44, 55);
		
		referencias[3] = cuentaAhorros;
		
		//System.out.println(cuentaCorriente);
		System.out.println(referencias[1]);
		
		referencias[0] = new CuentaCorriente(11, 99);
		System.out.println(referencias[0]);
		
		//Nuevo concepto Cast
		CuentaCorriente cuenta = (CuentaCorriente) referencias[1];
		System.out.println(cuenta);
		
		//System.out.println(cuentaCorriente);
		//System.out.println(cuentasCorrientes[0]);
		
		for (int i = 0; i < referencias.length; i++) {
			System.out.println(referencias[i]);
		
			
		}
		
	}
}

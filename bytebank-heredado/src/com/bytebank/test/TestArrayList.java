package com.bytebank.test;

import java.util.ArrayList;

import com.bytebank.modelo.Cuenta;
import com.bytebank.modelo.CuentaCorriente;

public class TestArrayList {

	public static void main(String[] args) {
		
		
		//Array List se puede usar sin <>
		//ArrayList lista = new ArrayList<>();
		
		ArrayList lista = new ArrayList();
		
		Cuenta cuenta = new CuentaCorriente(11, 22);
		Cuenta cuenta2 = new CuentaCorriente(13, 42);
		
		lista.add(cuenta);
		lista.add(cuenta2);
		
		//     se pone el cats para pasar de Lista a CUENTA  
		Cuenta ObtenerCuenta = (Cuenta) lista.get(0);
		
		System.out.println(ObtenerCuenta);
		//System.out.println(lista.add(cuenta2));
		
		
	}

}

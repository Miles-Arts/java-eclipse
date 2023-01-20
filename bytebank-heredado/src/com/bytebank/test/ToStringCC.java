package com.bytebank.test;

import com.bytebank.modelo.CuentaAhorros;
import com.bytebank.modelo.CuentaCorriente;

public class ToStringCC {

	    public static void main(String[] args) {

	        Object cc = new CuentaCorriente(22, 33);
	        Object cp = new CuentaAhorros(33, 22);

	        System.out.println(cc);
	        System.out.println(cp);
	    }
	}
package com.bytebank.test;

import com.bytebank.modelo.Cuenta;

public class CuentaEspecial extends Cuenta{

	@Override
	public void depositar(double valor) {
		// TODO Auto-generated method stub
		super.saldo = 0.0;
	}

}

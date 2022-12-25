package test;

import modelo.SaldoInsuficienteException;

public class TestCuentaExceptionSaldo {

	public static void main(String[] args) {

		modelo.Cuenta cuenta = new modelo.CuentaAhorros(123, 456);
		cuenta.depositar(300);
		try {
			cuenta.retirar(290);
			cuenta.retirar(10);
		} catch (SaldoInsuficienteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

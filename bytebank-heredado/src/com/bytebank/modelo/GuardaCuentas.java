package com.bytebank.modelo;

public class GuardaCuentas {

	/**
	 * Creando OBJETO para guardas muchas cuentas
	 * 
	 * Y Permitirnos agragar cuentas con un método
	 * 
	 * guardaCuentas.adiciona(cuenta)
	 * 
	 * Obtener remover etc
	 */

	Cuenta[] cuenta = new Cuenta[10];
	int indice = 0;

	public void adicionar(Cuenta cuentaCorriente) {
		// TODO Auto-generated method stub
		cuenta[indice] = cuentaCorriente;
		indice++;
	}

	public Cuenta obtener(int indice) {
		return cuenta[indice];
	}

	// public static void main(String[] args) {

	// }

}

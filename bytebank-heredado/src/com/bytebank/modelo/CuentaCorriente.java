package com.bytebank.modelo;
public class CuentaCorriente extends Cuenta {

	public CuentaCorriente(int agencia, int numero) {

		super(agencia, numero);
	}

	// Override indica que el método está siendo sobre escrito

	@Override
	public void retirar(double valor) throws SaldoInsuficienteException {
		// public boolean retirar(double valor) {
		// TODO Auto-generated method stub
		double comision = 0.2;
		super.retirar(valor + comision);
	}

	@Override
	public void depositar(double valor) {
		// TODO Auto-generated method stub

	}
	
	/** ejemplo clase
	 * 
	 */
	@Override
	public String toString() {
	    return "CuentaCorriente, " + super.toString();
	}

}

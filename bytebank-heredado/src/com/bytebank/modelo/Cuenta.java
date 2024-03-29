package com.bytebank.modelo;

/**
 * Mi primera documentación en JAVA Y se llama JAVAdoc
 * 
 * 
 * Cuenta va a crear nuevas instacias de CuentaCorriente
 * 
 * 
 * @version 1.0
 * @Uso Educativo
 * @author Milton Figueredo
 *
 */

//public abstract class Cuenta {
public abstract class Cuenta implements Comparable<Cuenta>{

	// MODIFICADORES DE AccESO
	// public = Accesible desde cualquier parte //El mas permisivo //
	// default = Accesible dentro del paquete // Sólo visible a nivel Package
	// protected = Default + clases hijas // Visible en Package y Herencia
	// private = Sólo desde la clase misma // El más restrictivo

	// private double saldo;
	protected double saldo;
	private int agencia;
	private int numero;
	private Cliente titular = new Cliente();
	//// private static int total = 0;
	private static int total;

	/**
	 * 
	 * Instancia una nueva sin parámetros
	 * 
	 */

	public Cuenta() {

	}

	/**
	 * Instacia una cuenta usando agencia y número
	 * 
	 * @param agencia
	 * @param numero
	 */

	public Cuenta(int agencia, int numero) {

		this.agencia = agencia;
		this.numero = numero;
		System.out.println("Estoy creando una cuenta " + this.numero);

		Cuenta.total++;
	}
	// if (agencia <= 0 ) {
	// System.out.println("No se permite cuentas con 0 o menores a 0");
	// this.agencia = 1;
	// } else {
	// this.agencia = agencia;
	// }

	// total++;

	// System.out.println("Se van creando: " + total + " cuentas");

	// System.out.println("Aqui se crea una nueva cuenta");
	// }

	// No retorna VALOR
	public abstract void depositar(double valor); // {

	// Esta cuenta Esta Cuenta
	// this account this account
	// this object
	// this.saldo = this.saldo + valor;
	// this.saldo += valor;

	// }

	/**
	 * Este método retira dinero de la cuenta y si ocurre un error, devuelve una
	 * excepción.
	 * 
	 * @param valor
	 * @throws SaldoInsuficienteException
	 */

	// Retorna Valor
	public void retirar(double valor) throws SaldoInsuficienteException {
		// public boolean retirar(double valor) {

		// if (this.saldo >= valor) {
		// this.saldo = this.saldo - valor;
		if (this.saldo < valor) {
			// El control de ERRORES va al inicio del Método
			throw new SaldoInsuficienteException("No tienes Saldo");
			// this.saldo -= valor;
		}
		this.saldo -= valor;

		// return true;
		// }
		// return false;

	}

	public boolean transferir(double valor, Cuenta cuenta) throws SaldoInsuficienteException {

		if (this.saldo >= valor) {
			this.retirar(valor);
			// this.saldo = this.saldo - valor;
			// this.saldo -= valor;
			cuenta.depositar(valor);
			// cuenta.saldo = cuenta.saldo + valor;

			return true;
		} else {
			return false;
		}
	}

	public double getSaldo() {

		return this.saldo;

	}

	public void setAgencia(int agencia) {

		if (agencia > 0) {
			this.agencia = agencia;
		} else {
			System.out.println("No esta permitido valores negativos");
		}
	}

	public int getAgencia() {
		return agencia;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public Cliente getTitular() {
		return titular;
	}

	public static int getTotal() {

		return Cuenta.total;
	}

	@Override
	public String toString() {

		String cuenta = "Numero: " + this.numero + ", Agencia: " + this.agencia + ", Titular: " + this.titular.getNombre();

		// TODO Auto-generated method stub
		return cuenta;
	}
	
	// Numero de cuenta
	public int getNumero() {
		return numero;
	}

	void setNumero(int numero) {
		if (numero > 0) {
			this.numero = numero;
		}
	}

	
	//Equals hace éste método
	//public boolean esIgual(Cuenta cuenta) {
		//return this.agencia == cuenta.getAgencia() && this.numero == cuenta.getNumero();
	//}
	
	
	
	//AÑADO @Override para que EQUALS 
	//sepa que estoy sobre escribiendo un método
	//y se CATS el método object
	@Override
	public boolean equals(Object obj) {
		//equal hace comparación 
		//basada en VALORES y NO en referencias.
		Cuenta cuenta = (Cuenta) obj;
		return this.agencia == cuenta.getAgencia() && this.numero == cuenta.getNumero();

	}
	
	@Override
	public int compareTo(Cuenta o) {
		//ORDEN NATURAL: Numero de Agencia
		
		//return Integer.compare(this.agencia, o.getAgencia());
	
		// Orden Natural: Saldo
		
		return Double.compare(this.getSaldo(), o.getSaldo());
	}
	

	// private int getNumero() {
	// TODO Auto-generated method stub
	// return 0;
	// }

	/**
	 * ejemplo clase
	 */

	// @Override
	// public String toString() {
	// return "Numero: " + this.numero + ", Agencia: " + this.agencia;
	// }
}

//entidad Cuenta :

class Cuenta {

	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular = new Cliente();
	
	
	public Cuenta() {
		System.out.println("Aqui se crea una nueva cuenta");
	}

	// No retorna VALOR
	public void depositar(double valor) {

		// Esta cuenta Esta Cuenta
		// this account this account
		// this object
		// this.saldo = this.saldo + valor;
		this.saldo += valor;

	}

	// Retorna Valor
	public boolean retirar(double valor) {

		if (this.saldo >= valor) {
			// this.saldo = this.saldo - valor;
			this.saldo -= valor;

			return true;
		}
		return false;
	}

	public boolean transferir(double valor, Cuenta cuenta) {

		if (this.saldo >= valor) {
			this.saldo = this.saldo - valor;
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
			System.out.println("No esta permitido valores negativos") ;
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
}

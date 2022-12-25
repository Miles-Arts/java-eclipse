//entidad Cuenta :

public abstract class  Cuenta {

	//private double saldo;
	protected double saldo;
	private int agencia;
	private int numero;
	private Cliente titular = new Cliente();
	////private static int total = 0;
	private static int total;
	
	public Cuenta() {
		
	}
	
	public Cuenta(int agencia, int numero) {
		
	        this.agencia = agencia;
	        this.numero = numero;
	        System.out.println("Estoy creando una cuenta " + this.numero);

	        Cuenta.total ++;
	    }
		//if (agencia <= 0 ) {
			//System.out.println("No se permite cuentas con 0 o menores a 0");
			//this.agencia = 1;
		//} else {
		//	this.agencia = agencia;
		//}
		
		//total++;
		
		//System.out.println("Se van creando: " + total + " cuentas");
		
		//System.out.println("Aqui se crea una nueva cuenta");
	//}

	// No retorna VALOR
	public abstract void depositar(double valor); //{

		// Esta cuenta Esta Cuenta
		// this account this account
		// this object
		// this.saldo = this.saldo + valor;
		//this.saldo += valor;

	//}

	// Retorna Valor
	public void retirar(double valor) throws SaldoInsuficienteException {
	//public boolean retirar(double valor) {
		

		//if (this.saldo >= valor) {
			// this.saldo = this.saldo - valor;
		if (this.saldo < valor) {
			//El control de ERRORES va al inicio del Método
			throw new SaldoInsuficienteException("No tienes Saldo");
		}
			this.saldo -= valor;

		//	return true;
		//}
		//return false;

	}
		
	public boolean transferir(double valor, Cuenta cuenta) {

		if (this.saldo >= valor) {
			this.retirar(valor);
			//this.saldo = this.saldo - valor;
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
	
	public static int getTotal() {
		
		return Cuenta.total;
	}
}

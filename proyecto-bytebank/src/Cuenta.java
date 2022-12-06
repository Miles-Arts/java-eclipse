//entidad Cuenta :

class Cuenta {

	private double saldo;
	int agencia;
	int numero;
	Cliente titular;
	
	
	//No retorna VALOR
	public void depositar(double valor) {
		
		//Esta cuenta			Esta Cuenta
		//this account			this account
		//this object
		//this.saldo = this.saldo + valor;
		this.saldo += valor;
		
	}
	
	
	//Retorna Valor
	public boolean retirar(double valor) {
		
		if (this.saldo  >= valor) {
			//this.saldo = this.saldo - valor;
			this.saldo -= valor;
			
			return true;
		} 
			return false;
	}
	
	public boolean transferir(double valor, Cuenta cuenta) {
		
		if (this.saldo >= valor) {
			this.saldo = this.saldo - valor;
			//this.saldo -= valor;
			cuenta.depositar(valor);
			//cuenta.saldo = cuenta.saldo + valor;
			
			return true;
		} else {
			return false;
		}
		
	}
	
	public double obtenerSaldo() {
		
		return this.saldo;
		
	}
	

}

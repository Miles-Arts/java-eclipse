//entidad Cuenta :

class Cuenta {

	double saldo;
	int agencia;
	int numero;
	String titular;

	void depositar(double valor) {
		 saldo = saldo + valor;
	}

}

package modelo;
public class CuentaAhorros extends Cuenta {

	public CuentaAhorros(int agencia, int numero) {
		super(agencia, numero);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void depositar(double valor) {
		// TODO Auto-generated method stub
		this.saldo = this.saldo + valor;
	}

}

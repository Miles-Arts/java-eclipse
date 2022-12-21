
public class CuentaCorriente extends Cuenta {

	
	public  CuentaCorriente(int agencia, int numero) {
		
		super(agencia, numero);
	}
	
	
	// Override indica que el método está siendo sobre escrito
	
	@Override
	public boolean retirar(double valor) {
		// TODO Auto-generated method stub
		double comision = 0.2;
		return super.retirar(valor + comision);
	}


	@Override
	public void depositar(double valor) {
		// TODO Auto-generated method stub
		
	}
	
	
}


public class PruebaAcceso {
	
	public static void main(String[] args) {
		
		Cuenta cuenta = new Cuenta();
		cuenta.setAgencia(22);
		//cuenta.saldo = 200;
		cuenta.depositar(400);
		cuenta.retirar(300);
		//cuenta.saldo = cuenta.saldo - (); 
		
		System.out.println(cuenta.getSaldo());
		System.out.println(cuenta.getAgencia());
	
	
	}
	

}

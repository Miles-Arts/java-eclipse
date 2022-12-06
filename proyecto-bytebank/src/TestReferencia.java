
public class TestReferencia {
	
	public static void main(String[] args) {
		
		Cuenta primeraCuenta = new Cuenta();
		
		primeraCuenta.obtenerSaldo = 200;
		
		Cuenta segundaCuenta = primeraCuenta;
		
		segundaCuenta.obtenerSaldo = 100;
	
		System.out.println("Saldo primera " + "Cuenta: "
		 + primeraCuenta.obtenerSaldo);
		
		System.out.println("Saldo segunda " + "Cuenta: "
				 + segundaCuenta.obtenerSaldo);
		
		segundaCuenta.obtenerSaldo += 400; 
		
		System.out.println("Saldo primera " + "Cuenta: "
				 + primeraCuenta.obtenerSaldo);
		
		System.out.println(primeraCuenta);
		System.out.println(segundaCuenta);
		
		
		if (primeraCuenta == segundaCuenta) {
			System.out.println("Son el mismo objeto");
			
		} else {
			System.out.println("Son diferente");
		}
		
	}
	
}

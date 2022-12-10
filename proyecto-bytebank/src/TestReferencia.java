
public class TestReferencia {
	
	public static void main(String[] args) {
		
		Cuenta primeraCuenta = new Cuenta();
		
		primeraCuenta.getSaldo = 200;
		
		Cuenta segundaCuenta = primeraCuenta;
		
		segundaCuenta.getSaldo = 100;
	
		System.out.println("Saldo primera " + "Cuenta: "
		 + primeraCuenta.getSaldo);
		
		System.out.println("Saldo segunda " + "Cuenta: "
				 + segundaCuenta.getSaldo);
		
		segundaCuenta.getSaldo += 400; 
		
		System.out.println("Saldo primera " + "Cuenta: "
				 + primeraCuenta.getSaldo);
		
		System.out.println(primeraCuenta);
		System.out.println(segundaCuenta);
		
		
		if (primeraCuenta == segundaCuenta) {
			System.out.println("Son el mismo objeto");
			
		} else {
			System.out.println("Son diferente");
		}
		
	}
	
}

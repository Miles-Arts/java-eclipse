
public class CrearCuenta {

	public static void main(String[] args) {

		// Variable          = Valor
		
		Cuenta primeraCuenta = new Cuenta();

		primeraCuenta.obtenerSaldo = 400;
		// primeraCuenta.pais = "Alemania"; NO COMPILA

		System.out.println(primeraCuenta.obtenerSaldo);

		Cuenta segundaCuenta = new Cuenta();
		segundaCuenta.obtenerSaldo = 400;
		System.out.println(segundaCuenta.obtenerSaldo);
		System.out.println(segundaCuenta.agencia);
		
		
		if (primeraCuenta == segundaCuenta) {
			System.out.println("Son el mismo objeto");
			
		} else {
			System.out.println("Son diferente");
		}
		
	}
}

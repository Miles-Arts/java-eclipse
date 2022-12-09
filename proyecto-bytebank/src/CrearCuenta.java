
public class CrearCuenta {

	public static void main(String[] args) {

		// Variable          = Valor
		
		Cuenta primeraCuenta = new Cuenta();

		primeraCuenta.saldo = 400;
		// primeraCuenta.pais = "Alemania"; NO COMPILA

		System.out.println(primeraCuenta.getSaldo);

		Cuenta segundaCuenta = new Cuenta();
		segundaCuenta.depositar(400);
		System.out.println(segundaCuenta.saldo);
		//System.out.println(segundaCuenta.agencia);
		
		
		if (primeraCuenta == segundaCuenta) {
			System.out.println("Son el mismo objeto");
			
		} else {
			System.out.println("Son diferente");
		}
		
	}
}

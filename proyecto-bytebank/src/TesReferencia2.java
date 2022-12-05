
public class TesReferencia2 {

	public static void main(String[] args) {

		Cliente diego = new Cliente();
		diego.nombre = "Diego";
		diego.documento = "12345";
		diego.telefono = "09876";

		Cuenta cuentaDeDiego = new Cuenta();
		cuentaDeDiego.agencia = 1;
		cuentaDeDiego.titular = diego;

		System.out.println(cuentaDeDiego.titular.documento);
		System.out.println(cuentaDeDiego.titular);
		System.out.println(diego);

	}

}

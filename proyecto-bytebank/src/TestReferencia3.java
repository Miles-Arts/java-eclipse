
public class TestReferencia3 {
	
	public static void main(String[] args) {
		
		Cuenta cuentaDeDiego = new Cuenta();
		//Cliente cliente = new Cliente();
		
		//cuentaDeDiego.titular = cliente;
		cuentaDeDiego.titular = new Cliente();
		cuentaDeDiego.titular.nombre = "Diego";
		
		System.out.println(cuentaDeDiego.titular.nombre);
		System.out.println(cuentaDeDiego.titular);
		

	}
}

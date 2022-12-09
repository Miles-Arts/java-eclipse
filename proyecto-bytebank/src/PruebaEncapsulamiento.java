
public class PruebaEncapsulamiento {

	public static void main(String[] args) {
		
		Cuenta cuenta = new Cuenta();
		
		Cliente cliente = new Cliente();
		cliente.setNombre("Diego"); 
		cliente.setDocumento("A1A2A3");
		
				
		System.out.println(cliente);
		
	}
	
}

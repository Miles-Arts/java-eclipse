
public class PruebaEncapsulamiento {

	public static void main(String[] args) {
		
		Cuenta cuenta = new Cuenta();
		
		Cliente cliente = new Cliente();
		cliente.setNombre("Diego"); 
		cliente.setDocumento("A1A2A3");
		
				
		cuenta.setTitular(cliente);
		
		Cliente titular = cuenta.getTitular();
		
		System.out.println(cliente);
		System.out.println(titular);
		System.out.println(cuenta.getTitular());
		//System.out.println(cliente.getNombre());
		//System.out.println(cuenta.getTitular().getNombre());
		
	}
	
}

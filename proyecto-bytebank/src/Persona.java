
public class Persona {

	String nombre;
	String numeroIdentidad;
	int edad;
	Direccion direccion;
}

public class Direccion {

	String calle;
	String complemento;
	String numero;
	String vecindario;
	String ciudad;
	String codigoPostal;

}

public class Programa {

	public static void main(String args[]) {

		Persona p = new Persona();
		p.nombre = "Paulo";
		p.direccion.calle = "Avenida XYZ";
	}
}
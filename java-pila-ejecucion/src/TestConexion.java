
public class TestConexion {

	public static void main(String[] args) {
		
		Conexion con = new Conexion();
		
		try {
			
			con.leerDatos();
			con.cerrar();
			
		} catch (IllegalStateException ex) {
			// TODO: handle exception
			System.out.println("---Recibiendo Exception---");
			ex.printStackTrace();
		}
		
		
	}
}

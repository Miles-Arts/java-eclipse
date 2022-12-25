
public class TestConexion {

	public static void main(String[] args) throws Exception  {
		
		try (Conexion con = new Conexion())  {
			con.leerDatos();
		}
	
		/*
		//Conexion con = new Conexion();
		Conexion con = null;
		
		try {
			con = new Conexion();
			con.leerDatos();
			//con.cerrar(); acá no se debería cerrar

		} catch (IllegalStateException ex) {
			
			// TODO: handle exception
			//System.out.println("---Recibiendo Exception---");
			ex.printStackTrace();
			//con.cerrar(); acá no se debería cerrar
			
		} finally {
			
			System.out.println("---Ejecutando Finally---");
			
			if (con != null ) {
				
				con.cerrar();
			}	//con.cerrar();		
		} */
	} 
}

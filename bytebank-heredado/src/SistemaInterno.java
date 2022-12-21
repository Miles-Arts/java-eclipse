
public class SistemaInterno {

	public boolean autentica(Gerente gerente) {

		private String clave = "12345";

		boolean puedeIniciarSesion = gerente.iniciarSesion(clave);
		// return false;
		if (puedeIniciarSesion) {
			System.out.println("Login exitoso");
			return true;
		} else {
			System.out.println("Clave Incorrecta");
			return false;
		} 
	}
	
}

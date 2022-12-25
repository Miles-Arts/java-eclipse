package modelo;
public class SistemaInterno {

	private String clave = "12AB";
	
	public boolean autentica(Autenticable gerente) {
	//public boolean autentica(Gerente gerente) {
		
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

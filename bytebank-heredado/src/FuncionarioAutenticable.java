
public class FuncionarioAutenticable {

	private String clave;

	public void setClave(String clave) {
		this.clave = clave;
	}

	public boolean iniciarSesion(String clave) {
		return clave == "12AB";
	}

}

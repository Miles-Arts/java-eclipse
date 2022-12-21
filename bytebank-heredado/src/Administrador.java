
public class Administrador extends Funcionario {

	private String clave;

	public void setClave(String clave) {
		this.clave = clave;
	}

	public boolean iniciarSesion(String clave) {
		return clave == "12AB";
	}

	@Override
	public double getBonificacion() {
		// TODO Auto-generated method stub
		return 0;
	}

}

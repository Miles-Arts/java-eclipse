
public class Administrador extends Funcionario implements Autenticable {

	private AutenticacionUtil util;

	
	public Administrador() {
		this.util = new AutenticacionUtil();
	}
	
	@Override
	public double getBonificacion() {
		// TODO Auto-generated method stub
		return this.getSalario();
	}

	@Override
	public void setClave(String clave) {
		
		this.util.setClave(clave);
		//this.clave = clave;
		// TODO Auto-generated method stub
	}

	@Override
	public boolean iniciarSesion(String clave) {

		return this.util.iniciarSesion(clave);
		//return this.clave == clave;
	}

}

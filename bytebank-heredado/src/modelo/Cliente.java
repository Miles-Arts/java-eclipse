package modelo;
public class Cliente implements Autenticable{
	
	private String nombre;
	//String titular;
	private String documento;
	private String telefono;
	
	private AutenticacionUtil util;
	//private String clave;
	
	public Cliente() {
		this.util = new AutenticacionUtil();
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDocumento() {
		return documento;
	}
	public void setDocumento(String documento) {
		this.documento = documento;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	//@Override
	//public double getBonificacion() {
		// TODO Auto-generated method stub
		//return 0;
	//}
	
	@Override
	public boolean iniciarSesion(String clave) {
		
		return this.util.iniciarSesion(clave);
		//return this.clave == clave;
		//if(this.clave == clave ) {
			
			//return true;
		//}
		// TODO Auto-generated method stub
		//return false;
	}
	
	@Override
	public void setClave(String clave) {
		
		this.setClave(clave);
		//this.clave = clave;
		// TODO Auto-generated method stub
		
	}
	
	
}

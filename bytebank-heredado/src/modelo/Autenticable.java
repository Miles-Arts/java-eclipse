package modelo;

public  interface Autenticable {
	// En INTERFACE todos los métodos son abstractos 
	//Una INTERFACE puede extends de otra INTERFACE
	// Una INTERFACE  no puede extenender de otra clase
	
	
	//private String clave;

	public  void setClave(String clave); //{
		//this.clave = clave;
	//}

	public  boolean iniciarSesion(String clave); //{
		//return clave == "12AB";
	//}

	//@Override
	//public double getBonificacion() {
		// TODO Auto-generated method stub
		//return 0;
	//}

}

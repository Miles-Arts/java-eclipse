package test;
public class TestControlBonificacion {

	
	public static void main(String[] args) {
		
		modelo.Funcionario diego = new modelo.Contador();
		diego.setSalario(2000);
		
		
		modelo.Gerente jimena = new modelo.Gerente();
		jimena.setSalario(10000);
		
		
		modelo.Contador alexis = new modelo.Contador();
		alexis.setSalario(5000);
		
		
		modelo.ControlBonificacion controlBonificacion = new modelo.ControlBonificacion();
		
		controlBonificacion.registrarSalario(diego);
		controlBonificacion.registrarSalario(jimena);
		controlBonificacion.registrarSalario(alexis);		
		
	}
	
	
}

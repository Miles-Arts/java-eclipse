package test;
public class TestReferencias {

	public static void main(String[] args) {

		// Funcionario funcionario = new Funcionario();

		// El elemento más generico o general puede
		// ser adaptado al elemento más especifico o particular
		modelo.Funcionario funcionario = new modelo.Gerente();
		funcionario.setNombre("Diego");

		modelo.Gerente gerente = new modelo.Gerente();
		gerente.setNombre("Jimena");

		funcionario.setSalario(2000);
		gerente.setSalario(10000);
		
		//funcionario.iniciarSesion();

	}

}

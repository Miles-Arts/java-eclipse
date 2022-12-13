
public class TestReferencias {

	public static void main(String[] args) {

		// Funcionario funcionario = new Funcionario();

		// El elemento más generico o general puede
		// ser adaptado al elemento más especifico o particular
		Funcionario funcionario = new Gerente();
		funcionario.setNombre("Diego");

		Gerente gerente = new Gerente();
		gerente.setNombre("Jimena");

		funcionario.setSalario(2000);
		gerente.setSalario(10000);
		
		funcionario.iniciarSesion();

	}

}

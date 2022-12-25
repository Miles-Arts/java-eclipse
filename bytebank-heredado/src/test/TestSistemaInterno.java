package test;
public class TestSistemaInterno {

	public static void main(String[] args) {
		modelo.SistemaInterno sistema = new modelo.SistemaInterno();
		modelo.Gerente gerente1 = new modelo.Gerente();
		modelo.Administrador admin = new modelo.Administrador();
		
		sistema.autentica(gerente1);
		sistema.autentica(admin);
	}
}

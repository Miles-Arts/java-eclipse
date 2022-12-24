
public class TestCuentaExceptionChecked {

	public static void main(String[] args) {
		
		Cuenta cuenta = new Cuenta();
		
		try {
			cuenta.deposita();
		} catch (MiException e) {
			//System.out.println("Exception atrapado");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}

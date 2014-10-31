import java.io.ObjectInputStream.GetField;
import java.rmi.Naming;

public class Cliente {

	Opciones menu;
	int resultado;
	
	public static void main(String[] args) {
		new Cliente();
		
	}
	
	public boolean getStub(){
		try {
			menu = (Opciones)Naming.lookup("//localhost/Sumas");
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

    public Cliente(){
    	if (getStub()) {
			try {
				resultado = menu.sumar(4,22);
				System.out.println(resultado);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
    }
    

}

import java.rmi.*;
import java.rmi.registry.LocateRegistry;

public class Server {
	
	Suma suma;
	
	public static void main(String[] args){
		
		new Server();
	}

	public Server(){
		iniciar();
	}
	
	public void iniciar(){
		try {
			System.out.println("local regstry");
			//System.setSecurityManager(new RMISecurityManager());
			LocateRegistry.createRegistry(1099);
			Suma hola = new Suma();
			Naming.rebind("//localhost/Sumas", hola);
			System.out.println("Fijado en localhost");
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error aca");
			e.printStackTrace();
			
		}
	}
}

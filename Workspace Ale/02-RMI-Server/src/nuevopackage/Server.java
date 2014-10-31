package nuevopackage;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

import paquete.Opciones;

public class Server {
	
	Opciones negocioRemoto;
	public static void main(String[] args){
		
		new Server();
	}

	public Server(){
		iniciar();
	}
	
	public void iniciar(){
		try {
			System.out.println("local regstry");
			negocioRemoto = new NegocioRemoto();
			//System.setSecurityManager(new RMISecurityManager());
			LocateRegistry.createRegistry(1099);
			//Elaborado elaborado = new Elaborado();
			Naming.rebind("//localhost/Sumas", negocioRemoto);
			System.out.println("Fijado en localhost");
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error aca");
			e.printStackTrace();
			
		}
	}
}

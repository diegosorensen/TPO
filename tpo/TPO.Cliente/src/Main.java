import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RMISecurityManager;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.List;


import Interface.Constants;
import Interface.InterfaceEnvio;


public class Main {
	private InterfaceEnvio remoteInterface;
	public static void main(String[] args) throws RemoteException, NotBoundException, MalformedURLException
	{
		new Main();
	}
	
    public boolean getStub() {
    	
    	try {
    		System.setProperty("java.security.policy","C:/Users/Pablo/Desktop/UADE/2014/2do Cuatrimestre/Aplicaciones Distribuidas/2C2014/TPO/Code/TPO.Cliente/src/security.policy");
    		if(System.getSecurityManager()==null)
    			System.setSecurityManager(new RMISecurityManager());
    		remoteInterface = (InterfaceEnvio)Naming.lookup("//localhost/" + Constants.RMI_ID);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
    }
	
    public Main() throws RemoteException{
    	if(getStub()){
			
			//Llamada a las interfaces...
    	}
	}

}

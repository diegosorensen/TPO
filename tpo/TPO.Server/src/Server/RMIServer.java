package Server;

import java.io.IOException;

import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RMISecurityManager;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;


import Controller.Sistema;
import Interface.Constants;
import Interface.InterfaceEnvio;

public class RMIServer {

	/**
	 * @param args
	 * @throws AlreadyBoundException 
	 * @throws IOException 
	 */
	private InterfaceEnvio remote;
	public static void main(String[] args) throws AlreadyBoundException, IOException {
		System.setProperty("java.security.policy","C:/Users/Pablo/Desktop/UADE/2014/2do Cuatrimestre/Aplicaciones Distribuidas/2C2014/TPO/Code/TPO.Cliente/src/security.policy");
		if(System.getSecurityManager()==null)
			System.setSecurityManager(new RMISecurityManager());
		new RMIServer();
	}
	
	public RMIServer() throws RemoteException, MalformedURLException
	{
		start();
	}
	
	public void start() throws RemoteException, MalformedURLException
	{	
		try{
			LocateRegistry.createRegistry(1099);
			remote = new Sistema();
	        Naming.rebind ("//localhost/" + Constants.RMI_ID, remote);
	        System.out.println("Fijado en //localhost/" + Constants.RMI_ID);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

package Controller;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;


import Interface.InterfaceEnvio;

public class Sistema extends UnicastRemoteObject implements InterfaceEnvio  {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public Sistema() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	//Llamadas a las funciones de los DAO

}
	


import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;


public class Suma extends UnicastRemoteObject implements Opciones{

	private static final long serialVersionUID = 1L;


	public Suma() throws RemoteException { }


	public int sumar(int a, int b) throws RemoteException{
		int resultado = a+b;
		return resultado;
	}
}
package paquete;
import java.rmi.Remote;
import java.rmi.RemoteException;


public interface Opciones extends Remote{
	
public int sumar(int a, int b) throws RemoteException;

public void grabar(int codProducto, String descripcion, double precioVenta)throws RemoteException;
}


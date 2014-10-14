import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import bean.SRV.PersistenciaSRV;
import entity.Elaborado;


public class Grabar extends UnicastRemoteObject implements Opciones{

	private static final long serialVersionUID = 1L;


	public Grabar() throws RemoteException { }


	public void grabar(int codProducto, String descripcion, double precioVenta) {
		Elaborado elaborado = new Elaborado();
		elaborado.setCodProducto(codProducto);
		elaborado.setDescripcion(descripcion);
		elaborado.setPrecioVenta(precioVenta);
		
		new PersistenciaSRV().grabarElaborado(elaborado);
	};


	@Override
	public int sumar(int a, int b) throws RemoteException {
		// TODO Auto-generated method stub
		return 0;
	}

	
}


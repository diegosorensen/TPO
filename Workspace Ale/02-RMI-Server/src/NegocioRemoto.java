import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;
import java.sql.Date;

import bean.SRV.PersistenciaSRV;
import entity.Elaborado;

public class NegocioRemoto extends UnicastRemoteObject implements Opciones {
	protected NegocioRemoto() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	private static final long serialVersionUID = 4516149167297806966L;
	
	@Override
	public void grabar(int codProducto, String descripcion, double precioVenta) {
		Elaborado elaborado = new Elaborado();
		elaborado.setCodProducto(codProducto);
		elaborado.setDescripcion(descripcion);
		elaborado.setPrecioVenta(precioVenta);
		
		new PersistenciaSRV().grabarElaborado(elaborado);
		
	}

	@Override
	public int sumar(int a, int b) throws RemoteException {
		// TODO Auto-generated method stub
		return 0;
	}

	

}

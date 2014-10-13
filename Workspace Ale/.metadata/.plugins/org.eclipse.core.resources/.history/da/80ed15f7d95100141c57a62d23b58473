package bean.SRV;

import java.util.List;

import bean.Articulos;
import bean.Proveedor;
import bean.Venta;
import bean.DAO.HibernateArticuloDAO;
import bean.DAO.HibernateProveedorDAO;
import bean.DAO.HibernateVentaDAO;

public class VentaSRV {
	private static HibernateVentaDAO dao;
	static {
		dao = HibernateVentaDAO.getInstancia();
	}
	
	public void grabarVenta(Venta venta){
		dao.grabarVenta(venta);
	}


	public List<Venta> leerVentas(){
		return dao.leerVentas();
	}


	public List<Venta> leerVProv(int cuit) {
		return dao.leerVProv(cuit);
	}

	
	
	
}

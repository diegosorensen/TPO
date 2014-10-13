package bean.SRV;

import java.util.List;

import bean.Articulos;
import bean.Proveedor;
import bean.DAO.HibernateArticuloDAO;
import bean.DAO.HibernateProveedorDAO;

public class ProveedorSRV {
	private static HibernateProveedorDAO dao;
	static {
		dao = HibernateProveedorDAO.getInstancia();
	}
	
	public void grabarProveedor(Proveedor proveedore){
		dao.grabarProveedor(proveedore);
	}

	public Proveedor leerProveedor(Proveedor provDB) {
		return dao.leerProveedor(provDB);
		 
		
	}

	
	
	
}

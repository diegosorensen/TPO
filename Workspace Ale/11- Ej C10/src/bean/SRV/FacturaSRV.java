package bean.SRV;

import java.util.List;

import bean.Proveedor;
import bean.Articulos;
import bean.DAO.HibernateArticuloDAO;
import bean.DAO.HibernateFacturaDAO;



public class FacturaSRV {
	private static HibernateFacturaDAO dao;
	static {
		dao = HibernateFacturaDAO.getInstancia();
	}
	
	public void grabarFactura(List<Articulos> facturas){
		dao.grabarFactura(facturas);
		
	}
	
	
}

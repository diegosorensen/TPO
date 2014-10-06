package bean.SRV;

import java.util.List;

import bean.Articulo;
import bean.Factura;
import bean.DAO.HibernateArticuloDAO;
import bean.DAO.HibernateFacturaDAO;



public class FacturaSRV {
	private static HibernateFacturaDAO dao;
	static {
		dao = HibernateFacturaDAO.getInstancia();
	}
	
	public void grabarFactura(List<Factura> facturas){
		dao.grabarFactura(facturas);
		
	}
	
	
}

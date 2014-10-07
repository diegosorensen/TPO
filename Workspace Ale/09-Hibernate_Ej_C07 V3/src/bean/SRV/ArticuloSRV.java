package bean.SRV;

import java.util.List;

import bean.Articulos;
import bean.Proveedor;
import bean.DAO.HibernateArticuloDAO;

public class ArticuloSRV {
	private static HibernateArticuloDAO dao;
	static {
		dao = HibernateArticuloDAO.getInstancia();
	}
	
	public void grabarArticulo(List<Articulos> articulos){
		dao.grabarArticulo(articulos);
	}
	
	
}

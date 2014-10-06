package bean.SRV;

import java.util.List;

import bean.Articulo;
import bean.DAO.HibernateArticuloDAO;

public class ArticuloSRV {
	private static HibernateArticuloDAO dao;
	static {
		dao = HibernateArticuloDAO.getInstancia();
	}
	
	public void grabarArticulo(List<Articulo> articulos){
		dao.grabarArticulo(articulos);
	}
	
	
}

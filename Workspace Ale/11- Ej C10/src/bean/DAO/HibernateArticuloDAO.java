package bean.DAO;

import hbt.hibernateUtil;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;







import bean.Articulos;
import bean.Proveedor;

public class HibernateArticuloDAO {
	
	private static HibernateArticuloDAO instancia = null;
	private static SessionFactory sf = null;
	
	public static HibernateArticuloDAO getInstancia(){
		if(instancia == null){
			sf = hibernateUtil.getSessionFactory();
			instancia = new HibernateArticuloDAO();
		}
		return instancia;
	}
	
	
	public void grabarArticulo(Articulos articulo){
		Session session = sf.openSession();
		session.beginTransaction();
		
		session.persist(articulo);
		session.flush();
		session.getTransaction().commit();
		session.close();
	}
}













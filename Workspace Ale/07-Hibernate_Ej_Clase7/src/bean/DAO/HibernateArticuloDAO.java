package bean.DAO;

import hbt.hibernateUtil;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;






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
	

	
	public void grabarArticulo(List<Proveedor> articulos){
		Session session = sf.openSession();
		session.beginTransaction();
		for(Proveedor articulo:articulos)
			session.persist(articulo);
		session.flush();
		session.getTransaction().commit();
		session.close();
	}
}













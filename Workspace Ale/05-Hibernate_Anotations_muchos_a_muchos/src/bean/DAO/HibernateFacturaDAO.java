package bean.DAO;

import hbt.hibernateUtil;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;







import bean.Articulo;
import bean.Factura;

public class HibernateFacturaDAO {
	
	private static HibernateFacturaDAO instancia = null;
	private static SessionFactory sf = null;
	
	public static HibernateFacturaDAO getInstancia(){
		if(instancia == null){
			sf = hibernateUtil.getSessionFactory();
			instancia = new HibernateFacturaDAO();
		}
		return instancia;
	}
	

	
	public void grabarFactura(List<Factura> facturas){
		Session session = sf.openSession();
		session.beginTransaction();
		for(Factura factura:facturas)
			session.persist(factura);
		session.flush();
		session.getTransaction().commit();
		session.close();
	}
}













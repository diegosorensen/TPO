package bean.DAO;

import hbt.hibernateUtil;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import entity.Elaborado;

public class HibernateDAO {
	
	private static HibernateDAO instancia = null;
	private static SessionFactory sf = null;
	
	public static HibernateDAO getInstancia(){
		if(instancia == null){
			sf = hibernateUtil.getSessionFactory();
			instancia = new HibernateDAO();
		}
		return instancia;
	}
	

	
	public void grabarElaborado(Elaborado elaborado){
		Session session = sf.openSession();
		session.beginTransaction();
		
		session.persist(elaborado);
		session.flush();
		session.getTransaction().commit();
		session.close();
	}

}













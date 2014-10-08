package bean.DAO;

import hbt.hibernateUtil;

import java.util.List;

import org.hibernate.*;
import org.hibernate.SessionFactory;







import bean.Articulos;
import bean.Proveedor;

public class HibernateProveedorDAO {
	
	private static HibernateProveedorDAO instancia = null;
	private static SessionFactory sf = null;
	
	public static HibernateProveedorDAO getInstancia(){
		if(instancia == null){
			sf = hibernateUtil.getSessionFactory();
			instancia = new HibernateProveedorDAO();
		}
		return instancia;
	}
	

	
	public void grabarProveedor(List<Proveedor> proveedores){
		Session session = sf.openSession();
		session.beginTransaction();
		for(Proveedor proveedor:proveedores)
			//session.persist(proveedor);
			session.save(proveedor);
		session.flush();
		session.getTransaction().commit();
		session.close();
	}



//	public Proveedor leerProveedor(Proveedor provDB) {
	public Proveedor leerProveedor(Proveedor provDB) {
		Session session = sf.openSession();

		session.load(provDB, provDB.getCuit());
		// No andubo el get
		//(Proveedor)session.get(Proveedor.class, provDB.getCuit());
		 
		session.close();
		return provDB;
		//return (Proveedor)session.get(Proveedor.class, provDB.getCuit());
	}
}













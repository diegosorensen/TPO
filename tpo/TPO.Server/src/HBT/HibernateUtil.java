package HBT;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

import Entity.*;


public class HibernateUtil {
	public static SessionFactory sessionFactory;
	
	static {
		try
		{
			AnnotationConfiguration config = new AnnotationConfiguration();
            //config.addAnnotatedClass(XXXEntity.class);
            sessionFactory = config.buildSessionFactory();
       }
       catch (Throwable ex)
       {
           System.err.println("Initial SessionFactory creation failed." + ex);
           throw new ExceptionInInitializerError(ex);
       }
	}
	
	public static SessionFactory getSessionFactory(){
		return sessionFactory;
	}
}


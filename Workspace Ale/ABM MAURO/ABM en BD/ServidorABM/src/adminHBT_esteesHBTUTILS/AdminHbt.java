package adminHBT_esteesHBTUTILS;

import java.io.FileInputStream;
import java.util.Properties;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

import beans.Contacto;

public class AdminHbt {

	private static final SessionFactory sf;
	private static final SessionFactory sf1;
	static {
		try {
			AnnotationConfiguration config = new AnnotationConfiguration();
			Properties propiedades = new Properties();
			propiedades.load(new FileInputStream("Configuracion/hbt.properties"));
			config.mergeProperties(propiedades);
		    config.addAnnotatedClass(Contacto.class);

			sf = config.buildSessionFactory();
			sf1 = config.buildSessionFactory();
		} catch (Throwable error) {
			System.err.println("Fallo en la creacion de la SF" + error);
			throw new ExceptionInInitializerError(error);
		}
	}

	public static Session obtenerSesion() throws HibernateException {
		return sf.openSession();
	}

	public static SessionFactory obtenerSF() {
		return sf;
	}

}

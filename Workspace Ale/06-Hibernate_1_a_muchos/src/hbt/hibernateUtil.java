package hbt;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

import bean.Articulo;
import bean.Factura;

public class hibernateUtil
{
    private static final SessionFactory sessionFactory;
    static
    {
        try
        {
        	 AnnotationConfiguration config = new AnnotationConfiguration();
        	// config.addAnnotatedClass(Proveedor.class);
        	 config.addAnnotatedClass(Articulo.class);
        	 config.addAnnotatedClass(Factura.class);
        	// config.addAnnotatedClass(proArt.class);
        	 // config.addAnnotatedClass(Usuario.class);
            // config.addAnnotatedClass(Telefono.class);
            // config.addAnnotatedClass(Domicilio.class);
            // config.addAnnotatedClass(CajaAhorro.class);
            // config.addAnnotatedClass(CuentaCorriente.class);
             sessionFactory = config.buildSessionFactory();
        }
        catch (Throwable ex)
        {
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }
 
    public static SessionFactory getSessionFactory()
    {
        return sessionFactory;
    }
}

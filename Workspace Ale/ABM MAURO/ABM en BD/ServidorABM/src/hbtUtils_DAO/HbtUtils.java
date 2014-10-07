package hbtUtils_DAO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import adminHBT_esteesHBTUTILS.AdminHbt;

public class HbtUtils {

	private static HbtUtils instancia = null;
	private static SessionFactory sfhbt = null;
	private Session sesion = null;

	public static HbtUtils obtenerInstancia() {
		if (instancia == null) {
			sfhbt = AdminHbt.obtenerSF();
			instancia = new HbtUtils();
		}
		return instancia;
	}

	public Session obtenerSession() {
		if (sesion == null || !sesion.isOpen()) {
			sesion = sfhbt.openSession();
		}
		return sesion;
	}

	public void cerrarSesion() {
		if (sesion.isOpen()) {
			sesion.close();
		}
	}
}

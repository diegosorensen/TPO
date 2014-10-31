package bean.SRV;

import bean.DAO.HibernateDAO;
import entity.Elaborado;

public class PersistenciaSRV {
	private static HibernateDAO dao;
	static {
		dao = HibernateDAO.getInstancia();
	}
	
	public void grabarElaborado(Elaborado elaborado){
		dao.grabarElaborado(elaborado);
	}

}

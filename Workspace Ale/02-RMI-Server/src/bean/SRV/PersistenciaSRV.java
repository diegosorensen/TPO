package bean.SRV;

import java.util.List;

import entity.Elaborado;
import bean.DAO.HibernateDAO;

public class PersistenciaSRV {
	private static HibernateDAO dao;
	static {
		dao = HibernateDAO.getInstancia();
	}
	
	public void grabarElaborado(Elaborado elaborado){
		dao.grabarElaborado(elaborado);
	}

}

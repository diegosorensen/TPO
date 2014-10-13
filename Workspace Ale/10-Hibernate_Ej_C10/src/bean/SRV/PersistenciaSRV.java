package bean.SRV;

import java.util.List;

import bean.Elaborado;
import bean.Material;
import bean.Unidad;
import bean.DAO.HibernateDAO;

public class PersistenciaSRV {
	private static HibernateDAO dao;
	static {
		dao = HibernateDAO.getInstancia();
	}
	
	public void grabarElaborado(Elaborado elaborado){
		dao.grabarElaborado(elaborado);
	}

	public void grabarUnidad(Unidad unidad) {
		dao.grabarUnidad(unidad);
		
	}

	public List<Material> leerMateriales(int nroMaterial) {
		
		return dao.leerMateriales(nroMaterial);
	}

	public Material leerMaterial(int nroMaterial) {
		return dao.leerMaterial(nroMaterial);
		
	}

	public List<Unidad> leerUnidades(int codUnidad) {
		return dao.leerUnidads(codUnidad);
	}
	
	
}

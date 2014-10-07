package prueba;

import hbtUtils_DAO.HbtUtils;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cache.QueryCacheFactory;

import beans.Contacto;
import beansVO.ContactoVO;


import negocio.Negocio;

public class Servidor extends UnicastRemoteObject implements Negocio {

	protected Servidor() throws RemoteException {
		super();
	}

	public static void main(String args[]) {
		try {
			Servidor server = new Servidor();
			server.iniciar();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void iniciar() {
		try {
			LocateRegistry.createRegistry(1099);
			Servidor serverNeg = new Servidor();
			Naming.rebind("RMI_HBT", serverNeg);
			System.out.println("Corriendo");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	//ALTA DE CONTACTOS
	public void guardaContacto(ContactoVO contactovo) throws Exception {
		Contacto cont = new Contacto();
		cont.setId(contactovo.getId());
		cont.setNombre(contactovo.getNombre());
		cont.setTelefono(contactovo.getTelefono());
		Session sesion = HbtUtils.obtenerInstancia().obtenerSession();
		Session sesion1 = HbtUtils.obtenerInstancia().obtenerSession();
		sesion.save(cont);
	}

	//MUESTRA DE LA LISTA DE CONTACTOS
	public List<ContactoVO> muestraContactos() throws Exception {
		Session sesion = HbtUtils.obtenerInstancia().obtenerSession();
		Query query = sesion.createQuery("from Contacto");
		List<Contacto> resultado = query.list();
		
		List<ContactoVO> contacto = new ArrayList<ContactoVO>();
		ContactoVO contactovo = new ContactoVO();
		for (int i=0; i<resultado.size(); i++){
			contactovo.setId(resultado.get(i).getId());
			contactovo.setNombre(resultado.get(i).getNombre());
			contactovo.setTelefono(resultado.get(i).getTelefono());
			contacto.add(contactovo);
		}
		return contacto;
	}
	
	//ACTUALIZACION CONTACTOS
	private Contacto buscoContacto (ContactoVO contactavo) throws Exception{
		Contacto conta = new Contacto();
		conta.setId(contactavo.getId());
		conta.setNombre(contactavo.getNombre());
		conta.setTelefono(contactavo.getTelefono());
		
		Session sesion = HbtUtils.obtenerInstancia().obtenerSession();
		Query query = sesion.createQuery("from Contacto where id = ? and nombre = ? and telefono = ?");
		query.setInteger(0, conta.getId()); // = :id query.setParameter("id", conta.getId()); ?, 0
		query.setString(1, conta.getNombre()); //query.setParameter("nombre",conta.getNombre()); ?, 1
		query.setInteger(2, conta.getTelefono());//query.setParameter("telefono", conta.getTelefono()); ?, 2		
		
		// Verificar si trae datos??
		Contacto resultado = (Contacto) query.uniqueResult();
		return resultado;
	}
	
	public void actualizaContacto(ContactoVO contactovo, ContactoVO contactoAct) throws Exception {
		List<Contacto> contactoAAct = new ArrayList<Contacto>();
		Contacto resbusqueda = buscoContacto(contactoAct);
		if(resbusqueda.getId() == contactoAct.getId()){
			resbusqueda.setNombre(contactovo.getNombre());
			resbusqueda.setTelefono(contactovo.getTelefono());
		}
		Session sesion = HbtUtils.obtenerInstancia().obtenerSession();
		Transaction tx = sesion.beginTransaction();
		sesion.update(resbusqueda);
		tx.commit();
	}
	
	//BORRADO DE CONTACTOS

	private Contacto buscoBorrar(int idContacto) throws Exception{
		Contacto aBorrar = new Contacto();
		Session sesion = HbtUtils.obtenerInstancia().obtenerSession();
//		aBorrar = (Contacto) sesion.createQuery("from Contacto where id = :?").setInteger(0, idContacto).uniqueResult();
		Query consulta = sesion.createQuery("from Contacto where id = :id");
		consulta.setParameter("id", idContacto);
//		consulta.setInteger(0, idContacto).uniqueResult();
		aBorrar = (Contacto) consulta.uniqueResult();
		return aBorrar;
	}
	
	public void borrarContacto(int idContacto) throws Exception {
		Contacto buscado = buscoBorrar(idContacto);
		Session sesion = HbtUtils.obtenerInstancia().obtenerSession();
		Transaction tx = sesion.beginTransaction();
		sesion.delete(buscado);
		tx.commit();
	}
}

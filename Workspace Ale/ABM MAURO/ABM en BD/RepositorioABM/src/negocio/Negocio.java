package negocio;

import java.rmi.Remote;
import java.util.ArrayList;
import java.util.List;

import beansVO.ContactoVO;

public interface Negocio extends Remote {

	//ALTA DE CONTACTOS
	public void guardaContacto(ContactoVO contactovo) throws Exception;
	//MUESTRA DE LA LISTA DE CONTACTOS
	public List<ContactoVO> muestraContactos() throws Exception;
	//ACTUALIZACION CONTACTOS
	public void actualizaContacto(ContactoVO contactovo, ContactoVO contactoAct) throws Exception;
	//BORRADO DE CONTACTOS
	public void borrarContacto(int idContacto) throws Exception;

}

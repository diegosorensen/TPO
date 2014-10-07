package cliente;

import java.io.Serializable;
import java.rmi.Naming;
import java.util.ArrayList;
import java.util.List;

import beansVO.ContactoVO;

import negocio.Negocio;

public class Cliente implements Serializable {

	Negocio negocio;

	public static void main(String arg[]) throws Exception {
		Cliente cliente = new Cliente();
		cliente.iniciar();

		//ALTA DE CONTACTOS
		ContactoVO contactovo = new ContactoVO();
		contactovo.setId(1); contactovo.setNombre("mauro"); contactovo.setTelefono(1234); 
		cliente.guadarContacto(contactovo);
//		contactovo.setId(2); contactovo.setNombre("ariel"); contactovo.setTelefono(5678);
//		cliente.guadarContacto(contactovo);
//		contactovo.setNombre("hernan"); contactovo.setTelefono(99999);
//		cliente.guadarContacto(contactovo);
		System.out.println("El alta de los contactos se ha realizado correctamente\n");
		//MUESTRA DE LA LISTA DE CONTACTOS
		System.out.println("Se mostraran los contactos existentes:\n");
		List<ContactoVO> contactos = cliente.muestraContacto();
		for(int i=0;i<contactos.size();i++){
			System.out.println(i+". "+contactos.get(i).getId()+ "\t" + contactos.get(i).getNombre()+ "\t" + contactos.get(i).getTelefono());
		}
		//ACTUALIZACION CONTACTOS
		System.out.println("Se actualizara el contacto :");
		ContactoVO editado = new ContactoVO();
		editado.setNombre("cualquiera");
		editado.setTelefono(1111);
		ContactoVO actual = new ContactoVO();
		actual.setId(3);
		actual.setNombre("ariel");
		actual.setTelefono(5678);
		cliente.actualizaContacto(editado, actual);
		//BORRADO DE CONTACTOS
		System.out.println("Borrado de contacto");
		int idContactoBorrar = 3;
		cliente.borrarContacto(idContactoBorrar);
		System.out.println("El contacto ha sido borrado correctamente");
	}

	private void iniciar() {
		try {
			negocio = (Negocio) Naming.lookup("//localhost/RMI_HBT");
			System.out.println("Cliente Iniciado");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
//ALTA CONTACTOS
	 public void guadarContacto(ContactoVO contactovo) throws Exception{
		 negocio.guardaContacto(contactovo);
	 }
//MUESTRA LISTA CONTACTOS
	 public List<ContactoVO> muestraContacto() throws Exception{
		 List<ContactoVO> resultado = negocio.muestraContactos();
		 return resultado;
	 }
//ACTUALIZACION CONTACTOS
	 public void actualizaContacto(ContactoVO edita, ContactoVO contactoAct) throws Exception{
		 negocio.actualizaContacto(edita, contactoAct);
	 }
//BORRADO DE CONTACTOS	 
	 public void borrarContacto(int idContacto) throws Exception{
		 negocio.borrarContacto(idContacto);
	 }
}
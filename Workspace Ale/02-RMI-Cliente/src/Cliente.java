import java.rmi.Naming;

import paquete.Opciones;

public class Cliente {

	Opciones menu;
	int resultado;
	
	public static void main(String[] args) {
		new Cliente();
	}
	
	public boolean getStub(){
		try {
			menu = (Opciones)Naming.lookup("//localhost/Sumas");
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

    public Cliente(){
    	if (getStub()) {
			try {
				/*
				resultado = menu.sumar(4,8);
				System.out.println(resultado); */
				/* Grabo datos */
				menu.grabar(2, "Curabicheras", 550);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
    }
    

}

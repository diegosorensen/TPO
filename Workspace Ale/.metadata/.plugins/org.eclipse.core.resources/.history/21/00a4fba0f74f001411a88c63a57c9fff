package app;

import java.util.ArrayList;
import java.util.List;

import bean.Articulos;
import bean.Proveedor;

public class inicio {

	public static void main(String[] args) {

		sistema sis = new sistema();
		//Creo 2 listas una de articulos y otra de proveedores
		List<Proveedor> proveedores = new ArrayList<Proveedor>();
		List<Articulos> articulos = new ArrayList<Articulos>();
		
		//Dar de alta 1 proveedor con 2 articulos
		Proveedor prov	 = sis.altaProveedor();
		Articulos art1 	 = sis.altaArticulo(15, "Lapicera", 22.75);
		
		//Al articulo 1 le meto el proceedor en su lista de proveedores
		art1.newProveedor(prov);
		//Al proveedor le meto al articulo en su lista
		//prov.newArticulo(art1);
		
		//Al proveedor lo meto en la lista de proveedores
		proveedores.add(prov);
		//A los articulos 1 y 2 los meto en la lista de articulos
		articulos.add(art1);

		// Grabo proveedores y articulos Ambas LISTAS
		sis.grabarProveedor(proveedores);
		sis.grabarArticulo(articulos);
		

		
	}

}

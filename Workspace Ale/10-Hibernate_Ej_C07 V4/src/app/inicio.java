package app;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import bean.Articulos;
import bean.Proveedor;
import bean.Venta;

public class inicio {

	public static void main(String[] args) {

		sistema sis = new sistema();

		/*  Parte 1 Persistencia
		//Dar de alta 1 proveedor con 2 articulos
		Proveedor prov	 = sis.altaProveedor();
		Articulos art1 	 = sis.altaArticulo(15, "Lapicera", 22.75);	
		//Al articulo 1 le meto el proceedor en su lista de proveedores
		art1.newProveedor(prov);
		// Grabo proveedores y articulos Ambas LISTAS
		sis.grabarProveedor(prov);
		sis.grabarArticulo(art1);
		*/
		/*  Parte 2 lectura de la base*/
		List<Venta> ventas = sis.listVentas();
		System.out.println("-----------------------------");
		System.out.println("Ventas a partir de este punto:");
		for (Venta venta : ventas) {
			System.out.println("Id Venta");
			System.out.println(venta.getIdVenta());	
		}
		List<Venta> ventaProv = sis.lisVProv(1251);

		System.out.println("-----------------------------");
		System.out.println("Ventas por proveedopr");
		for (Venta venta1 : ventaProv) {
			System.out.println("Id Venta");
			System.out.println(venta1.getIdVenta());	
		}
	}

}

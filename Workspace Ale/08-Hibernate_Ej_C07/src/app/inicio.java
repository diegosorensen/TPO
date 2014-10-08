package app;

import java.util.ArrayList;
import java.util.List;

import bean.Articulos;
import bean.Proveedor;

public class inicio {

	public static void main(String[] args) {

		sistema sis = new sistema();
		//sis.addArticulo(1,"Coca Cola",30.50, 8);
		//sis.addArticulo(codigoArticulo, descripcion, precio, descripcion2, id_factura);
		//sis.addFactura(1, "Factura de venta", sis.getArticulos());
		
		//sis.addArticulo(2,"pesi",29.50,"Exento de Ingresos Butos",2);		
		//sis.addProveedor("31641","Casablanca", "juan.B Justo", "2330","palermo","1414");
		
		//sis.grabarVenta("");
		//System.out.println(sis.getArticulos());
		
		//Creo 2 listas una de articulos y otra de proveedores
		List<Proveedor> proveedores = new ArrayList<Proveedor>();
		List<Articulos> articulos = new ArrayList<Articulos>();
		
		//Creo 1 proveedor y 2 articulos
		Proveedor prov	 = new Proveedor();
		
		Articulos art1 	 = new Articulos();
		Articulos art2 	 = new Articulos();

		String cuit = null;
		
		//Cargo datos al proveedor 1
		prov.setCuit("2155000");
		prov.setNombre("Carrefour");
		prov.setCalle("Corrientes");
		prov.setNumero(2286);
		prov.setCodigoPostal(7070);
		
		//Variables para sumarle 1 al CUIT siento este un String cualquiera
		int numero1;
		int numero2;
		//Leer si existe el proveedor si existe le sumo 1
		Proveedor provDB = sis.leerProveedor(prov.getCuit());		
		
		// Me fijo si el cuit que voy a ingresar es el mismo que el de la base
		// de datos, si es el mismo, le sumo 1 sino lo cargo asi como esta
		if ( provDB.getCuit() == prov.getCuit()){
			
			numero1 = Integer.valueOf(prov.getCuit());
			numero2 = Integer.valueOf(provDB.getCuit());
			numero1 = numero2 + 1;
			cuit = numero1 + ""; 
			prov.setCuit(cuit);
//			System.out.println(numero1);
//			System.out.println(provDB.getCuit());
		}
		
		//Creo datos al articulo 1
		art1.setId_articulo(8);
		art1.setDescripcion("Krachitos");
		art1.setPrecio(22.5);
		//Al articulo 1 le meto el proceedor en su lista de proveedores
		art1.newProveedor(prov);
		
		//Creo datos al articulo 1
		//art2.setId_articulo(4);
		//art2.setDescripcion("Jorgito");
		//art2.setPrecio(22.5);
		
		//Al articulo 2 le meto el proceedor en su lista de proveedores
		//art2.newProveedor(prov);
		
		//Al proveedor lo meto en la lista de proveedores
		proveedores.add(prov);
		
		//A los articulos 1 y 2 los meto en la lista de articulos
		articulos.add(art1);
		articulos.add(art2);


		// Grabo proveedores y articulos Ambas LISTAS
		sis.grabarProveedor(proveedores);
		sis.grabarArticulo(articulos);
		

		
	}

}

package app;

import java.util.List;

import bean.Articulo;
import bean.Factura;
import bean.ListArticulos;
import bean.SRV.ArticuloSRV;


public class sistema {

	private ListArticulos articulos = new ListArticulos();
	
	public void addArticulo(int codigoArticulo, String descripcion, double precio, String descripcion2, int id_factura){
	/*	Aticulos art = new Aticulos();
		art.setCodigo(codigoArticulo);
		art.setDescripcion(descripcion);
		art.setPrecio(precio);
		return art; */
		Articulo art = new Articulo();
		art.setCodigo(codigoArticulo);
		art.setDescripcion(descripcion);
		art.setPrecio(precio);
		
		Factura fac = new Factura();
		fac.setId_Factura(id_factura);
		fac.setDescripcion(descripcion2);
		
		art.setFactura(fac);
		
		articulos.addArticulo(art);
		
		
	}

	public void grabarArticulo(List<Articulo> articulos){
		new ArticuloSRV().grabarArticulo(articulos);
	}
	public List<Articulo> getArticulos(){
		return articulos.getArti();
	}
}

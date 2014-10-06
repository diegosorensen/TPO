package app;

import java.util.ArrayList;
import java.util.List;

import bean.Articulo;
import bean.Factura;
import bean.ListArticulos;
import bean.ListFacturas;
import bean.SRV.ArticuloSRV;
import bean.SRV.FacturaSRV;


public class sistema {

	private ListArticulos articulos = new ListArticulos();
	
	private ListFacturas facturas = new ListFacturas();
	
	public void addFactura(int id_Factura, String descripcion, List<Articulo> articulo){
		
		Factura fact = new Factura();
		Articulo art = new Articulo();
		List<Articulo> articulos = new ArrayList<Articulo>();

		//Factura
		fact.setId_Factura(id_Factura);
		fact.setDescripcion(descripcion);
	//	fact.setArticulo(articulo);
		
		//Articulo
		art.setCodigo(5);
		art.setDescripcion("mesada");
		
		//Articulos
		articulos.add(art);
			
		facturas.addFactura(fact);
	}
	
	public void addArticulo(int codigoArticulo, String descripcion, double precio, int id_Factura){
	/*	Aticulos art = new Aticulos();
		art.setCodigo(codigoArticulo);
		art.setDescripcion(descripcion);
		art.setPrecio(precio);
		return art; */
		Articulo art = new Articulo();
		List<Factura>  facturas = new ArrayList<Factura>();
		Factura fact = new Factura();

		//Datos Articulo		
		art.setCodigo(codigoArticulo);
		art.setDescripcion(descripcion);
		art.setPrecio(precio);
		//Datos Factura
		fact.setDescripcion(descripcion);
		fact.setId_Factura(id_Factura);
		
		//Agrego facturas
		facturas.add(fact);
		
		art.setfacturas(facturas);
		
		articulos.addArticulo(art);		
		
	}

	public ListFacturas getFacturas() {
		return facturas;
	}

	public void setFacturas(ListFacturas facturas) {
		this.facturas = facturas;
	}

	public void setArticulos(ListArticulos articulos) {
		this.articulos = articulos;
	}

	public void grabarFactura(List<Factura> factura){
		new FacturaSRV().grabarFactura(factura);
	}
	public List<Factura> getFactura(){
		return facturas.getFacturas();
	}
	
	public void grabarArticulo(List<Articulo> articulos){
		new ArticuloSRV().grabarArticulo(articulos);
	}
	public List<Articulo> getArticulos(){
		return articulos.getArti();
	}
}

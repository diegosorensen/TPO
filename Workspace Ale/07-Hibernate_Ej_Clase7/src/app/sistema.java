package app;

import java.util.ArrayList;
import java.util.List;

import bean.Proveedor;
import bean.Articulos;
import bean.ListArticulos;
import bean.ListFacturas;
import bean.SRV.ArticuloSRV;
import bean.SRV.FacturaSRV;
import bean.SRV.ProveedorSRV;


public class sistema {

	private ListArticulos articulos = new ListArticulos();
	private ListFacturas facturas = new ListFacturas();
	
	private List<Articulos> articulos1 = new ArrayList<Articulos>(); 
	private List<Proveedor> proveedores = new ArrayList<Proveedor>();

	public void newProveedor(int codigo, String descripcion, double precio){
		Proveedor proveedor = new Proveedor();
		
		proveedor.setCodigo(codigo);
		proveedor.setDescripcion(descripcion);
		proveedor.setPrecio(precio);
		
		proveedores.add(proveedor);
	}
	
	public void newArticulo(int id_factura, String descripcion){
		Articulos articulo = new Articulos();
		
		articulo.setId_Factura(id_factura);
		articulo.setDescripcion(descripcion);
		
		articulos1.add(articulo);
	}
	
	public void addFactura(int id_Factura, String descripcion, List<Proveedor> articulo){
		
		Articulos fact = new Articulos();
		Proveedor art = new Proveedor();
		List<Proveedor> articulos = new ArrayList<Proveedor>();

		//Factura
		fact.setId_Factura(id_Factura);
		fact.setDescripcion(descripcion);
	//	fact.setArticulo(articulo);
		
		//Articulo
		art.setCodigo(5);
		art.setDescripcion("mesada");
		
		//Articulos
		articulos.add(art);
		
		fact.setArticulos(articulos);
		
		facturas.addFactura(fact);
	}
	/*
	public void addArticulo(int codigoArticulo, String descripcion, double precio, int id_Factura){
	/*	Aticulos art = new Aticulos();
		art.setCodigo(codigoArticulo);
		art.setDescripcion(descripcion);
		art.setPrecio(precio);
		return art; *//*
		Proveedor art = new Proveedor();
		List<Articulos>  facturas = new ArrayList<Articulos>();
		Articulos fact = new Articulos();

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
		
	}*/

	public ListFacturas getFacturas() {
		return facturas;
	}

	public void setFacturas(ListFacturas facturas) {
		this.facturas = facturas;
	}

	public void setArticulos(ListArticulos articulos) {
		this.articulos = articulos;
	}

	public void grabarFactura(List<Articulos> factura){
		new FacturaSRV().grabarFactura(factura);
	}
	public List<Articulos> getFactura(){
		return facturas.getFacturas();
	}
	
	public void grabarArticulo(List<Articulos> articulos1){
		new ArticuloSRV().grabarArticulo(articulos1);
	}
	public void grabarProveedor(List<Proveedor> proveedores){
			new ProveedorSRV().grabarProveedor(proveedores);
	}
	
	
	public List<Articulos> getArticulos1() {
		return articulos1;
	}

	public void setArticulos1(List<Articulos> articulos1) {
		this.articulos1 = articulos1;
	}

	public List<Proveedor> getProveedores() {
		return proveedores;
	}

	public void setProveedores(List<Proveedor> proveedores) {
		this.proveedores = proveedores;
	}

	public List<Proveedor> getArticulos(){
		return articulos.getArti();
	}
}

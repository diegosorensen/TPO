package bean;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table (name="Articulos")
public class Articulos {

	@Id
	private int id_Factura;
	private String descripcion;
	
	@ManyToMany
	@JoinTable(name		="proart",
	joinColumns 		= @JoinColumn(name="id_Factura"),
	inverseJoinColumns 	= @JoinColumn(name="codigo"))
	private List<Proveedor> articulos = new ArrayList<Proveedor>();
	
	@OneToMany(cascade=CascadeType.ALL, mappedBy="articulo")
	private List<Venta> ventas = new ArrayList<Venta>();
		
	//private List<Articulo> articulo;
	
	
	public List<Proveedor> getArticulos() {
		return articulos;
	}
	public void setArticulos(List<Proveedor> articulos) {
		this.articulos = articulos;
	}
	/*public List<Articulo> getArticulo() {
		return articulo;
	}
	public void setArticulo(List<Articulo> articulo) {
		this.articulo = articulo;
	}*/
	public int getId_Factura() {
		return id_Factura;
	}
	public void setId_Factura(int id_Factura) {
		this.id_Factura = id_Factura;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


}

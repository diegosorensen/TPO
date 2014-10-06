package bean;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table( name = "Proveedores" )
public class Proveedor {
	
	@Id
	private int codigo;
	//private Factura factura;
	private String descripcion ;
	private double precio;

	@ManyToMany
	@JoinTable(name		="proart",
	joinColumns 		= @JoinColumn(name="codigo"),
	inverseJoinColumns 	= @JoinColumn(name="id_Factura"))
	private List<Articulos> facturas = new ArrayList<Articulos>();
	
	@OneToMany(cascade=CascadeType.ALL, mappedBy="proveedor")
	private List<Venta> ventas = new ArrayList<Venta>();
	
	public List<Articulos> getfacturas() {
		return facturas;
	}
	public void setfacturas(List<Articulos> facturas) {
		this.facturas = facturas;
	}
	public int getCodigo() {
		return codigo;
	}
	/*public Factura getFactura() {
		return factura;
	}
	public void setFactura(Factura factura) {
		this.factura = factura;
	}
	public int getCodigo() {
		return codigo;
	}*/
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio2) {
		this.precio = precio2;
	}
	
	
	

}

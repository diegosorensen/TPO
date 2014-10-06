package bean;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table( name = "Articulos" )
public class Articulo {
	
	@Id
	private int codigo;
	//private Factura factura;
	private String descripcion ;
	private double precio;

	@ManyToMany
	@JoinTable(name		="proart",
	joinColumns 		= @JoinColumn(name="codigo"),
	inverseJoinColumns 	= @JoinColumn(name="id_Factura"))
	private List<Factura> facturas = new ArrayList<Factura>();
	
	public List<Factura> getfacturas() {
		return facturas;
	}
	public void setfacturas(List<Factura> facturas) {
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

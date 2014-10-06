package bean;

import javax.persistence.*;

@Entity
@Table( name = "Articulos" )
public class Articulo {
	
	@Id
	private int codigo;
	@OneToOne (cascade=CascadeType.ALL)	
	private Factura factura;
	private String descripcion ;
	private double precio;
	
	public Factura getFactura() {
		return factura;
	}
	public void setFactura(Factura factura) {
		this.factura = factura;
	}
	public int getCodigo() {
		return codigo;
	}
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

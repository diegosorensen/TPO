package bean;

import javax.persistence.*;

@Entity
@Table (name="Facturas")
public class Factura {

	@Id
	private int id_Factura;
	private String descripcion;
	
	@ManyToOne
	private Articulo articulo;
	

	public int getId_Factura() {
		return id_Factura;
	}
	public Articulo getArticulo() {
		return articulo;
	}
	public void setArticulo(Articulo articulo) {
		this.articulo = articulo;
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

package bean;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table (name="Ventas")
public class Venta {

	@Id
	private int 	idVenta;
	private Date 	fecha;
	private int 	cantidad;
	private double 	precio;
	private String 	cuit;
	private int 	codigo;
	
	@ManyToOne
	Proveedor proveedor = new Proveedor();
	
	@ManyToOne
	Articulos articulo = new Articulos();

	public int getIdVenta() {
		return idVenta;
	}

	public Articulos getArticulo() {
		return articulo;
	}

	public void setArticulo(Articulos articulo) {
		this.articulo = articulo;
	}

	public void setIdVenta(int idVenta) {
		this.idVenta = idVenta;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getCuit() {
		return cuit;
	}

	public void setCuit(String cuit) {
		this.cuit = cuit;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public Proveedor getProveedor() {
		return proveedor;
	}

	public void setProveedor(Proveedor proveedor) {
		this.proveedor = proveedor;
	}
	
	
	
}

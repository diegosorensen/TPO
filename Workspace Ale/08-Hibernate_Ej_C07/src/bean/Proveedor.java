package bean;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table( name = "Proveedores" )
public class Proveedor {
	
	@Id
	private String cuit;
	private String nombre;
	private String calle;
	private int numero;
	private String localidad;
	private int codigoPostal;

	@ManyToMany
	@JoinTable(name		="proart",
	joinColumns 		= @JoinColumn(name="cuit"),
	inverseJoinColumns 	= @JoinColumn(name="id_articulo"))
	private List<Articulos> articulos = new ArrayList<Articulos>();
	
	public String getCuit() {
		return cuit;
	}

	public void setCuit(String cuit) {
		this.cuit = cuit;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public int getCodigoPostal() {
		return codigoPostal;
	}

	public void setCodigoPostal(int codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

	public List<Articulos> getArticulos() {
		return articulos;
	}

	public void setArticulos(List<Articulos> articulos) {
		this.articulos = articulos;
	}
	@OneToMany(cascade=CascadeType.ALL, mappedBy="proveedor")
	private List<Venta> ventas = new ArrayList<Venta>();

	

	public List<Articulos> getFacturas() {
		return articulos;
	}

	public void setFacturas(List<Articulos> articulos) {
		this.articulos = articulos;
	}

	public List<Venta> getVentas() {
		return ventas;
	}

	public void setVentas(List<Venta> ventas) {
		this.ventas = ventas;
	}
	public void newArticulo(Articulos articulo){
		this.articulos.add(articulo);
	}
	
	
	
	
	

}

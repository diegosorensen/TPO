package bean;

import java.util.List;

import javax.persistence.*;

@Entity
@Table (name="Elaborado")
public class Elaborado {

@Id	
private int codProducto;
private String descripcion;
private double precioVenta;
private double porcentajeGanancia;
//private String unidad;

@ManyToMany
@JoinTable(	name = "compuestoDe",
			joinColumns 		= @JoinColumn(name="codProductoE"),
			inverseJoinColumns  = @JoinColumn(name="codProductoSM"))
private List<SemiElaborado> semiElaborados;

//@ManyToOne
//private Unidad unidad;
@ManyToOne
@JoinColumn(name="pesos")
private Unidad pesos;

public int getCodProducto() {
	return codProducto;
}

public void setCodProducto(int codProducto) {
	this.codProducto = codProducto;
}

public String getDescripcion() {
	return descripcion;
}

public void setDescripcion(String descripcion) {
	this.descripcion = descripcion;
}

public double getPrecioVenta() {
	return precioVenta;
}

public void setPrecioVenta(double precioVenta) {
	this.precioVenta = precioVenta;
}

public double getPorcentajeGanancia() {
	return porcentajeGanancia;
}

public void setPorcentajeGanancia(double porcentajeGanancia) {
	this.porcentajeGanancia = porcentajeGanancia;
}

public List<SemiElaborado> getSemiElaborados() {
	return semiElaborados;
}

public void setSemiElaborados(List<SemiElaborado> semiElaborados) {
	this.semiElaborados = semiElaborados;
}







}

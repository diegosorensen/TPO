package entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="Elaborado")
public class Elaborado {


@Id	
private int codProducto;
private String descripcion;
private double precioVenta;


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

}

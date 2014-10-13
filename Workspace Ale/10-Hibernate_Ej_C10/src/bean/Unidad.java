package bean;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table (name="Unidades")
public class Unidad {

@Id	
private int codigoUnidad;
private String descripcion;
	
@OneToMany(cascade=CascadeType.ALL)
@JoinColumn(name="pesos")
private List<Material> materiales = new ArrayList<Material>();

@OneToMany(cascade=CascadeType.ALL)
//@JoinColumn(name="codProducto")
@JoinColumn(name="pesos")
private List<SemiElaborado> semiElaborados = new ArrayList<SemiElaborado>();

@OneToMany(cascade=CascadeType.ALL)
//@JoinColumn(name="codProducto")
@JoinColumn(name="pesos")
private List<Elaborado> elaborados = new ArrayList<Elaborado>();

public int getCodigoUnidad() {
	return codigoUnidad;
}

public void setCodigoUnidad(int codigoUnidad) {
	this.codigoUnidad = codigoUnidad;
}

public String getDescripcion() {
	return descripcion;
}

public void setDescripcion(String descripcion) {
	this.descripcion = descripcion;
}

public List<Material> getMateriales() {
	return materiales;
}

public void setMateriales(List<Material> materiales) {
	this.materiales = materiales;
}

public List<SemiElaborado> getSemiElaborados() {
	return semiElaborados;
}

public void setSemiElaborados(List<SemiElaborado> semiElaborados) {
	this.semiElaborados = semiElaborados;
}

public List<Elaborado> getElaborados() {
	return elaborados;
}

public void setElaborados(List<Elaborado> elaborados) {
	this.elaborados = elaborados;
}

}

package bean;

import java.util.List;

import javax.persistence.*;

@Entity
@Table (name="Materiales")
public class Material {

@Id	
private int codMaterial;
private String descripcion;
private int uniCompra;
private int uniUso;

@ManyToMany
@JoinTable(	name = "materialSemi",
			joinColumns 		= @JoinColumn(name="codMaterial"),
			inverseJoinColumns  = @JoinColumn(name="codProducto"))
private List<SemiElaborado> semielaborados;


public int getCodMaterial() {
	return codMaterial;
}

@ManyToOne
@JoinColumn(name="pesos")
private Unidad pesos;



public void setCodMaterial(int codMaterial) {
	this.codMaterial = codMaterial;
}

public String getDescripcion() {
	return descripcion;
}

public void setDescripcion(String descripcion) {
	this.descripcion = descripcion;
}

public int getUniCompra() {
	return uniCompra;
}

public void setUniCompra(int uniCompra) {
	this.uniCompra = uniCompra;
}

public int getUniUso() {
	return uniUso;
}

public void setUniUso(int uniUso) {
	this.uniUso = uniUso;
}

public List<SemiElaborado> getSemielaborados() {
	return semielaborados;
}

public void setSemielaborados(List<SemiElaborado> semielaborados) {
	this.semielaborados = semielaborados;
}
	


}

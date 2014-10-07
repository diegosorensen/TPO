package beans;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name="Contactos")
public class Contacto implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String nombre;
	private int telefono;
	
	public Contacto() {
		super();
	}
	
	public Contacto(int id, String nombre, int telefono) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.telefono = telefono;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	
}

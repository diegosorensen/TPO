package Entity;

import java.util.List;

import javax.persistence.*;


@Entity
@Table (name="Deposito")
public class Deposito {
	
	@Id
	private int id_Deposito;
	private String 	descripcion;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="id_Sector")
	private List<Sector> sectores;

	public int getId_Deposito() {
		return id_Deposito;
	}

	public void setId_Deposito(int id_Deposito) {
		this.id_Deposito = id_Deposito;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public List<Sector> getSectores() {
		return sectores;
	}

	public void setSectores(List<Sector> sectores) {
		this.sectores = sectores;
	}
	
	

}

package Entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;





@Entity
@Table (name="Vehiculo")
public class Vehiculo {
	
	@Id
	private int id_vehiculo ;
	private String Tipo;
		
	@OneToMany
	@JoinColumn(name="PlanDeMantenimiento")
	private List<PlanDeMantenimiento> plan_mantenimientos = new ArrayList<PlanDeMantenimiento>();
	
	private float volumenTransportado; 
	private float Peso;
	private float Tara;
	private String CondicionesEspeciales; 
	private String Patente;
	private float Kilometraje;
	@OneToMany
	private List<Historico> historicos = new ArrayList<Historico>();
	
	@OneToMany
	private List<Tracking> trackings = new ArrayList<Tracking>();
	
	public int getId_vehiculo() {
		return id_vehiculo;
	}
	
	
	
	
	public void setId_vehiculo(int id_vehiculo) {
		this.id_vehiculo = id_vehiculo;
	}
	public String getTipo() {
		return Tipo;
	}
	public void setTipo(String tipo) {
		Tipo = tipo;
	}
	
	public float getVolumenTransportado() {
		return volumenTransportado;
	}
	public void setVolumenTransportado(float volumenTransportado) {
		this.volumenTransportado = volumenTransportado;
	}
	public float getPeso() {
		return Peso;
	}
	public void setPeso(float peso) {
		Peso = peso;
	}
	public float getTara() {
		return Tara;
	}
	public void setTara(float tara) {
		Tara = tara;
	}
	public String getCondicionesEspeciales() {
		return CondicionesEspeciales;
	}
	public void setCondicionesEspeciales(String condicionesEspeciales) {
		CondicionesEspeciales = condicionesEspeciales;
	}
	public String getPatente() {
		return Patente;
	}
	public void setPatente(String patente) {
		Patente = patente;
	}
	public float getKilometraje() {
		return Kilometraje;
	}
	public void setKilometraje(float kilometraje) {
		Kilometraje = kilometraje;
	}

	
}

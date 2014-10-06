package Bean;

import javax.persistence.*;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;





public class VehiculoDTO {
	
	
	private int id_vehiculo ;
	private String Tipo;
	
	private int id_plan_mantenimiento;
	
	private float volumenTransportado; 
	private float Peso;
	private float Tara;
	private String CondicionesEspeciales; 
	private String Patente;
	private float Kilometraje;
	
	private int id_historico;
	
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
	public int getId_plan_mantenimiento() {
		return id_plan_mantenimiento;
	}
	public void setId_plan_mantenimiento(int id_plan_mantenimiento) {
		this.id_plan_mantenimiento = id_plan_mantenimiento;
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

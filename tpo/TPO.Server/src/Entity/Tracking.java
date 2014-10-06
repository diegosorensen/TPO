package Entity;

import java.sql.Date;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;



@Entity
@Table (name="Tracking")
public class Tracking {
		
	@Id
	private int IDtracking;
	@ManyToOne
	private Vehiculo vehiculo;
	@ManyToOne
	private List<Remito> remitos= new ArrayList<Remito>();

	private Date Fecha;
	private Time Hora;
	private String CoordenadaGPS ;
	
	@ManyToMany
	@JoinTable(name		="TrackingRemitoIntersucursal",
	joinColumns 		= @JoinColumn(name="id_tracking"),
	inverseJoinColumns 	= @JoinColumn(name="id_remitointersucursal"))	
	private List<RemitoIntersucursal> remitoIntersucursales = new ArrayList<RemitoIntersucursal>();
	
	public int getIDtracking() {
		return IDtracking;
	}
	public void setIDtracking(int iDtracking) {
		IDtracking = iDtracking;
	}

	public Vehiculo getVehiculo() {
		return vehiculo;
	}
	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}

	public List<Remito> getRemitos() {
		return remitos;
	}
	public void setRemitos(List<Remito> remitos) {
		this.remitos = remitos;
	}
	public List<RemitoIntersucursal> getRemitoIntersucursales() {
		return remitoIntersucursales;
	}
	public void setRemitoIntersucursales(
			List<RemitoIntersucursal> remitoIntersucursales) {
		this.remitoIntersucursales = remitoIntersucursales;
	}
	public Date getFecha() {
		return Fecha;
	}
	public void setFecha(Date fecha) {
		Fecha = fecha;
	}
	public Time getHora() {
		return Hora;
	}
	public void setHora(Time hora) {
		Hora = hora;
	}
	public String getCoordenadaGPS() {
		return CoordenadaGPS;
	}
	public void setCoordenadaGPS(String coordenadaGPS) {
		CoordenadaGPS = coordenadaGPS;
	}
	
	
}

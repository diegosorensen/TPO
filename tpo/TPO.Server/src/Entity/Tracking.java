package Entity;

import java.sql.Date;
import java.sql.Time;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table (name="Tracking")
public class Tracking {
		
	@Id
	private int IDtracking;
	@OneToMany
	@JoinColumn(name="Vehiculo")
	private int Id_Vehiculo;
	private Remito Remito;
	private Date Fecha;
	private Time Hora;
	private String CoordenadaGPS ;
	public int getIDtracking() {
		return IDtracking;
	}
	public void setIDtracking(int iDtracking) {
		IDtracking = iDtracking;
	}
	public int getId_Vehiculo() {
		return Id_Vehiculo;
	}
	public void setId_Vehiculo(int id_Vehiculo) {
		Id_Vehiculo = id_Vehiculo;
	}
	public Remito getRemito() {
		return Remito;
	}
	public void setRemito(Remito remito) {
		Remito = remito;
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

package Bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;








public class TareaMantenimientoDTO implements Serializable{
	
	
	
	private int id_tarea_mantenimiento;
	
	private List<PlanDeMantenimiento> articulos = new ArrayList<PlanDeMantenimiento>();
	
	private  String Descripcion;
	
	
	
	public int getId_tarea_mantenimiento() {
		return id_tarea_mantenimiento;
	}
	public void setId_tarea_mantenimiento(int id_tarea_mantenimiento) {
		this.id_tarea_mantenimiento = id_tarea_mantenimiento;
	}
	public String getDescripcion() {
		return Descripcion;
	}
	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}
	public int getTiempo() {
		return Tiempo;
	}
	public void setTiempo(int tiempo) {
		Tiempo = tiempo;
	}
	private int Tiempo ;


	
}

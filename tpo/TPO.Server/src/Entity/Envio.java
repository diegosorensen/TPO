package Entity;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table (name="envio")
public class Envio {

	private int id_Envio;				 
	private int id_remito_intersucursal;
	private int ID_EmpresaSubcontratada;
	private String Estado;				 
	private Date Fecha;					 
	private int Id_vehiculo;
	
	public int getId_Envio() {
		return id_Envio;
	}
	public void setId_Envio(int id_Envio) {
		this.id_Envio = id_Envio;
	}
	public int getId_remito_intersucursal() {
		return id_remito_intersucursal;
	}
	public void setId_remito_intersucursal(int id_remito_intersucursal) {
		this.id_remito_intersucursal = id_remito_intersucursal;
	}
	public int getID_EmpresaSubcontratada() {
		return ID_EmpresaSubcontratada;
	}
	public void setID_EmpresaSubcontratada(int iD_EmpresaSubcontratada) {
		ID_EmpresaSubcontratada = iD_EmpresaSubcontratada;
	}
	public String getEstado() {
		return Estado;
	}
	public void setEstado(String estado) {
		Estado = estado;
	}
	public Date getFecha() {
		return Fecha;
	}
	public void setFecha(Date fecha) {
		Fecha = fecha;
	}
	public int getId_vehiculo() {
		return Id_vehiculo;
	}
	public void setId_vehiculo(int id_vehiculo) {
		Id_vehiculo = id_vehiculo;
	}			 

	
	
}

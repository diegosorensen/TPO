package Entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;

import javax.persistence.*;


@Entity
@Table (name="envio")
public class Envio {

	@Id
	private int id_Envio;				 
	private int id_remito_intersucursal;
	
	@ManyToOne
	@JoinColumn(name="EmpresaSubcontratada")
	private List<EmpresaSubcontratada> empresasSubcontratada = new ArrayList<EmpresaSubcontratada>();
	
	private String Estado;				 
	private Date Fecha;					 
	private int Id_vehiculo;
	
	@ManyToMany
	@JoinTable(name		="PaqueteEnvio",
	joinColumns 		= @JoinColumn(name="id_envio"),
	inverseJoinColumns 	= @JoinColumn(name="id_paquete"))	
	private List<Paquete> paquetes = new ArrayList<Paquete>();
	
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

	public List<EmpresaSubcontratada> getEmpresasSubcontratada() {
		return empresasSubcontratada;
	}
	public void setEmpresasSubcontratada(
			List<EmpresaSubcontratada> empresasSubcontratada) {
		this.empresasSubcontratada = empresasSubcontratada;
	}
	public List<Paquete> getPaquetes() {
		return paquetes;
	}
	public void setPaquetes(List<Paquete> paquetes) {
		this.paquetes = paquetes;
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

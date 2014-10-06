package Bean;

import java.io.Serializable;
import java.util.*;

public class EnvioDTO implements Serializable  {


	private static final long serialVersionUID = 1L;
	private int id_Envio;				 
	//private RemitoIntersucursal remito_intersucursal; // Esta clase aun no fue creada
	private List<EmpresaSubcontratadaDTO> empresaSubcontratada;
	private String Estado;				 
	private Date Fecha;					 
	public List<EmpresaSubcontratadaDTO> getEmpresaSubcontratada() {
		return empresaSubcontratada;
	}
	public void setEmpresaSubcontratada(
			List<EmpresaSubcontratadaDTO> empresaSubcontratada) {
		this.empresaSubcontratada = empresaSubcontratada;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
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

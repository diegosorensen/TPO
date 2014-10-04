package Bean;

import java.util.ArrayList;
import java.util.List;


public class EmpresaSubcontratadaDTO {
	
	private int id_EmpresaSubcontratada;
	private String RazonSocial;				
	private String CUIT;						
	private String Tipo;						
	private int Id_VehiculoSubcontratado;
	
	private List<EnvioDTO> envios = new ArrayList<EnvioDTO>();
	public List<EnvioDTO> getEnvios() {
		return envios;
	}
	public void setEnvios(List<EnvioDTO> envios) {
		this.envios = envios;
	}
	public List<VehiculoSubcontratadoDTO> getVehiculoSubcontratado() {
		return VehiculoSubcontratado;
	}
	public void setVehiculoSubcontratado(
			List<VehiculoSubcontratadoDTO> vehiculoSubcontratado) {
		VehiculoSubcontratado = vehiculoSubcontratado;
	}
	private List<VehiculoSubcontratadoDTO> VehiculoSubcontratado = new ArrayList<VehiculoSubcontratadoDTO>();

	
	public int getId_EmpresaSubcontratada() {
		return id_EmpresaSubcontratada;
	}
	public void setId_EmpresaSubcontratada(int id_EmpresaSubcontratada) {
		this.id_EmpresaSubcontratada = id_EmpresaSubcontratada;
	}
	public String getRazonSocial() {
		return RazonSocial;
	}
	public void setRazonSocial(String razonSocial) {
		RazonSocial = razonSocial;
	}
	public String getCUIT() {
		return CUIT;
	}
	public void setCUIT(String cUIT) {
		CUIT = cUIT;
	}
	public String getTipo() {
		return Tipo;
	}
	public void setTipo(String tipo) {
		Tipo = tipo;
	}
	public int getId_VehiculoSubcontratado() {
		return Id_VehiculoSubcontratado;
	}
	public void setId_VehiculoSubcontratado(int id_VehiculoSubcontratado) {
		Id_VehiculoSubcontratado = id_VehiculoSubcontratado;
	}

	
	
}

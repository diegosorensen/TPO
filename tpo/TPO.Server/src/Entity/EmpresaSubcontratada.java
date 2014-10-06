package Entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table (name="EmpresaSubcontratada")
public class EmpresaSubcontratada {
	
	@Id
	private int id_EmpresaSubcontratada;
	private String RazonSocial;				
	private String CUIT;						
	private String Tipo;	
	
	@OneToMany (cascade=CascadeType.ALL)
	private Envio envio;
	
	public Envio getEnvio() {
		return envio;
	}
	public void setEnvio(Envio envio) {
		this.envio = envio;
	}
	@OneToMany (cascade=CascadeType.ALL)
	private List<VehiculoSubcontratado> VehiculoSubcontratado = new ArrayList<VehiculoSubcontratado>();

	
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

	public List<VehiculoSubcontratado> getVehiculoSubcontratado() {
		return VehiculoSubcontratado;
	}
	public void setVehiculoSubcontratado(
			List<VehiculoSubcontratado> vehiculoSubcontratado) {
		VehiculoSubcontratado = vehiculoSubcontratado;
	}

	
	
	
}

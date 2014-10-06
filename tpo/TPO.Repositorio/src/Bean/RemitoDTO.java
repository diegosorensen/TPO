package Bean;

import java.sql.Date;


public class RemitoDTO {
	
	
	private int id_remito;
	private Manifiesto manifiesto;
	private  int Id_SucOrigen;
	private int  id_SucDestino;
	private Date FechaEntrega ;
	private Date FechaMaxima ;
	private String CondicionesEspeciales;
	
	
	
	
	public int getId_remito() {
		return id_remito;
	}
	public void setId_remito(int id_remito) {
		this.id_remito = id_remito;
	}
	public Manifiesto getManifiesto() {
		return manifiesto;
	}
	public void setManifiesto(Manifiesto manifiesto) {
		this.manifiesto = manifiesto;
	}
	public int getId_SucOrigen() {
		return Id_SucOrigen;
	}
	public void setId_SucOrigen(int id_SucOrigen) {
		Id_SucOrigen = id_SucOrigen;
	}
	public int getId_SucDestino() {
		return id_SucDestino;
	}
	public void setId_SucDestino(int id_SucDestino) {
		this.id_SucDestino = id_SucDestino;
	}
	public Date getFechaEntrega() {
		return FechaEntrega;
	}
	public void setFechaEntrega(Date fechaEntrega) {
		FechaEntrega = fechaEntrega;
	}
	public Date getFechaMaxima() {
		return FechaMaxima;
	}
	public void setFechaMaxima(Date fechaMaxima) {
		FechaMaxima = fechaMaxima;
	}
	public String getCondicionesEspeciales() {
		return CondicionesEspeciales;
	}
	public void setCondicionesEspeciales(String condicionesEspeciales) {
		CondicionesEspeciales = condicionesEspeciales;
	}

}
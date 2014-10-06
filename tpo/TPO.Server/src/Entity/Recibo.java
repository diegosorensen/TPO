package Entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table (name="Recibo")
public class Recibo {

	@Id
	private int ID_Recibo;	
	private int ID_Cliente;	
	private int id_itemRecibo; 
	private int Cantidad;		
	private int Importe;
	
	@OneToMany (cascade=CascadeType.ALL)
	private List<Paquete> paquetes = new ArrayList<Paquete>();

	
	public List<Paquete> getPaquetes() {
		return paquetes;
	}
	public void setPaquetes(List<Paquete> paquetes) {
		this.paquetes = paquetes;
	}
	public int getID_Recibo() {
		return ID_Recibo;
	}
	public void setID_Recibo(int iD_Recibo) {
		ID_Recibo = iD_Recibo;
	}
	public int getID_Cliente() {
		return ID_Cliente;
	}
	public void setID_Cliente(int iD_Cliente) {
		ID_Cliente = iD_Cliente;
	}
	public int getId_itemRecibo() {
		return id_itemRecibo;
	}
	public void setId_itemRecibo(int id_itemRecibo) {
		this.id_itemRecibo = id_itemRecibo;
	}
	public int getCantidad() {
		return Cantidad;
	}
	public void setCantidad(int cantidad) {
		Cantidad = cantidad;
	}
	public int getImporte() {
		return Importe;
	}
	public void setImporte(int importe) {
		Importe = importe;
	}		

	
}

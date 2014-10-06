package Entity;

import java.util.List;

import javax.persistence.*;

import Bean.DepositoDTO;
import Bean.EmpleadoDTO;

@Entity
@Table (name="Sucursal")
public class Sucursal {
	
	@Id
	@ManyToMany
	@JoinTable(name		="SucursalRuta",
	joinColumns 		= @JoinColumn(name="id_Sucursal"),
	inverseJoinColumns 	= @JoinColumn(name="id_Ruta"))	
	private int id_Sucursal;
	private String NombreSucursal;
	private String Provincia;
	private String CP;
	private String telefono;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="id_Deposito")
	private DepositoDTO deposito;
	
	@ManyToMany
	@JoinTable(name		="Sucursal_has_Empleado",
	joinColumns 		= @JoinColumn(name="id_Sucursal"),
	inverseJoinColumns 	= @JoinColumn(name="id_Empleado"))	
	private List<EmpleadoDTO> empleados;

	public int getId_Sucursal() {
		return id_Sucursal;
	}

	public void setId_Sucursal(int id_Sucursal) {
		this.id_Sucursal = id_Sucursal;
	}

	public String getNombreSucursal() {
		return NombreSucursal;
	}

	public void setNombreSucursal(String nombreSucursal) {
		NombreSucursal = nombreSucursal;
	}

	public String getProvincia() {
		return Provincia;
	}

	public void setProvincia(String provincia) {
		Provincia = provincia;
	}

	public String getCP() {
		return CP;
	}

	public void setCP(String cP) {
		CP = cP;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public DepositoDTO getDeposito() {
		return deposito;
	}

	public void setDeposito(DepositoDTO deposito) {
		this.deposito = deposito;
	}

	public List<EmpleadoDTO> getEmpleados() {
		return empleados;
	}

	public void setEmpleados(List<EmpleadoDTO> empleados) {
		this.empleados = empleados;
	}

	
	
}

package Entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

import Bean.DepositoDTO;
import Bean.EmpleadoDTO;

@Entity
@Table (name="Sucursal")
public class Sucursal {
	
	@Id
	private int id_Sucursal;
	private String NombreSucursal;
	private String Provincia;
	private String CP;
	private String telefono;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="id_Deposito")
	private Deposito deposito;
	
	@ManyToMany
	@JoinTable(name		="Sucursal_has_Empleado",
	joinColumns 		= @JoinColumn(name="id_Sucursal"),
	inverseJoinColumns 	= @JoinColumn(name="id_Empleado"))	
	private List<Empleado> empleados;

	
	@ManyToMany
	@JoinTable(name		="SucursalRuta",
	joinColumns 		= @JoinColumn(name="id_Sucursal"),
	inverseJoinColumns 	= @JoinColumn(name="id_Ruta"))	
	private List<Ruta> rutas = new ArrayList<Ruta>();
	
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

	public Deposito getDeposito() {
		return deposito;
	}

	public void setDeposito(Deposito deposito) {
		this.deposito = deposito;
	}

	public List<Empleado> getEmpleados() {
		return empleados;
	}

	public void setEmpleados(List<Empleado> empleados) {
		this.empleados = empleados;
	}

	public List<Ruta> getRutas() {
		return rutas;
	}

	public void setRutas(List<Ruta> rutas) {
		this.rutas = rutas;
	}



	
	
}

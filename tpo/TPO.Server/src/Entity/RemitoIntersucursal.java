package Entity;

import java.util.Date;

import javax.persistence.*;


@Entity
@Table (name="RemitoIntersucursal")
public class RemitoIntersucursal {
	
	
	@Id
	private int id_remito_intersucursal;
	private Sucursal SucOrigen;
	private Sucursal SucDestino ;
	private Vehiculo Vehiculo;
	private Date FechaSalida ;
	private Date FechaLlegada;
	private Tracking: Collection <Tracking>;
}

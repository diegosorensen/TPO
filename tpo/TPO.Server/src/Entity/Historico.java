package Entity;

import javax.persistence.*;

import net.sourceforge.jtds.jdbc.DateTime;






@Entity
@Table (name="HistoricoMantenimiento")
public class Historico {
	
	
@Id
private	int id_historico ;
@OneToMany
@JoinColumn(name="Vehiculo")
private int id_vehiculo	;
private DateTime fecha;
public int getId_historico() {
	return id_historico;
}
public void setId_historico(int id_historico) {
	this.id_historico = id_historico;
}
public int getId_vehiculo() {
	return id_vehiculo;
}
public void setId_vehiculo(int id_vehiculo) {
	this.id_vehiculo = id_vehiculo;
}
public DateTime getFecha() {
	return fecha;
}
public void setFecha(DateTime fecha) {
	this.fecha = fecha;
} 

}

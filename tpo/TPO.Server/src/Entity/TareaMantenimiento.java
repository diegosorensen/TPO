package Entity;

import javax.persistence.*;







@Entity
@Table (name="TareaMantenimiento")
public class TareaMantenimiento {
	
	
	
	@Id
	private int id_tarea_mantenimiento;
	private  String Descripcion;
	private int Tiempo ;

	
	
	

}

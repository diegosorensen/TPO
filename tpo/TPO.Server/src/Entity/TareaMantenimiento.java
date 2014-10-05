package Entity;

import javax.persistence.*;







@Entity
@Table (name="TareaMantenimiento")
public class TareaMantenimiento {
	
	
	@Id
	@ManyToMany
	@JoinTable(name	="PlanMantenimiento",
	joinColumns = @JoinColumn(name="id_tarea_mantenimiento"),
	inverseJoinColumns = @JoinColumn(name="id_plan_mantenimiento"))
	private int id_tarea_mantenimiento;
	
	private  String Descripcion;
	private int Tiempo ;


	
}

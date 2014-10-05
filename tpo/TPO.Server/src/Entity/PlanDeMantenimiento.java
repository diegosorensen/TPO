package Entity;
import javax.persistence.*;






@Entity
@Table (name="PlanDeMantenimiento")

public class PlanDeMantenimiento {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id_plan_mantenimiento;
	private  boolean Apto;
	private String descripcion;
	
	

}

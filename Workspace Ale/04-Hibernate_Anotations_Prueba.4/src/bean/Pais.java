package bean;

import java.io.Serializable;

import javax.persistence.*;


@Entity 
public class Pais implements Serializable
{  
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private int id; 

    private String nombre;  

    @OneToOne(cascade={CascadeType.PERSIST,CascadeType.REMOVE}) 
    private Presidente presidente;  

    public Pais() 
    { 
    }  

    public int getId() 
    {  
        return id; 
    }  

    protected void setId(int id) 
    {  
        this.id = id; 
    }  

    public String getNombre() 
    {  
        return nombre; 
    }  

    public void setNombre(String nombre) 
    {  
        this.nombre = nombre; 
    }  

    public Presidente getPresidente() 
    {  
        return presidente; 
    }  

    public void setPresidente(Presidente presidente) 
    {  
        this.presidente = presidente; 
    } 
}

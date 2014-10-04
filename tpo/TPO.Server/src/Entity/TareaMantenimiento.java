package Entity;

import net.sourceforge.jtds.jdbc.DateTime;

public class Paquete {
	
	private int id_Paquete	;		
	private int NroPaqute	;			
	private String Clase	;				
	private String TipoCarga	;			
	private float Alto		;			
	private float Lar		;			
	private float Ancho		;			
	private float Peso			;		
	private float Volumen			;	
	private int Id_Tipo_Tratamiento	;
	private int ID_Tipo_Fragilidad	;
	private int  Apilable				;
	private int  ApilableCantidad		;
	private DateTime FechaEntrega			;
	private String CoordenadaGps			;
	private int Id_remito				;
	private int id_Manifiesto			;
	private int id_recibo				;
	private int Destino				;
	private String  Refrigerada			;
	private String Manipulacion			;
	private String  Estado				;
	private String  Observaciones			;


}

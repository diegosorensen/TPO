package app;

public class inicio {

	public static void main(String[] args) {

		sistema sis = new sistema();
		sis.addArticulo(1,"Coca Cola",30.50,"Consumidor Final",1);
		sis.addArticulo(2,"pesi",29.50,"Exento de Ingresos Butos",2);		
		//sis.addProveedor("31641","Casablanca", "juan.B Justo", "2330","palermo","1414");
		
		//sis.grabarVenta("");
		System.out.println(sis.getArticulos());
		sis.grabarArticulo(sis.getArticulos());
		
	}

}

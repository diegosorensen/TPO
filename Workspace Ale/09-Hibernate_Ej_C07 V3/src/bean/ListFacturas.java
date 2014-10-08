package bean;

import java.util.ArrayList;
import java.util.List;

public class ListFacturas {

	private List<Articulos> facturas = new ArrayList<Articulos>();

	public List<Articulos> getFacturas() {
		return facturas;
	}
	
	public List<Articulos> getArti() {
		return facturas;
	}

	public void setFactura(List<Articulos> fac) {
		this.facturas = fac;
	}

	public void addFactura(Articulos fac){
		facturas.add(fac);
	}
	
	public void removeFactura(Articulos fac){
		facturas.remove(fac);
	}
}

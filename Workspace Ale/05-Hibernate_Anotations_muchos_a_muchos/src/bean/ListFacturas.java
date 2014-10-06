package bean;

import java.util.ArrayList;
import java.util.List;

public class ListFacturas {

	private List<Factura> facturas = new ArrayList<Factura>();

	public List<Factura> getFacturas() {
		return facturas;
	}
	
	public List<Factura> getArti() {
		return facturas;
	}

	public void setFactura(List<Factura> fac) {
		this.facturas = fac;
	}

	public void addFactura(Factura fac){
		facturas.add(fac);
	}
	
	public void removeFactura(Factura fac){
		facturas.remove(fac);
	}
}

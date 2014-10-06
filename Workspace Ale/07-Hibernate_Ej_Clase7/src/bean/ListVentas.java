package bean;

import java.util.ArrayList;
import java.util.List;

public class ListVentas {

	private List<Venta> ventas = new ArrayList<Venta>();

	public List<Venta> getVenta() {
		return ventas;
	}

	public void setVenta(List<Venta> venta) {
		this.ventas = venta;
	}
}

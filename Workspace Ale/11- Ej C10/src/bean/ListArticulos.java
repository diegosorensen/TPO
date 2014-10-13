package bean;

import java.util.ArrayList;
import java.util.List;

public class ListArticulos {

	private List<Proveedor> articulos = new ArrayList<Proveedor>();

	public List<Proveedor> getArticulos() {
		return articulos;
	}
	
	public List<Proveedor> getArti() {
		return articulos;
	}

	public void setArti(List<Proveedor> art) {
		this.articulos = art;
	}

	public void addArticulo(Proveedor art){
		articulos.add(art);
	}
	
	public void removeArticulo(Proveedor art){
		articulos.remove(art);
	}
}

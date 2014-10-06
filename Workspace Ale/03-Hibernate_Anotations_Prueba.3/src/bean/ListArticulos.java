package bean;

import java.util.ArrayList;
import java.util.List;

public class ListArticulos {

	private List<Articulo> articulos = new ArrayList<Articulo>();

	public List<Articulo> getArticulos() {
		return articulos;
	}
	
	public List<Articulo> getArti() {
		return articulos;
	}

	public void setArti(List<Articulo> art) {
		this.articulos = art;
	}

	public void addArticulo(Articulo art){
		articulos.add(art);
	}
	
	public void removeArticulo(Articulo art){
		articulos.remove(art);
	}
}

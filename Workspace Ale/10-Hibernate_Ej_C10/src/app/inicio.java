package app;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import bean.Material;
import bean.Unidad;

public class inicio {

	public static void main(String[] args) {

		sistema sis = new sistema();

		/*  Parte 1 Persistencia
		
		/*  Parte 1 Persistencia */
		// Dar de alta datos
//		Unidad unidad = sis.altaUnidad(1,"centimetros");
//		System.out.println(unidad.getCodigoUnidad()+" - "+unidad.getDescripcion());
		
//		sis.grabarUnidad(unidad);
		
		//Material material = sis.altaMaterial(1,"Aceite", 1,1);
		
	
		/*  Parte 2 lectura de la base */
		System.out.println("Leo un material");
		Material material = sis.leerMaterial(1);
		
		System.out.println("descripcion - "+material.getDescripcion());
		System.out.println("Leo varias Unidades");
		List<Unidad> unidades = sis.leerUnidad(3);
		
		for (Unidad unidad : unidades) {
			System.out.println("Unidades:");
			System.out.println("codigo "+unidad.getCodigoUnidad()+" Descripcion: "+unidad.getDescripcion());
		}
	}

}

package gestor;

import java.util.ArrayList;

import accesoBBDD.objetos.Cine;
import accesoBBDD.objetos.Pelicula;

public class InfoCines {
	 Cine cine = new Cine();
	
	 //Obtener todos los cines disponibles
	public ArrayList<Cine> listarCinesDisponibles() {
		 //Aqui se recorrre el resulset devuelto de la llamada a BBDD y se carga en el ARRAYLIST

		ArrayList listaCines = new ArrayList<>();
		return null;
		 
	}
	
	//Obtener todas las películas de un cine
	 public ArrayList<Pelicula> listaPelisCine(Cine cine){
		 //Aqui se recorrre el resulset devuelto de la llamada a BBDD y se carga en el ARRAYLIST

		 ArrayList<Pelicula> listaPelis = new ArrayList<>();
		return listaPelis;
	}

}

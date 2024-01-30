package gestor;

import java.util.ArrayList;

import accesoBBDD.objetos.Cine;
import accesoBBDD.objetos.Pelicula;
import accesoBBDD.objetos.Sesion;

public class InfoCines {
	 Cine cine = new Cine();
	
	 //Obtener todos los cines disponibles
	public ArrayList<Cine> listarCinesDisponibles() {
		 //Aqui se recorrre el resulset devuelto de la llamada a BBDD y se carga en el ARRAYLIST
		ArrayList<Cine> listaDummie = new ArrayList<>();
		for (int i = 5; i > 0; i--)
			listaDummie.add(new Cine());

		return listaDummie;

		 
	}
	
	//Obtener todas las películas de un cine
	 public ArrayList<Pelicula> listaPelisCine(Cine cine){
		 //Aqui se recorrre el resulset devuelto de la llamada a BBDD y se carga en el ARRAYLIST

		 ArrayList<Pelicula> listaDummie = new ArrayList<>();
			for (int i = 5; i > 0; i--)
				listaDummie.add(new Pelicula());
			return listaDummie;
	}

}

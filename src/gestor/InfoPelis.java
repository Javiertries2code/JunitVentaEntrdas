package gestor;

import java.util.ArrayList;

import accesoBBDD.objetos.Pelicula;
import accesoBBDD.objetos.Sala;
import accesoBBDD.objetos.Cine;
public class InfoPelis {
	
	Pelicula peli = new Pelicula();
	
	ArrayList<Pelicula> listaPelis = new ArrayList<>();
	
	

	 public ArrayList<Pelicula> listaPelisCine(Cine cine){
		 ArrayList<Pelicula> listaPelis = new ArrayList<>(); 
		return listaPelis;
	}
	
	 public ArrayList<Sala> salasProyeccion(Pelicula pelicula){
		 ArrayList<Pelicula> listaSalas = new ArrayList<>(); 
			return listaSalas; 
	 };
	 
	 
}

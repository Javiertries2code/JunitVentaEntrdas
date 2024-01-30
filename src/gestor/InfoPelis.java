package gestor;

import java.util.ArrayList;
import java.util.Date;
import accesoBBDD.objetos.*;

public class InfoPelis {
	
	Pelicula peli = new Pelicula();
	
	ArrayList<Pelicula> listaPelis = new ArrayList<>();
	
	
	 public ArrayList<Pelicula> listaPelisCine(Cine cine){
		 //Aqui se recorrre el resulset devuelto de la llamada a BBDD y se carga en el ARRAYLIST

		 ArrayList<Pelicula> listaPelis = new ArrayList<>();
		return listaPelis;
	}
	
	 public ArrayList<Sala> salasProyeccion(Pelicula pelicula){
	 //Aqui se recorrre el resulset devuelto de la llamada a BBDD y se carga en el ARRAYLIST
		 ArrayList<Sala> listaSalas = new ArrayList<>(); 
			return listaSalas; 
	 };
	 
	 
	 //Fechas de una película
	 public ArrayList<Date> fechasDeUnaPelicula(Pelicula pelicula){
		 //Aqui se recorrre el resulset devuelto de la llamada a BBDD y se carga en el ARRAYLIST
		 ArrayList<Date> fechasDeUnaPelicula = new ArrayList<>(); 
			return fechasDeUnaPelicula;  
	 }
	 
	 //Precio de una película
	 private int precioPelicula(Pelicula pelicula) {
		 int precio = 0;
		 //aqui se llama a la BD y devuelve el precio
		 return precio;
	 }
	 
	 //Ordenar películas
	 public ArrayList<Pelicula> ordenarPeliculas(ArrayList<Pelicula> listaPeliculas) {
		 //Aqui se ordena la lista
		 //listaPeliculas.sort(Pelicula.getId());
		 return listaPeliculas;
	 }
	 
}

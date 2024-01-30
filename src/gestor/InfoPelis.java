package gestor;

import java.util.ArrayList;
import java.util.Date;

import org.junit.BeforeClass;

import accesoBBDD.objetos.*;

public class InfoPelis {
	
	Pelicula peli = new Pelicula();
	
	ArrayList<Pelicula> listaPelis = new ArrayList<>();
	
private static ArrayList<Pelicula> listaDummie = new ArrayList<>();
	
public static void listaDummie() {
		Pelicula pelicula1 = new Pelicula(1, "Pelicula1", "Drama", 1, 1.05D);
		Pelicula pelicula2 = new Pelicula(2, "Pelicula1", "Drama", 2, 2.05D);
		Pelicula pelicula3 = new Pelicula(3, "Pelicula3", "Drama", 3, 3.05D);
		listaDummie.add(pelicula1);
		listaDummie.add(pelicula2);
		listaDummie.add(pelicula3);}
	
	 public ArrayList<Pelicula> listaPelisCine(Cine cine){
		 //Aqui se recorrre el resulset devuelto de la llamada a BBDD y se carga en el ARRAYLIST

		
		return listaDummie;
	}
	
	 public ArrayList<Sala> salasProyeccion(Pelicula pelicula){
	 //Aqui se recorrre el resulset devuelto de la llamada a BBDD y se carga en el ARRAYLIST
		 ArrayList<Sala> listaSalasDummie = new ArrayList<>(); 
		 for(int i = 5; i > 0; i--)
			 listaSalasDummie.add(new Sala());
			return listaSalasDummie; 
	 };
	 
	 
	 //Fechas de una película
	 public ArrayList<Date> fechasDeUnaPelicula(Pelicula pelicula){
		 //Aqui se recorrre el resulset devuelto de la llamada a BBDD y se carga en el ARRAYLIST
		 ArrayList<Date> fechasDeUnaPelicula = new ArrayList<>(); 
		 for(int i = 5; i > 0; i--)
			 fechasDeUnaPelicula.add(new Date());
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

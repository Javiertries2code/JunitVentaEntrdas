package gestor;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Date;

import org.junit.BeforeClass;
import org.junit.Test;

import accesoBBDD.objetos.Cine;
import accesoBBDD.objetos.Pelicula;
import accesoBBDD.objetos.Sala;

public class InfoPelisTest {

	private static ArrayList<Pelicula> listaPeliculas = new ArrayList<>();

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		Pelicula pelicula1 = new Pelicula(1, "Pelicula1", "Drama", 1, 1.05D);
		Pelicula pelicula2 = new Pelicula(2, "Pelicula1", "Drama", 2, 2.05D);
		Pelicula pelicula3 = new Pelicula(3, "Pelicula3", "Drama", 3, 3.05D);
		listaPeliculas.add(pelicula1);
		listaPeliculas.add(pelicula2);
		listaPeliculas.add(pelicula3);

	}

	@Test
	public final void testListaPelisCine() {
		// creamos la lista a comparar, y un cine del que pediremos la lista de pelis
		ArrayList<Pelicula> listaExpected = new ArrayList<Pelicula>();
		Cine cine1 = new Cine();
		InfoPelis infoPelis = new InfoPelis();
		// esto deberia devolver la listaDummie creada en la clase que testeamos
		ArrayList<Pelicula> listaObtenida = infoPelis.listaPelisCine(cine1);
//comprobamos que la lista obtenidda no devuelve null
		// tirara fallo pq no tenemos aun datos para que los devuelva
		assertNotNull("No se obtenido nigun elemento de lista", listaObtenida);
		// comprobamos que la lista obtenida devuelve lo que esperamos
		assertEquals("La lista obtenida no coincide con la esperada", listaExpected, listaObtenida);

	}

//lo mismo, creamos una lista dummie, y  la llamada al metodo nos devolvera una lista 
	// en este caso tb una lista dummie
	@Test
	public final void testSalasProyeccion() {
		ArrayList<Sala> listaSalasDummie = new ArrayList<>();
		for (int i = 5; i > 0; i--)
			listaSalasDummie.add(new Sala());

		InfoPelis infoPelis = new InfoPelis();

		ArrayList<Sala> listaObtenida = infoPelis.salasProyeccion(new Pelicula());
		assertNotNull("No se obtenido nigun elemento de lista", listaObtenida);
		assertEquals("La lista obtenida no coincide con la esperada", listaSalasDummie, listaObtenida);

	}

	@Test
	public final void testFechasDeUnaPelicula() {
		InfoPelis infoPelis = new InfoPelis();

		ArrayList<Date> listaObtenida = infoPelis.fechasDeUnaPelicula(new Pelicula());
		ArrayList<Date> fechasDeUnaPeliculaDummie = new ArrayList<>();
		for (int i = 5; i > 0; i--)
			fechasDeUnaPeliculaDummie.add(new Date());

		assertNotNull("No se obtenido nigun elemento de lista", listaObtenida);
		assertEquals("La lista obtenida no coincide con la esperada", fechasDeUnaPeliculaDummie, listaObtenida);
	}

	@Test
	public final void testOrdenarPeliculas() {
		// no dice en el enunciado mas que ordenarla, ni que hacer si ya esta ordenada
		// ni bajo que criterio ordenarla
		InfoPelis infoPelis = new InfoPelis();

		ArrayList<Pelicula> listaObtenida = infoPelis.ordenarPeliculas(new ArrayList<>());
		ArrayList<Date> ordenarPeliculaDummie = new ArrayList<>();
		for (int i = 5; i > 0; i--)
			ordenarPeliculaDummie.add(new Date());
		assertNotSame("La lista no se ha ordenado", listaObtenida, ordenarPeliculaDummie);
		assertNotNull("No se obtenido nigun elemento de lista", listaObtenida);
		// obviamente da error, porque no tenemos datos
		assertEquals("La lista obtenida no coincide con la esperada", ordenarPeliculaDummie, listaObtenida);

	}

}

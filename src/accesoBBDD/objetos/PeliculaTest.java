package accesoBBDD.objetos;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
//import org.junit.DisplayName;
//import org.junit.api.DisplayName;
// i cant make it work

public class PeliculaTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	ArrayList<Pelicula> listaPeliculas = new ArrayList<>();
		Pelicula pelicula1 = new Pelicula(1, "Pelicula1", "Drama", 1, 2.05D);
		Pelicula pelicula2 = new Pelicula(2, "Pelicula2", "Miedito", 3, 2.05D);
		Pelicula pelicula3 = new Pelicula(3, "Pelicula3", "Miedito", 3, 2.05D);
		listaPeliculas.add(pelicula1);
		listaPeliculas.add(pelicula2);
		listaPeliculas.add(pelicula3);

	}

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public final void testPelicula(int id, String nombre, String genero, int duracion, double coste) {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testPelicula() {
		fail("Not yet implemented"); // TODO
	}

	//@DisplayName("aqui testeamos el metodo GetId de la clase Pelicula")
	@Test
	public final void testGetId() {
		asserNotNull("no se ha obtenido resultado", pelicula1.getId());
		assertEquals("El registro obtenido no coincide con el esperado", 1,  pelicula1.getId());

	}

	
	@Test
	public final void testSetId() {
		Pelicula pelicula = new Pelicula();
		int numExpected = 5;
		pelicula.setId(numExpected);
		assertNotNull("no se ha registrado la insercion", pelicula.getId());
		assertEquals("El registro obtenido no coincide con el esperado", numExpected , pelicula.getId() );


	}

	@Test
	public final void testGetNombre() {
		asserNotNull("no se ha obtenido resultado", pelicula1.getNombre())
		assertEquals("El registro obtenido no coincide con el esperado", "Pelicula1",  pelicula1.getNombre());

	}

	@Test
	public final void testSetNombre() {
		Pelicula pelicula = new Pelicula();
		String nameExpected = "Antonio";
		pelicula.setNombre(nameExpected);
		assertNotNull("no se ha registrado la insercion", pelicula.getNombre());
		assertEquals("El registro obtenido no coincide con el esperado", nameExpected,  pelicula.getNombre());
	}

	@Test
	public final void testGetGenero() {
		asserNotNull("no se ha obtenido resultado", pelicula1.getGenero());
		assertEquals("El registro obtenido no coincide con el esperado", "Drama",  pelicula1.getGenero());

	}

	@Test
	public final void testSetGenero() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testGetDuracion() {
		asserNotNull("no se ha obtenido resultado", pelicula1.getGenero());

		assertEquals("El registro obtenido no coincide con el esperado", 1,  pelicula1.getDuracion());
	}

	@Test
	public final void testSetDuracion() {
		Pelicula pelicula = new Pelicula();
		int expectedDuracion = 1;
		pelicula.setDuracion(expectedDuracion);
		assertNotNull("no se ha registrado la insercion", pelicula.getDuracion());
		assertEquals("El registro obtenido no coincide con el esperado", expectedDuracion,  pelicula.getDuracion());
	
	}

	@Test
	public final void testGetCoste() {
		asserNotNull("no se ha obtenido resultado", pelicula1.getCoste());

		assertEquals("El registro obtenido no coincide con el esperado", 1,  pelicula1.getDuracion(), pelicula1.GetGenero());
	}

	@SuppressWarnings("deprecation")
	@Test
	public final void testSetCoste() {
		Pelicula pelicula = new Pelicula();
		double expectedCoste = 1;
		pelicula.setCoste(expectedCoste);
		assertNotNull("no se ha registrado la insercion", pelicula.getCoste());
		assertEquals("El registro obtenido no coincide con el esperado", expectedCoste,  pelicula.getCoste());

	}

	@Test
	public final void testEqualsObject() {
		Pelicula pelicula = new Pelicula();
		assertNotNull(pelicula.equals(pelicula));

	}
	
	@Test
	public final void testToString() {
		Pelicula pelicula = new Pelicula();
	
		assertEquals("el String obetenido no es correcto","Pelicula [id="", nombre="", genero="", duracion="", coste=""]", pelicula.toString());
	}

}

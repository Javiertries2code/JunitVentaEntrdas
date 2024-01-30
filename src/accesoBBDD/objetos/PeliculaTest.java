package accesoBBDD.objetos;

import accesoBBDD.objetos.Pelicula;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class PeliculaTest {

	public final void testGetId() {
		// Creo los objetos aqui, uno vacio y otro con datos
		Pelicula peliculaVacia = new Pelicula();
		Pelicula pelicula1 = new Pelicula(1, "Pelicula1", "Drama", 1, 2.05D);
		// compruebo que el que tiene datos ni tiene null, ni un valor diferente al
		// asignado;
		assertNotEquals("No se ha registrado la insercion", 0, pelicula1.getId());
		assertEquals("El registro obtenido no coincide con el esperado", 1, pelicula1.getId());

		// compruebo que los datos del objeto vacio devuelven 0.
		assertNotEquals("El registro no es 0 cuando deberia serlo", 0, peliculaVacia.getId());
		// compruebo que los tipos de dato son enteros en este caso, aunque tiraria
		// exception si no lo fueran
		Integer num = pelicula.getId();
		assertTrue(num instanceof Integer);
		Integer numEmpty = pelicula1.getId();
		assertTrue(numEmpty instanceof Integer);
	}

	// IFDK why, but i can't get to make it work placing pelicula1.getId() inside
	// the assertion instead of num

	@Test
	public final void testSetId() {
		// + d lo mismo, instancio objeto.
		Pelicula pelicula = new Pelicula();
		// llamo al metodo setid
		Integer numExpected = 5;
		pelicula.setId(numExpected);
		// compruebo que no es nulo primero , y que se ha registrado el dato
		// correctamente
		Integer num = pelicula.getId();
//Parece innecesario, pero si no hago lo de Integer num = pelicula.getId();, me tira fallo en la afirmacion.
		assertNotEquals("No se ha registrado la insercion", 0, pelicula.getId());
		assertEquals("El registro obtenido no coincide con el esperado", numExpected, num);
//este comprueba el tipo de dato, no seria necesario tp
		assertTrue(num instanceof Integer);

	}

	@Test
	public final void testGetGenero() {
		//objetos
		Pelicula pelicula1 = new Pelicula(1, "Pelicula1", "Drama", 1, 2.05D);
		Pelicula peliculaVacia = new Pelicula();
		//ojo,  esta dos veces  peliculaVacia.getGenero() pq asi imprime el elemento en el mensaje de error
		assertNull("El registro deberia ser nulo en vez de " + peliculaVacia.getGenero(), peliculaVacia.getGenero());
		assertNotNull("no se ha obtenido resultado", pelicula1.getGenero());
		
		assertEquals("El registro obtenido no coincide con el esperado", "Drama", pelicula1.getGenero());
		assertTrue("pelicula1 es String",  pelicula1.getGenero() instanceof String);
		assertTrue("peliculaVacia es String",  peliculaVacia.getGenero() instanceof String);

	}

	@Test
	public final void testSetGenero() {
		Pelicula pelicula = new Pelicula();
		String nameExpected = "Antonio";
		pelicula.setGenero(nameExpected);
		assertNotNull("no se ha registrado la insercion", pelicula.getGenero());
		assertEquals("El registro obtenido no coincide con el esperado", nameExpected,  pelicula.getGenero());
	}




	
	@Test
	public final void testGetDuracion() {
		Integer numExpected = 1;

		Pelicula pelicula1 = new Pelicula(1, "Pelicula1", "Drama", numExpected, 2.05D);

		assertNotNull("no se ha obtenido resultado", pelicula1.getGenero());
		Integer num = pelicula1.getDuracion();
		assertEquals("El registro obtenido no coincide con el esperado", numExpected, num);
		assertTrue(num instanceof Integer);

	}

	@Test
	public final void testSetDuracion() {
		Pelicula pelicula = new Pelicula();
		Integer expectedDuracion = 1;
		pelicula.setDuracion(expectedDuracion);
		assertNotNull("no se ha registrado la insercion", pelicula.getDuracion());
		
		assertEquals("El registro obtenido no coincide con el esperado", expectedDuracion, pelicula.getDuracion());

	}

	@Test
	public final void testGetCoste() {
		Double costeExpected = 2.05D;
		Pelicula pelicula1 = new Pelicula(1, "Pelicula1", "Drama", 1, costeExpected);

		assertNotNull("no se ha obtenido resultado", pelicula1.getCoste());
		Double costeObtenido = pelicula1.getCoste();
		assertEquals("El registro obtenido no coincide con el esperado", costeExpected, costeObtenido);
	}

	@SuppressWarnings("deprecation")
	@Test
	public final void testSetCoste() {
		Pelicula pelicula = new Pelicula();
		Double expectedCoste = 1.00D;
		pelicula.setCoste(expectedCoste);
		assertNotNull("no se ha registrado la insercion", pelicula.getCoste());
		assertEquals("El registro obtenido no coincide con el esperado", expectedCoste,  pelicula.getCoste());
		Double num = pelicula.getCoste();
		assertTrue(num instanceof Double);
	}

	@Test
	public final void testEqualsObject() {
		Pelicula pelicula1 = new Pelicula(1, "Pelicula1", "Drama", 1, 2.05D);
		
		assertSame("Son peliculas diferentes",pelicula1, new Pelicula(1, "Pelicula1", "Drama", 1, 2.05D) );

	}

	@Test
	public final void testToString() {
		Pelicula pelicula = new Pelicula();

		assertEquals("El registro obtenido no coincide con el esperado", "Test to String", pelicula.toString());
	}

}

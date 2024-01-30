package gestor;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.ArrayList;

import org.junit.Before;


import accesoBBDD.objetos.Cine;
import org.junit.BeforeClass;
import org.junit.Test;

import accesoBBDD.objetos.Cine;

public class InfoCinesTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public final void testListarCinesDisponibles() {
		ArrayList<Cine>  listaCines = new ArrayList<>();
		//Aqui se cargan los cines disponibles uno a uno
		//desde el resultset de la peticion a BBDD
		assertNotNull( "No se ha recibido ningun elemento",listaCines);
		for ( var i = 0; i < listaCines.size(); i++) {
			assertTrue(listaCines.get(i) instanceof Cine);
		}
							
	}

	@Test
	public final void testListaPelisCine() {
		ArrayList<Pelicula> listaPelisCine = new ArrayList<E>();
		fail("Not yet implemented"); // TODO
	}

}

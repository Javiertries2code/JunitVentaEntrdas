package gestor;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import accesoBBDD.objetos.Cine;
import accesoBBDD.objetos.Pelicula;
import accesoBBDD.objetos.Sesion;

public class InfoCinesTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public final void testListarCinesDisponibles() {
		InfoCines infoCines = new InfoCines();
		ArrayList<Sesion> listaDummie = new ArrayList<>();
		for (int i = 5; i > 0; i--)
			listaDummie.add(new Sesion());
		ArrayList<Cine> listaObtenida = infoCines.listarCinesDisponibles();
		assertNotNull("No se obtenido nigun elemento de lista", listaObtenida);
		assertEquals("La lista obtenida no coincide con la esperada", listaDummie, listaObtenida);
		}
	
	@Test
	public final void testListaPelisCine() {
		InfoCines infoCines = new InfoCines();
		ArrayList<Pelicula> listaDummie = new ArrayList<>();
		Cine cine = new Cine();		for (int i = 5; i > 0; i--)
			listaDummie.add(new Pelicula());
		ArrayList<Pelicula> listaObtenida = infoCines.listaPelisCine(cine);
		assertNotNull("No se obtenido nigun elemento de lista", listaObtenida);
		assertEquals("La lista obtenida no coincide con la esperada", listaDummie, listaObtenida);
		
	}

}

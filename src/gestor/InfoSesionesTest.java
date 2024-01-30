package gestor;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Date;

import org.junit.BeforeClass;
import org.junit.Test;

import accesoBBDD.objetos.Sesion;

public class InfoSesionesTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Test
	public final void testSesionesEnFecha() {
		InfoSesiones infoSesiones = new InfoSesiones();
		
		ArrayList<Sesion> listaSesionesDummie = new ArrayList<>();
		for (int i = 5; i > 0; i--)
			listaSesionesDummie.add(new Sesion());
		ArrayList<Sesion> listaSesionesObtenida = infoSesiones.SesionesEnFecha(new Date());
		assertNotNull("No se obtenido nigun elemento de lista", listaSesionesObtenida);
		//Sae old story, it thorws fails as dummi lists are different
		assertEquals("La lista obtenida no coincide con la esperada", listaSesionesDummie, listaSesionesObtenida);
		
	}

}

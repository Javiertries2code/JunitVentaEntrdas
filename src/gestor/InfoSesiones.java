package gestor;

import java.util.ArrayList;
import java.util.Date;
import accesoBBDD.objetos.*;

public class InfoSesiones {

	// Sesiones de una película en una fecha concreta
	public ArrayList<Sesion> SesionesEnFecha(Date date) {
		// Aqui se recorrre el resulset devuelto de la llamada a BBDD y se carga en el
		// ARRAYLIST
		ArrayList<Sesion> listaSesionesDummie = new ArrayList<>();
		for (int i = 5; i > 0; i--)
			listaSesionesDummie.add(new Sesion());

		return listaSesionesDummie;

	}

}

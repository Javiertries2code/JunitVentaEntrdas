package accesoBBDD.objetos;

import java.util.Objects;

public class Pelicula {

	
private int id;
private String nombre;
private String genero;
private int duracion;
private double coste;

public Pelicula(int id, String nombre, String genero, int duracion, double coste) {
	super();
	this.id = id;
	this.nombre = nombre;
	this.genero = genero;
	this.duracion = duracion;
	this.coste = coste;
}

public Pelicula() {
	super();
}

/**
 * @return the id
 */
public int getId() {
	return id;
}

/**
 * @param id the id to set
 */
public void setId(int id) {
	this.id = id;
}

/**
 * @return the nombre
 */
public String getNombre() {
	return nombre;
}

/**
 * @param nombre the nombre to set
 */
public void setNombre(String nombre) {
	this.nombre = nombre;
}

/**
 * @return the genero
 */
public String getGenero() {
	return genero;
}

/**
 * @param genero the genero to set
 */
public void setGenero(String genero) {
	this.genero = genero;
}

/**
 * @return the duracion
 */
public int getDuracion() {
	return duracion;
}

/**
 * @param duracion the duracion to set
 */
public void setDuracion(int duracion) {
	this.duracion = duracion;
}

/**
 * @return the coste
 */
public double getCoste() {
	return coste;
}

/**
 * @param coste the coste to set
 */
public void setCoste(double coste) {
	this.coste = coste;
}

@Override
public int hashCode() {
	return Objects.hash(coste, duracion, genero, id, nombre);
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Pelicula other = (Pelicula) obj;
	return Double.doubleToLongBits(coste) == Double.doubleToLongBits(other.coste) && duracion == other.duracion
			&& Objects.equals(genero, other.genero) && id == other.id && Objects.equals(nombre, other.nombre);
}

@Override
public String toString() {
	return "Pelicula [id=" + id + ", nombre=" + nombre + ", genero=" + genero + ", duracion=" + duracion + ", coste="
			+ coste + "]";
}




}

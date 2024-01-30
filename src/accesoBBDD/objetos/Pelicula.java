package accesoBBDD.objetos;

import java.util.Objects;

public class Pelicula {

	
private Integer id;
private String nombre;
private String genero;
private Integer duracion;
private Double coste;

public Pelicula(Integer id, String nombre, String genero, Integer duracion, Double coste) {
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
public void setId(Integer id) {
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
public Integer getDuracion() {
	return duracion;
}

/**
 * @param duracion the duracion to set
 */
public void setDuracion(Integer duracion) {
	this.duracion = duracion;
}

/**
 * @return the coste
 */
public Double getCoste() {
	return coste;
}

/**
 * @param coste the coste to set
 */
public void setCoste(Double coste) {
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
	return "Test to String";
}




}

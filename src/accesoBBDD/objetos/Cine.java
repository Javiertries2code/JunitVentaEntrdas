package accesoBBDD.objetos;

import java.util.Objects;

public class Cine {

private int idCine;
private String nombre;
private int direccion;
public Cine(int idCine, String nombre, int direccion) {
	super();
	this.idCine = idCine;
	this.nombre = nombre;
	this.direccion = direccion;
}
public Cine() {
	super();
}
/**
 * @return the idCine
 */
public int getIdCine() {
	return idCine;
}
/**
 * @param idCine the idCine to set
 */
public void setIdCine(int idCine) {
	this.idCine = idCine;
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
 * @return the direccion
 */
public int getDireccion() {
	return direccion;
}
/**
 * @param direccion the direccion to set
 */
public void setDireccion(int direccion) {
	this.direccion = direccion;
}
@Override
public int hashCode() {
	return Objects.hash(direccion, idCine, nombre);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Cine other = (Cine) obj;
	return direccion == other.direccion && idCine == other.idCine && Objects.equals(nombre, other.nombre);
}	



}

package beans;

import java.util.ArrayList;

public class Casa {
	
	private double precio;
	ArrayList <Habitacion> listaHabitaciones;
	Persona  propietario;
	Direccion direccion;
	
// --------------to string	
	@Override
	public String toString() {
		return "Casa [\nprecio=" + precio + "\nlistaHabitaciones=" + listaHabitaciones + "\npropietario=" + propietario
				+ "\ndireccion=" + direccion + "]";
	}

//----------constructores
	public Casa(Double precio, ArrayList<Habitacion> listaHabitaciones, Persona propietario, Direccion direccion) {
		super();
		this.precio = precio;
		this.listaHabitaciones = listaHabitaciones;
		this.propietario = propietario;
		this.direccion = direccion;
	}

public Casa() {
	super();
}
// --------------geter  setter
/**
 * @return the precio
 */
public double getPrecio() {
	return precio;
}

/**
 * @param precio the precio to set
 */
public void setPrecio(double precio) {
	this.precio = precio;
}

/**
 * @return the listaHabitaciones
 */
public ArrayList<Habitacion> getListaHabitaciones() {
	return listaHabitaciones;
}

/**
 * @param listaHabitaciones the listaHabitaciones to set
 */
public void setListaHabitaciones(ArrayList<Habitacion> listaHabitaciones) {
	this.listaHabitaciones = listaHabitaciones;
}

/**
 * @return the propietario
 */
public Persona getPropietario() {
	return propietario;
}

/**
 * @param propietario the propietario to set
 */
public void setPropietario(Persona propietario) {
	this.propietario = propietario;
}

/**
 * @return the direccion
 */
public Direccion getDireccion() {
	return direccion;
}

/**
 * @param direccion the direccion to set
 */
public void setDireccion(Direccion direccion) {
	this.direccion = direccion;
}
	



	
	
}
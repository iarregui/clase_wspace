package beans;

public class Persona {
	private String Nombre;
	private String Edad;
	
	@Override
	public String toString() {
		return "Persona [Nombre=" + Nombre + ", Edad=" + Edad + "]";
	}

	
	
	public Persona() {
		super();
	}



	public Persona(String nombre, String edad) {
		super();
		Nombre = nombre;
		Edad = edad;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return Nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	/**
	 * @return the edad
	 */
	public String getEdad() {
		return Edad;
	}

	/**
	 * @param edad the edad to set
	 */
	public void setEdad(String edad) {
		Edad = edad;
	}
 

	
	
	
	
	
	
	
	
}
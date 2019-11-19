package beans;

public class Director {
	private String nombre;
	private int edad;
	
	
	// setter and gettetr
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
	 * @return the edad
	 */
	public int getEdad() {
		return edad;
	}
	/**
	 * @param edad the edad to set
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
	//---------------------------------- constructores
	public Director(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}
	public Director() {
		super();
	}
	
	
	
	
	
//--------------------to string 
	
	@Override
	public String toString() {
		return "Director [nombre=" + nombre + ", edad=" + edad + "]";
	}
	
	
	

}

package beans;

public class Pelicula {
	
	private String titulo;
	private String enero;
	private Director director;
	private int anioEstreno;
	
	
	
	//----------------getter y Setter
	/**
	 * @return the titulo
	 */
	public String getTitulo() {
		return titulo;
	}







	/**
	 * @param titulo the titulo to set
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}







	/**
	 * @return the enero
	 */
	public String getEnero() {
		return enero;
	}







	/**
	 * @param enero the enero to set
	 */
	public void setEnero(String enero) {
		this.enero = enero;
	}







	/**
	 * @return the director
	 */
	public Director getDirector() {
		return director;
	}







	/**
	 * @param director the director to set
	 */
	public void setDirector(Director director) {
		this.director = director;
	}







	/**
	 * @return the anioEstreno
	 */
	public int getAnioEstreno() {
		return anioEstreno;
	}







	/**
	 * @param anioEstreno the anioEstreno to set
	 */
	public void setAnioEstreno(int anioEstreno) {
		this.anioEstreno = anioEstreno;
	}





	
	
	
	// to string
	@Override
	public String toString() {
		return "Pelicula [titulo=" + titulo + ", enero=" + enero + ", director=" + director + ", anioEstreno="
				+ anioEstreno + "]";
	}




	// --------------------constructores


	public Pelicula(String titulo, String enero, Director director, int anioEstreno) {
		super();
		this.titulo = titulo;
		this.enero = enero;
		this.director = director;
		this.anioEstreno = anioEstreno;
	}







	public Pelicula() {
		super();
	}
	
	
	
	

// ------- metodos
	
	
	
	


}
	
	
	
	
	
	
	



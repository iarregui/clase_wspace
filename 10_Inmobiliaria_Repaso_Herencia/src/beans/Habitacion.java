package beans;

public class Habitacion {
	
	private String Tipo;
	private double m2;
	
	
	//-------toString
	@Override
	public String toString() {
		return "Habitacion [Tipo=" + Tipo + ", m2=" + m2 + "]";
	}

	// getter y setter 
	/**
	 * @return the tipo
	 */
	public String getTipo() {
		return Tipo;
	}



	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(String tipo) {
		Tipo = tipo;
	}


	/**
	 * @return the m2
	 */
	public double getM2() {
		return m2;
	}


	/**
	 * @param m2 the m2 to set
	 */
	public void setM2(double m2) {
		this.m2 = m2;
	}

	

	
	// contructores
	
	
	public Habitacion(String tipo, double m2) {
		super();
		Tipo = tipo;
		this.m2 = m2;
	}

	public Habitacion() {
		super();
	}
	
	
	
	
}

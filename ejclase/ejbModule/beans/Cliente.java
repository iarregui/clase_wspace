package beans;

public  class Cliente {
	//------------DEFINICION DE LOS ATRIBUTOS ( no se inicializan)
	 private String usuario;
	 private String pwd;
	 private String nombre;
	 private String apellido;
	 private String direccion;
	/**
	 * @return the usuario
	 */
	public String getUsuario() {
		return usuario;
	}
	/**
	 * @param usuario the usuario to set
	 */
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	/**
	 * @return the pwd
	 */
	public String getPwd() {
		return pwd;
	}
	/**
	 * @param pwd the pwd to set
	 */
	public void setPwd(String pwd) {
		this.pwd = pwd;
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
	 * @return the apellido
	 */
	public String getApellido() {
		return apellido;
	}
	/**
	 * @param apellido the apellido to set
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	/**
	 * @return the direccion
	 */
	public String getDireccion() {
		return direccion;
	}
	/**
	 * @param direccion the direccion to set
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	@Override
	public String toString() {
		return "Cliente [usuario=" + usuario + ", pwd=" + pwd + ", nombre=" + nombre + ", apellido=" + apellido
				+ ", direccion=" + direccion + "]";
	}
	
	 
	 
	 //METODOS CONSTRUCTORES
	

	 
	public Cliente(String usuario, String pwd, String nombre, String apellido, String direccion) {
		super();
		this.usuario = usuario;
		this.pwd = pwd;
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
	}
	public Cliente() {
		super();
	}
	 
	 

	// OTROS METODOS 
	
	public static Cliente dameCliente() {// va a devolver una refererencia a cliente
		
		return new Cliente ( "tomas ","tms","Tomas","`Perez","calle pez num 3, Madrid");
		
	}
	
	public static Cliente [] dameClientes() {// array de clientes devuelve las posiciones de clientes segun su posicion
		Cliente [] clientes= {
				new Cliente ( "tomas ","tms","Tomas","Perez","calle pez num 3, Madrid"),
				new Cliente ( "sara ","sara","sarita","sanchezz","calle nuez num 8, Sevilla"),
				new Cliente ( "eva " ,"ruiz","evita","gima","calle lirio num 3, cadiz"),
				new Cliente ( "ana ","ana","anita","lista","calle rosa num 3, cuenca")			
				};
		return clientes;
		}	




}// fin de la clase


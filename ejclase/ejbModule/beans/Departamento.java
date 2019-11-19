package beans;

public class Departamento {
	
	//------------DEFINICION DE LOS ATRIBUTOS ( no se inicializan)
		 private int idDepartamento;
		 private String nombre;
		 private  Empleado jefe;
	
		 
		 
		 
	//--------------SETTER AND GETTER	 
		 /**
		 * @return the idDepartamnto
		 */
		public int getIdDepartamento() {
			return idDepartamento;
		}
		/**
		 * @param idDepartamnto the idDepartamnto to set
		 */
		public void setIdDepartamento(int idDepartamento) {
			this.idDepartamento = idDepartamento;
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
		 * @return the jefe
		 */
		public Empleado getJefe() {
			return jefe;
		}
		/**
		 * @param jefe the jefe to set
		 */
		public void setJefe(Empleado jefe) {
			this.jefe = jefe;
		}
// -----------METODOS CONSTRUCTORES 
		public Departamento() {
			
		}

		
		
		public Departamento(int idDepartamento, String nombre) {
			super();
			this.idDepartamento = idDepartamento;
			this.nombre = nombre;
		}
		
		
		
		public Departamento(int idDepartamento, String nombre, Empleado jefe) {
					super();
					this.idDepartamento = idDepartamento;
					this.nombre = nombre;
					this.jefe = jefe;
		}
		
@Override
		public String toString(){
	
		if ( jefe == null) {
		
			return "Departamento [idDepartamento=" + idDepartamento + ", nombre=" + nombre + ", jefe=" + jefe + "]";
		}
		
		else {	

			return "Departamento [idDepartamento=" + idDepartamento + ", nombre=" + nombre + ", jefe=" + jefe.getIdEmpleado() + "]";
		}
		 
		
	}

}

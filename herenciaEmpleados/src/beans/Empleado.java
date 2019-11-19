package beans;

public class Empleado {
	// definicion de una atruibuto estatico(constante  de clase IMPORTANTE!!!
	 
	public final static int MESES_NOMINA=14;// no lleva geeete y setter ni nada es constante
		 
	//------------DEFINICION DE LOS ATRIBUTOS variables de la instancia ( no se inicializan)
	 protected int idEmpleado;
	 protected  String nombre;
	 protected  String apellido;
	 protected  String sexo;
	 protected  int salario;
	 protected  int edad;
	 protected  double comision;
	 protected  Departamento departamento;	 
	
	
	 
	 
	 // CRAR AUTOMATICAMENTE CONSTRUCTOR  ( BOTON DCHO SOURCE--> CONSTRUCTIOR USSIN FIELDS)
	
	 	//SIEMPRE TIENE QUE HABER UN CONSTRUCTOR POR DEFECTO SIN PARAMETROS
		public Empleado() {
			super();
		}
	 
	 
		/* DE ESTOS PUEDE HABER VARIOS  ( SOBRECARGA DEL METODO ) */
		

		public Empleado(int idEmpleado, String nombre, String apellido, String sexo, int salario, int edad, double comision, Departamento departamento) {
			super();
			this.idEmpleado = idEmpleado;
			this.nombre = nombre;
			this.apellido = apellido;
			this.sexo = sexo;
			this.salario = salario;
			this.edad = edad;
			this.comision= comision;
			this.departamento =departamento;
		}
			
		

	//----------------------------	CONSTRUCCION DE SETTER AND GETTER
		/**
		 * @return the idEmpleado
		 */
		public int getIdEmpleado() {
			return idEmpleado;
		}


		/**
		 * @param idEmpleado the idEmpleado to set
		 */
		public void setIdEmpleado(int idEmpleado) {
			this.idEmpleado = idEmpleado;
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
		 * @return the sexo
		 */
		public String getSexo() {
			return sexo;
		}


		/**
		 * @param sexo the sexo to set
		 */
		public void setSexo(String sexo) {
			this.sexo = sexo;
		}


		/**
		 * @return the salario
		 */
		public int getSalario() {
			return salario;
		}


		/**
		 * @param salario the salario to set
		 */
		public void setSalario(int salario) {
			this.salario = salario;
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


		
		
		
	
   /**
		 * @return the comision
		 */
		public double getComision() {
			return comision;
		}


		/**
		 * @param comision the comision to set
		 */
		public void setComision(double comision) {
			this.comision = comision;
		}


		/**
		 * @return the departamento
		 */
		public Departamento getDepartamento() {
			return departamento;
		}


		/**
		 * @param departamento the departamento to set
		 */
		public void setDepartamento(Departamento departamento) {
			this.departamento = departamento;
		}
//-----------METODO TO STRING

	

	
	@Override
		public String toString() {
				
					return "Empleado [idEmpleado=" + idEmpleado + ", nombre=" + nombre + ", apellido=" + apellido + ", sexo="
					+ sexo + ", salario=" + salario + ", edad=" + edad + ", comision=" + comision + "]";// he borrado el departaemento para que no se bucle
		}
	
	
	
	
	
	

	// ----------------------METODOS RESPONSABILIDAD DE LA CLASE

	public String nombreCompleto() {
		return apellido + " " + nombre;
		
	}
	public double salalrioMensual() {  //decimos que esta sobrecarcado porque tiene varias definiciones
		
		return (salario + comision ) / MESES_NOMINA ;
	}
		
		
	public double salarioMensual(int meses) {  //decimos que esta sobrecarcado porque tiene varias definiciones
		return (salario + comision )/meses;
	}


	public double aumentoMensual(int aumento) {  //decimos que esta sobrecargado porque tiene varias definiciones
		
		return salario *= 1 + (aumento /100) ; // equivale (salario = salalrio + aumento
	}

	public double totalSalario() {
		
		return  (salario + comision );
		
	}

	




}

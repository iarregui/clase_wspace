package beans;


public class Director extends Empleado {
	public final static int VALOR_ACCION=1000;// no lleva geeete y setter ni nada es constante
	 private int acciones;
	 private String tablet;
	
	 
	 //----------- SETTER AND GETTER
	 
	 
	 /**
		 * @return the acciones
		 */
		public int getAcciones() {
			return acciones;
		}
		/**
		 * @param acciones the acciones to set
		 */
		public void setAcciones(int acciones) {
			this.acciones = acciones;
		}
		/**
		 * @return the tablet
		 */
		public String getTablet() {
			return tablet;
		}
		/**
		 * @param tablet the tablet to set
		 */
		public void setTablet(String tablet) {
			this.tablet = tablet;
		}
		
		
	 
	 
	 
	 // ----------------METODOS CONSTRUCTORES
	 
		public Director(int idEmpleado, String nombre, String apellido, String sexo, int salario, int edad,
				double comision, Departamento departamento, int acciones, String tablet) {
			super(idEmpleado, nombre, apellido, sexo, salario, edad, comision, departamento);
			this.acciones = acciones;
			this.tablet = tablet;
		}
		public Director() {
			super();
		}
		
		
		
		
		//-----------------METODOS TO STRING
		@Override
		public String toString() {
			
			 if (departamento == null) {
			return "Director [acciones=" + acciones + ", tablet=" + tablet + ", idEmpleado=" + idEmpleado + ", nombre="
					+ nombre + ", apellido=" + apellido + ", sexo=" + sexo + ", salario=" + salario + ", edad=" + edad
					+ ", comision=" + comision +  "]";
			 }
			 else {
			 return "Director [acciones=" + acciones + ", tablet=" + tablet + ", idEmpleado=" + idEmpleado + ", nombre="
				+ nombre + ", apellido=" + apellido + ", sexo=" + sexo + ", salario=" + salario + ", edad=" + edad
				+ ", comision=" + comision + ", departamento=" + departamento.getNombre()+"]";// uso el get para no cruzar este to string con el de departaneto(buclaria) y no bucle
			 }
	 

		}
		
		// ----------- OTROS METODOS ( SOBREESCRITOS 
		
		@Override
		public String nombreCompleto() {
			// TODO Auto-generated method stub
			return super.nombreCompleto();
		}
		@Override
		public double salalrioMensual() {
			// TODO Auto-generated method stub
			return totalSalario() / MESES_NOMINA ;
			
		}
		
	
		@Override
		public double aumentoMensual(int aumento) {
			// TODO Auto-generated method stub
			return super.aumentoMensual(aumento);
		}
		@Override
		
		public double totalSalario() {
			
			return  (salario + comision + acciones * VALOR_ACCION );
		
		}
		
}

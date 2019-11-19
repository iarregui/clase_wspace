package beans;

public class Gerente extends Empleado {
	
	//------------DEFINICION DE LOS ATRIBUTOS ( no se inicializan)
	
	 private int plazGaraje;
	 private String movil;	 
	 private double variable;
	
	 // ----------------SETTER AND GETTER 
	 
	 /**
	 * @return the plazGaraje
	 */
	public int getPlazGaraje() {
		return plazGaraje;
	}
	/**
	 * @param plazGaraje the plazGaraje to set
	 */
	public void setPlazGaraje(int plazGaraje) {
		this.plazGaraje = plazGaraje;
	}
	/**
	 * @return the movil
	 */
	public String getMovil() {
		return movil;
	}
	/**
	 * @param movil the movil to set
	 */
	public void setMovil(String movil) {
		this.movil = movil;
	}
	/**
	 * @return the variable
	 */
	public double getVariable() {
		return variable;
	}
	/**
	 * @param variable the variable to set
	 */
	public void setVariable(double variable) {
		this.variable = variable;
	}
	
	
	
	
	//------METODOS CONSTRUCTORES
	
	 
	public Gerente(int idEmpleado, String nombre, String apellido, String sexo, int salario, int edad, double comision,
			Departamento departamento, int plazGaraje, String movil, double variable) {
		super(idEmpleado, nombre, apellido, sexo, salario, edad, comision, departamento);
		this.plazGaraje = plazGaraje;
		this.movil = movil;
		this.variable = variable;
	}
	public Gerente() {
		super();
	}
	
	
	//  -------- to string
	 
	@Override
	public String toString() {
		
		if (departamento == null) // meto el if para evitar que casque si no tiene departamento 
				return "Gerente [plazGaraje=" + plazGaraje + ", movil=" + movil + ", variable=" + variable + ", idEmpleado="
				+ idEmpleado + ", nombre=" + nombre + ", apellido=" + apellido + ", sexo=" + sexo + ", salario="
				+ salario + ", edad=" + edad + ", comision=" + comision +  "]";
		else 
				return "Gerente [plazGaraje=" + plazGaraje + ", movil=" + movil + ", variable=" + variable + ", idEmpleado="
				+ idEmpleado + ", nombre=" + nombre + ", apellido=" + apellido + ", sexo=" + sexo + ", salario="
				+ salario + ", edad=" + edad + ", comision=" + comision + ", departamento=" + departamento.getIdDepartamento() + "]";
		
	}
	
	
	// .----------- metodos sobreescrtitos
	@Override
	public String nombreCompleto() {
		// TODO Auto-generated method stub
		return super.nombreCompleto();
	}
	@Override
	public double salalrioMensual() {
		// TODO Auto-generated method stub
		return super.salalrioMensual();
	}
	@Override
	public double salarioMensual(int meses) {
		// TODO Auto-generated method stub
		return super.salarioMensual(meses);
	}
	@Override
	public double aumentoMensual(int aumento) {
		// TODO Auto-generated method stub
		return super.aumentoMensual(aumento);
	}
	@Override
	public double totalSalario() {
			
			return  (salario + comision + variable  );
			
	}
	


}

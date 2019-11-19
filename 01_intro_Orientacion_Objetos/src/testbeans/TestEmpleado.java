package testbeans;
import beans.Empleado;

public class TestEmpleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		//D---CREACION DE INSTANCIAS DE OBJETO CON EL CONTRUCTOR D LA CLASE (SIN PARAMETROS)
		
		 			// PRIMERA FORMA
	Empleado emp3= new Empleado();
	
					// SEGUNDA FORMA
	
	Empleado emp1, emp2 ;
	
	emp1 = new Empleado();
	emp2 = new Empleado();
	//emp2 = new Empleado();
	
	// --------DAR VALOR A ATRIBUTOS DE LAS REFERENCIAS ( variables)
	
	
	/*
	 emp1.idEmpleado= 100;
	
	emp1.nombre="tomas";
	emp1.apellido ="escu delgado";
	emp1.edad= 58;
	emp1.salario=25000;
	emp1.sexo="h";
	
	emp2.idEmpleado= 100;
	emp2.nombre="tomas";
	emp2.apellido ="escu delgado";
	emp2.edad= 58;
	emp2.salario=25000;
	emp2.sexo="h";
	
	
	 */
	//llamadas con SET por  haber hecho los atribuos privados DEBE ESTAR PREVIAMENTE CREADA EL OBJETO.EN ESTE CASO emp1
	
	emp1.setNombre("tomas");
	emp1.setApellido ("escu delgado");
	emp1.setEdad(58);
	emp1.setSalario(25000);
	emp1.setSexo("h");
	
	//-----------------GENERACION DE REFERENCIAS CON OTRO METODO CONTRUCTOR GENERADO EN LA CALSE
	emp2= new Empleado()	;// con el metodo constructor general de la clase 
	
	emp3= new Empleado (110,"paco","paco","h",2500,25,0.5,null); //con el otro constructor
	
	//---------SALIDAS
	//stem.out.println ( emp1.idEmpleado);// println cuandove  una variable que contien uun dato primitivo devuelve el dato convertido de binario aese tipo de dato en estre caso un entero.
			
		
	//stem.out.println ( emp1.nombre );//ojo seghun esto deberia traer una direccion de memoria . Eso es porque cuando  println ve una direccion de memoria  invoca internamene de un metodo toString de String que devuelve el contenido de la  direccion de memoria como cadena de caracteres.
	
	
	//comprobacion de que almacena lo mismo en diferentes direcciones de mempria
	System.out.println(emp1);
	//System.out.println(emp2);
	//System.out.println(emp3);
	
	
	//emp3=emp2; // es decir ambas variables refenecian en la misma direccion
	System.out.println(emp2);
	System.out.println(emp3);
	System.out.println(emp1);
	
	
	
	
	
	// uso de metodos de la clase
	System.out.println("mi salario en origen es"+ emp3.getSalario());
	}
	

	

}

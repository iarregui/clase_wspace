package testbeans;

import beans.Departamento;
import beans.Empleado;

public class TestEmpleadoDepaartamento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Departamento dep40= new Departamento ( 40, "Formacion", null );
		
		
		Empleado emp1 =new Empleado(1,"paco","perez","h", 5000, 28, 5, dep40) ;
		
		// para introducir el departaementp 
		
		//primer metodo
		
		
				
		Empleado emp2 =new Empleado(2,"luis","sanchez","h", 4000, 45, 2, dep40) ;	
		Empleado emp3 =new Empleado(4, "javi", "perez", "h", 8000, 54, 0.2, dep40);
				
		
				
		
		System.out.println(emp1);
		System.out.println(emp2);	
		System.out.println(emp3);
		
		dep40.setJefe(emp1); // adjudico el Jefe al departamento 40
		
		
		// creo un departaemnto nuevo adjudicado a un empleado ade un departamento inicial  ( no tienen por que ser el departamento del que ahora le reclama) usando el constructoe directamente ne vez de la variable que alude a la clase
		//departamento= new Departamento(120, "formacion", jefe)
		Departamento dep120 = new Departamento (120, "formacion", new Empleado(5, "luisa", "sanchez", "M", 14000, 35, 2, dep40)); //he creado un empleado del depto 30  y luego le hago jefe del 120
		 dep120.getJefe().setDepartamento(dep120); /* actuando con dos variables. como ese new empleado no tiene variable adjudicada 
		 *y tengo que hacer alusion a él para cambiaer en el empleado su departaemento , me valgo del un  metodo  dep120.getJefe()que averigua qcual es la direccion de ese empleado en la tabla departamento y con un set le ingerso el departaento nuievo
		 
		 
		 */
		 System.out.println ("departaqmento 120" + dep120.getJefe().getNombre());
		
	/* SALIDA POR CONSOLA :
	 *  el niombre del emp2, su salario  y el nombre del departamento al que pertenence.	//  
		* como el nombre departamento no es un atributo normal sino que es NDE  una clase relacionada .SE INVOCA AL GET DE LL ATRIBUTO INCLUIDO CONN LA CLASE Y TRAS EL LOS METODOS GET DE LA CLASE  DEPARTAMENTO EN ESTE CLASO EL DEL CAMPO NOMBRE DEL DEPARTAMENTO
	*/	
		System.out.println(" nombre emp2:"+emp2.getNombre()+ " su salalrio es"+ emp2.getSalario()+" , su departamento  es: "+emp2.getDepartamento().getNombre().toUpperCase());
		/*
		 * el empleado 
		 * 
		 *  */
		
		
		
		System.out.println(" nombre emp2:"+emp2.getNombre()+ " su salalrio es"+ emp2.getSalario()+" , su departamento  es: "+emp2.getDepartamento().getNombre());
	System.out.println(dep120);
	// OJO SE BUCLA POR QUE LOS TO STRING DE DEPARTAEMNTO Y CLIENTE SE CRIUZARIAN DEBORDANDO LA MEMORIA. PUEDO HACER VARIAS COSAS
	/* PUEDO QUITAR DEUNO DE LOS TO STRING DE UNA  CLASE O DE LA OTRA SEGUN ME INTERESE EL CAMPO QUE LAS LIGA ( PEJ DEPARTAMENTO EN EMPLEADO)
	 * PUEDO CREAR UN METODO QUE SALVE LA CONDICION DE NULL SI ALGUNA VARIABLE ESTA VACICA.
	 * 
	 * 
	 */
	//SALIDA DEL NOMBRE DEL JEFE DEL DEAPARTAEMENTO QUE SEA POR EJEMPLO DE UN  EMPLEADO ()
	
	System.out.println ( dep120.getJefe().getNombre()); //get jefe me dedevuelve el monbre de jefe dela tabala departaemnto. get Nombre me devuelve de la tabla empleados el nombre que estaba como jefe en departamento.
	System.out.println ("el jefe de emp2 luis: "+ emp2.getDepartamento().getJefe().getNombre());
	System.out.println(dep120);
	
	
	
	
	}

}

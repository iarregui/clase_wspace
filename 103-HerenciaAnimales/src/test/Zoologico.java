package test;


import beans.Animal;
import beans.Gato;

public class Zoologico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal a1 = new Animal ("camaleon - verde");
		
		Animal a2 = new Animal ("hipopotamo - amarron");
		
		
		Gato gato1 = new Gato ("gato siames", 7);
		Gato gato2 = new Gato ("gato callejero", 5);
		
		
		a1.sonido();
		gato1.sonido();
		
		a1.saludar();
		gato1.saludar();
		
		// en un array dela calse padre puedo hacer arrays con sus objetos y los definidos por susclases descendientes
		
			Animal[] zoo= {a1, a2,gato1,gato2};// creio el array con objetos de ambas clases
			
		/*---------POLIMORFISMO
			* una sola llamada ejecuta   distintos metodos. tantos como metodos reescritos EN LAS CLASES DESCENDIENTES
			*SE EJECUTA QUEL METODO DEL OBJETO INVOCADO ( SI EL NEW ANIMAL EL DE ANIMAL, SI ES NEW GATO , EL DE GATO REESCRITO ,conforme al new que se creio para los elementos new animal o new gato
		*/
			for (Animal ele: zoo) {
						
				ele.saludar();
				 if(ele instanceof Gato) {// si el new es de gato . INSTANCE OF DEVUELVE UN BBBOLEAN Y PREGUNTA : SÍ ES UN OBJETO DE UNA CLASE 
					 ((Gato) ele).mostrarDatos();
				 }
		
			}
		
	}
	

}

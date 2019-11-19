package ejercicios;


import java.util.Scanner;
public class Ejercicio_06_SWITCH_2 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
				/*
				 * 3.	Leemos un numero entero que representa el radio de una circunferencia, y calculamos
					a.	La circunferencia(2*PI*r)
					b.	El área del circulo (PI * r2)
			-------------------------------------------------
				 *  1.- Declarar variables.
				 *  2.- Obtener los datos de entrada
				 *  3.- Procesar los datos de entrada - Generar salida parcial y/o total
				 *  4.- Escribir salida
				 */
		
		//1
		int i=0;
		System.out.println ("Introduce una palabra: ");
		 //2
		Scanner leer = new Scanner (System.in);
		String miPalabra= leer.next();// decalro en la variable en la misma linea
		leer.close();
		//3 y 4
		int numCaracter=miPalabra.length();
		System.out.println ("longitud de la palabra: "+ numCaracter);
				for (i=0 ; i < numCaracter ; i+=1) {
				System.out.println("num letra:"+i);
				char letra= miPalabra.charAt(i);
				System.out.println(letra+ "");
				
					switch (letra) {
					case 'a': 
						System.out.println("a");
						break;
					case 'e':	
						System.out.println("e");
						break;
					case 'i':
						System.out.println("i");
						break;
					case 'o':
						System.out.println("o");
						break;
					case 'u':
						System.out.println("u");
						break;
					default:	
							System.out.println(" no es vocal ");
							break;
					}
					
		}	
		/*// Puedo agrupar los valores de los case, como en el ejemplo
		 * --Si el case se cumple y  lleva   break, significa que tras la ejecucion sale de ese case particular y
		 *y termina la ejecucion de todo el switch. El default salta en caso de no cumplir alguno de los case declarados
		 * --Si el case se cumple  y NO lleva break sigue la ejecucion de las sentencia  de los  
		 * case siguientes desde el encontrado primero ( incluye el default), uno tras otro hasta un break o saliendo del switch.
		 */
		
	}

}

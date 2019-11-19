import java.util.Scanner;

public class Ejercicio_05_IF {

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
				 *  4.- Escribir estadísticas
				 */
		
		//1
		String nombre= "";
		//2
		System.out.println ("Introduce un nombre: ");
		
		Scanner leer = new Scanner (System.in);
		nombre = leer.next();
		leer.close();
		//3 y 4
		if ( nombre.equals("pepe")) {// ojo `para los string se usa un metodo de String  y no los iguales(solo opara!!!
			
			System.out.println("has ganado el sorteo" + " " + nombre);
			}
		else {
			System.out.println("no es pepe, vuelve a intentarlo");
				
			
			}
		
		
		

	}

}

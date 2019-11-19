

import java.util.Scanner;
public class Ejercicio_06_SWITCH {


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
		int mes = 0;
		
		System.out.println ("Introduce un NUMERO DE MES: ");
		
		Scanner leer = new Scanner (System.in);
		mes = leer.nextInt();
		leer.close();
		
		
		
		
		switch (mes) {
		case 1: case 3: case 5:  case 8:  case 7:  case 10:  case 12:
			System.out.println(" el mes "+  mes + " es de 31 dias");
			break;
		case 6: case 9:  case 11:  
			System.out.println(" el mes "+  mes + " es de 30 dias");
			break;
		case 2: 
			System.out.println(" el mes "+  mes + " es de 28 dias");
			break;
		default:	
				System.out.println(" el mes es de 1 a 12");
		}
		
		
		

	}

}

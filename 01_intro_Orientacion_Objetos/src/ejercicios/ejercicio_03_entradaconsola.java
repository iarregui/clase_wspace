package ejercicios;
import java.util.Scanner;// ojo!! importa la clase Scanner que no viene en el Java Lang en java 122 / lib, no esta Scanner sino en util

public class ejercicio_03_entradaconsola {

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
	
		
		//leo desde consola. Ojo hay que importar la clase Scanner que no viene en las clases de Java. Boton derecho sobre la clase Scanner la primera vez
		
	//1
		int radio = 0;
		double longCircunferencia= 0; // porque llevar a decimales
		double areaCirculo = 0; // porque llevar a decimales
		
	//2	
		System.out.println("introduce radio.\n");// salida por pantalla
		
		/*creo una referencia a una clase Scanner ( direccion de memoria),
		 para instancia (new) con un un metodo constructor del mismop nombre qyue la clase ( con parametros o no),  un objeto con la  estructura de la clase.
		*/
		Scanner leer = new Scanner(System.in);
		radio = leer.nextInt();// leer es una variable de la clase  Scanner
		// para cerrar el flujo entr memoria y periferico hay que cerrarlo
		leer.close();
	//3	
		longCircunferencia = 2 * Math.PI * radio ;
		areaCirculo = Math.PI * Math.pow(radio,2);
	
	//4
		System.out.println("Circunferencia con radio "+ radio + "= " + longCircunferencia); 
		
		System.out.println("Área con radio ="+ radio +" = " + areaCirculo);
		
		
			
		
		


	}

}

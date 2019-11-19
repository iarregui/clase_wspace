package ejercicios;

public class Ejercicio_01 {

	public static void main(String[] args) {
	
// leerr de consola
		
		
			String nombre = "sebastian";
			System.out.println(nombre.toUpperCase());
			System.out.println(String.valueOf(1234).substring(1, 2));
			
			String nombre2 = "Sebastián";
			
			System.out.println(nombre2.toUpperCase());
			// extrae de la cadena 1234  a partir de posicion 1  
			System.out.println(String.valueOf(1234).substring(0, 3));
			
		
			
			int num1 = 0, num2 = 0;
			
			//simulamos que lo leemos
			num1 = 15;
			num2 = 25;
			
			//proceso
			System.out.println(num1 + " + " + num2 + " = " + (num1+num2));

			System.out.println(num1 + " * " + num2 + " = " + (num1*num2));

			System.out.println(num1 + " - " + num2 + " = " + (num1-num2));

			System.out.println(num1 + " % " + num2 + " = " +  (num1 % num2));
			
			System.out.println(num1 + " / " + num2 + " = " +  (num1 / num2));
	}
	
	}



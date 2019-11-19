import java.util.Scanner;
public class Ejercicio_06_AroundSex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 	-------------------------------------------------
		 *  1.- Declarar variables.
		 *  2.- Obtener los datos de entrada
		 *  3.- Procesar los datos de entrada - Generar salida parcial y/o total
		 *  4.- Escribir resultados salida
		 */

		char sexo='H';
		
		if (sexo=='H')
			System.out.println ("Hombre");
		else
			System.out.println ("Mujer");
		//--------------------------------------
		String sexoS="H";
		
		if (sexoS=="H")
			System.out.println ("HombreS");
		else
			System.out.println ("MujerS");
		//--------------------------------------
		char sexoLeer='H';
		Scanner leer = new Scanner (System.in);// abre el tubo 
		/*NO HAY METODO PARA LERER CARACTER DIRECTAMENTE. COMO leer.next() devuelve string , 
		 * le aplico  stringAt (indico posicion del caracter),  DEVUELVE UN CARACTER
		 */
		
		sexoLeer= leer.next().charAt(0); // NO HAY METODO PARA LERER CARACTER DIRECTAMENTE. COMO leer.next() devuelve string , le aplico  stringAt (indico posicion del caracter),  DEVUELVE UN CARACTER
		
	
		
		if (sexoLeer=='H')
			System.out.println ("Hombre con caracter");
		else
			System.out.println ("Mujer con caracter");
		//--------------------------------------------
		String sexoLeerString=null;
		leer.close();//cierra el tubo
		
		sexoLeerString= leer.next();// el tubo esta abierto
	
		if (sexoLeerString.equals("H"))// equal extrae el contenido de la direccion a la que apunta el objeto sexoLeerstring
			System.out.println ("Hombre leer string");
		else
			System.out.println ("Mujer leer string");
		
		
		
		
	}
	

}

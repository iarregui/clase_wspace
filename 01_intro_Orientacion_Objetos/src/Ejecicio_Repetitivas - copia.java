import java.util.Scanner;
public class Ejecicio_Repetitivas {
	
	/*LEer un número detrás de otro mientras que el número leído sea distinto de cero. 
	 * Al final del proceso mostrar cuantos números válidos he leído, y cuanto suman las cantidades de los números introducidos.
2.	Escribir los números múltiplos de 3 y de 7, que hay entre el 1 y el 250.

3.	Lo mismo que el anterior, y además escribir al final, cuántos de los 250 son:



a.	Múltiplos de 3 y de 7.
b.	Cuantos hay múltiplos solo de 3
c.	Cuantos hay múltiplos solo de 7.
*/
	public static void main(String[] args) {
		
	
	int miEntero=0;
	int contador=0;
	int acumulador=0;
	
	Scanner leer = new Scanner (System.in);
	
	System.out.println("primer número: ");
	miEntero = leer.nextInt();
	
	
		
		while (miEntero!=0) {
							
			acumulador =acumulador+miEntero;
			contador=contador +1;
			System.out.println("Nuevo número: ");
			miEntero = leer.nextInt();
				
		}
		leer.close();
		System.out.println(contador+" entradas efectuadas.");
		System.out.println(acumulador+" suma de las entadas.");
		
		
		
		
}

}

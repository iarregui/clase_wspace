import java.util.Scanner;
public class Ejecicio_Repetitivas {
	
	/*LEer un n�mero detr�s de otro mientras que el n�mero le�do sea distinto de cero. 
	 * Al final del proceso mostrar cuantos n�meros v�lidos he le�do, y cuanto suman las cantidades de los n�meros introducidos.
2.	Escribir los n�meros m�ltiplos de 3 y de 7, que hay entre el 1 y el 250.

3.	Lo mismo que el anterior, y adem�s escribir al final, cu�ntos de los 250 son:



a.	M�ltiplos de 3 y de 7.
b.	Cuantos hay m�ltiplos solo de 3
c.	Cuantos hay m�ltiplos solo de 7.
*/
	public static void main(String[] args) {
		
	
	int miEntero=0;
	int contador=0;
	int acumulador=0;
	
	Scanner leer = new Scanner (System.in);
	
	System.out.println("primer n�mero: ");
	miEntero = leer.nextInt();
	
	
		
		while (miEntero!=0) {
							
			acumulador =acumulador+miEntero;
			contador=contador +1;
			System.out.println("Nuevo n�mero: ");
			miEntero = leer.nextInt();
				
		}
		leer.close();
		System.out.println(contador+" entradas efectuadas.");
		System.out.println(acumulador+" suma de las entadas.");
		
		
		
		
}

}

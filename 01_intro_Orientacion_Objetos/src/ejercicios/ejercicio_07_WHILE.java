package ejercicios;
import java.util.Scanner;
public class ejercicio_07_WHILE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long numero =0;
		long aux=0;
		long factorial=1;// inciclizo para 
		System.out.println("teclea un numero");
		Scanner leer = new Scanner (System.in);
		numero= leer.nextInt();
		leer.close();//cierra el tubo
		
	
		aux=numero;
		while (aux> 0) {
			
				//factorial = factorial * aux ;
				factorial *= aux;  // identico a
				System.out.println(+factorial);
			aux --;
			}		
		if (numero>0) {
			System.out.println (" el factorial de :"+ numero+" es "+factorial);
		}
	}

}



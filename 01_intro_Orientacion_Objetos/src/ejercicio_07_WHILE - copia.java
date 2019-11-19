import java.util.Scanner;
public class ejercicio_07_WHILE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero =0;
		int aux;
		int factorial;
		Scanner leer = new Scanner (System.in);
		numero= leer.nextInt();
		leer.close();//cierra el tubo
		
	
			aux=numero;
		while (aux<0); {
			
				factorial  *= aux;
			aux --;
			}		
		if (numero>0) {
			System.out.println (" e favotriañl de :"+ numero+" es "+factorial);
		}
	}

}

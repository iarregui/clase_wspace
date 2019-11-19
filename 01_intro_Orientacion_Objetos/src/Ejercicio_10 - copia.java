import java.util.Scanner;


public class Ejercicio_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String palabra="";
		int numero1 = 0;
		int numero2 = 0;
		double resultado= 0;
		double resto;
		
		Scanner leer = new Scanner (System.in);
		System.out.println("introduce primer numero");
		numero1= leer. nextInt();
		System.out.println("introduce segundo numero");
		numero2= leer. nextInt();
		System.out.println("teclea la operacion: Sumar , Restar; Multiplicar , Dividir , Resto");
		palabra= leer.next();
		
		leer.close();
		 
 
 
		
		switch (palabra) {
		case "Sumar": 
			resultado = numero1 + numero2;
			System.out.println("resultado suma: "+ resultado);
			break;
		case "Restar": 
			resultado = numero1 - numero2;
			
			System.out.println("resultado resta: "+ resultado);
			break;	
		case "Multiplicar": 
			resultado= numero1 *  numero2;
			
			System.out.println("resultado multiplicar:"+resultado);
			break;	
		case "Dividir": 
			resultado= numero1 /  numero2;
			
			System.out.println("resultado dividir:"+resultado);
			break;	
		case "Resto": 
			resto = numero1 % numero2;
			
			System.out.println("resto :"+ resto);
			break;	
		default:
			System.out.println("no se encuentra esta operación");
		}
 
	}

}

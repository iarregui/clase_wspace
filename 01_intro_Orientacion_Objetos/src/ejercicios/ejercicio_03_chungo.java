package ejercicios;
import java.util.Scanner;

public class ejercicio_03_chungo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 int precio = 0;
		 int pago=0;
		 int nuevoPago=0;
		 int falta=0;
		 int vuelta= 0;
		 
		//2
		System.out.println ("Introduce precio: ");
		Scanner leer = new Scanner (System.in);
		precio = leer.nextInt();
		
		System.out.println ("Introduce pago: ");
		
		
		pago = leer.nextInt();
		
		
		
		while  (pago<precio) {
			
				falta =pago-precio;
				System.out.println ("faltan ="+ falta);
				System.out.println ("Añada hasta llegar a importe o superior multiplo de 5");
				nuevoPago = leer.nextInt();
				pago=pago +nuevoPago;
				if(pago%5==0) {}
					
				else {
						System.out.println ("el pago debe ser multiplo de 5");//debe ser Multiplo de cinco;
					}
										
		}
		
		leer.close();
		
		vuelta = pago- precio;
		System.out.println ("Sus vueltas: "+ vuelta);
		
		 //Nota: esta estructura de If no es eficiente ,se ejecutan  cinco vueltas a la estructrura.   como hay condiciones y no datos no puedo usar case
	
		if (vuelta >=50) {
			System.out.print ((vuelta/50)+" billetes de 50 € ");
						
			vuelta = (vuelta%50);
			
			
		}
		if (vuelta >= 20) {
			System.out.print ( " "+(vuelta/20)+" billetes de 20 €  ");
				
			vuelta = (vuelta%20);
			
			
		}
		if (vuelta >=10) {
			System.out.println (" "+(vuelta/10)+" billetes de 10 € ");
						
			vuelta = (vuelta%10);
						
				
		}
		if (vuelta >=5) {
				System.out.println (" "+(vuelta/5)+" billetes de 5 € ");
					
		}else {
				System.out.print (" No hay vueltas");
		}
	System.out.println();
		
		
		
	}

}

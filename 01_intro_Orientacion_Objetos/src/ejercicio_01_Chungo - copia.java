import java.util.Scanner;
public class ejercicio_01_Chungo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*1.	Leer tres n�meros correspondientes a los lados de un tri�ngulo.
a.	Para que sea un tri�ngulo v�lido se debe cumplir que la suma de cualquiera de dos lados sea superior al otro. Si no se Escribir� �triangulo no valido� y se para el proceso. Por ejemplo

	o	3, 4 , 5 es v�lido. 3+4>5; 4+5>3 y 3+5 > 4
	o	2,1,1 : No vale 1+1 no > 2 y no vale
b.	Una vez que es v�lido  Escribir si el tri�ngulo es:
	o	 equil�tero(3 lados iguales)
	o	Is�sceles(2 iguales y uno desigual)
	o	Escaleno ( 3 lados desiguales).
	*/
		int a = 0;
		int b = 0;
		int c = 0;
		boolean esTriangulo = false;
		
		
		
		Scanner leer = new Scanner (System.in);
		System.out.println("introduce lado A");
		a= leer. nextInt();
		System.out.println("introduce lado B");
		b= leer. nextInt();
		System.out.println("introduce lado C");
		c= leer.nextInt();
		
		leer.close();
		
		if ((c<a+b) && (a<b+c) && (b<a+c)) {
			System.out.println("teclea la operacion: es triangulo");
			esTriangulo=true;
		}
		else {				
			System.out.println("no es un triangulo");
			esTriangulo=false;
		}
		
		
		if (esTriangulo) {
				
			if ((a!=b) && (a!=c) && (b!=c)) {
				System.out.println("es triangulo escaleno");
				}
			else if ((a==b) || (a==c) || (b==c)) {	
				
				if ((a==b) && (a==c)) {
					System.out.println("es triangulo equilatero");
				}
				else {
					System.out.println("es triangulo isosceles");
				}
			}	
			
		}		
		}

	}
	

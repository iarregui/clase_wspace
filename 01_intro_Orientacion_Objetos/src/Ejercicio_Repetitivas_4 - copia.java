
public class Ejercicio_Repetitivas_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			/*4.	Leer 10 números al azar, ente 1 y 50 (y almacenarlos en un arreglo- ahora no). Leer cada uno, escribirlos y al final del proceso Escribir:
			a.	Cuál es la media de los números leídos.
			b.	 Cuál es la suma de los números leídos.
			c.	Cuantos son pares y cuantos son impares.
			*/
//System.out.println(Math.random());// devuelve  de 0 a 1
//System.out.println((int)(Math.random()));// devuelve  de 0 a 1 en entero por casting( siemppre saldra 0 pues trunca
//System.out.println((int)((Math.random()*50)+1));// devuelve entero entre 1 y 50
	double suma=0;
	int numero=0;
	double media =0;
	int cuentapar= 0;
	int cuentaimpar= 0;
	
	for (int i=1; i<=10; i++) {
			numero=(int)((Math.random()*50)+1);
			System.out.println(numero);
			suma = suma + numero;
			media =suma /i; //la salida seria entera si es son int ambos , si suma lo hago double , seria double la salida
			 if (numero%2==0) {
				 cuentapar++;
				 
			 }
			 else {
				 cuentaimpar++;
			 }	 
	}
	System.out.println(suma);
	System.out.println(media);
	System.out.println(cuentaimpar);
	System.out.println(cuentapar);
	}

}

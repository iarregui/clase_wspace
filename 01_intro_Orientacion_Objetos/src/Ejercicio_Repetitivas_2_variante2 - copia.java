

public class Ejercicio_Repetitivas_2_variante2 {
	/*
	2.	Escribir los números múltiplos de 3 y de 7, que hay entre el 1 y el 250.

	3.	Lo mismo que el anterior, y además escribir al final, cuántos de los 250 son:

	a.	Múltiplos de 3 y de 7.
	b.	Cuantos hay múltiplos solo de 3
	c.	Cuantos hay múltiplos solo de 7.
	d  cuantos nu,meros entre 1 y 250  que no lo son de ninguno.
	*/
	public static void main(String[] args) {
		
		int acum3= 0;
		int acum7= 0;
		int acum37= 0;
		
	for (int i=1 ;i <=250; i++) {//OPTIMIZACION para desechar la opcion mayoritaria los quito primero y salgo con un continue
					if  ((i%3 !=0) && (i%7 !=0)){ 
						continue;	
					}
								
					if (i%7 == 0){
						acum7++;
						System.out.println(i+" multiplo  de 7");	
								
						}
					if( (i%3==0) ){
						acum3++;
						System.out.println(i+" multiplo  de 3 ");	
						
						}
					if( (i%3==0) && (i%7==0)) {
						acum37++;
						System.out.println(i+" multiplo  de 3 y 7 ");
					}
			}	
	
			System.out.println(acum3 +" multiplo  de 3 ");
			System.out.println(acum7 +" multiplo  de 7 ");		
			System.out.println(acum37 +" multiplo  de 3 y 7 ");
			System.out.println((250-(acum3+acum7-acum37)) +" no son multiplo  de 3 o 7 o ambos ");
	
	
	
	
	
	
	
	
	
		
	}
	
}

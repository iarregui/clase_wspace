package ejercicios;


public class Ejercicio_Repetitivas_2 {
	/*
	2.	Escribir los números múltiplos de 3 y de 7, que hay entre el 1 y el 250.

	3.	Lo mismo que el anterior, y además escribir al final, cuántos de los 250 son:




	a.	Múltiplos de 3 y de 7.
	b.	Cuantos hay múltiplos solo de 3
	c.	Cuantos hay múltiplos solo de 7.
	*/
	public static void main(String[] args) {
		

	/*
	  int numero1=1;

	int numero2 = 250;
	int contador=0;
	int acumulador=0;
	int valor =0;
	int miEntero=0;
	

	acumulador = numero1;
	while (valor <= numero2) {
			if ((valor%3==0) && ( valor%7==0)) {
				acumulador =acumulador + miEntero;
				contador=contador++;
				System.out.println ("Nuevo número: " + contador);
			}
	}

	System.out.println(contador +" entradas efectuadas");
	System.out.println(acumulador +" suma de las entadas.");
	*/
	//no me funciona--------------------------------------------------------------
	
		for (int i = 1; i <=250; i++) {
			if (i % 3 == 0 && i % 7 ==0) {
				System.out.println(i+" multiplo  de 3 y 7");		
				}
	
	}
	
	
	
	
	
	
	
	
	}
	
	
}

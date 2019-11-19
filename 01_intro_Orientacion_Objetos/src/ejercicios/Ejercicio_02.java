package ejercicios;

public class Ejercicio_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double num1 = 1.8e25;
		int num2 = 0;
		
		//reading simulation
		num1 = 15.8;
		num2 = 25;
		
		//proceso
		System.out.println(num1 + " + " + num2 + " = " + (num1+num2));

		System.out.println(num1 + " * " + num2 + " = " + (num1*num2));

		System.out.println(num1 + " - " + num2 + " = " + (num1-num2));

		System.out.println(num1 + " % " + num2 + " = " +  (num1 % num2));// que hace saca el resto (modulo)
		
		
		System.out.println(num1 + " / " + num2 + " = " +  (num1 / num2));
		
		 //haciendo un casting para forzar la salida a entero
		int resultado = 0;
		resultado = (int)num1 * num2;
		System.out.println("resultado de casting en primer operador " + resultado);
				//error type mismatch
		resultado = (int)(num1 * num2);
		System.out.println("resultado de casting en mult " + resultado);
		

	}

}

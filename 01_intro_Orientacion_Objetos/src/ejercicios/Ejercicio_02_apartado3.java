package ejercicios;

public class Ejercicio_02_apartado3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 *  1.- Declarar variables.
		 *  2.- Obtener los datos de entrada
		 *  3.- Procesar los datos de entrada - Generar salida parcial y/o total
		 *  4.- Escribir estad�sticas
		 */
	
		int l1 = 0;
		int l2 = 0;
		
		//leo desde memmoria
		l1 = 3;
		l2 = 4;
		
		
		
		
		System.out.println("Lados del rect�ngulo = " + l1 + " y " + l2);
		System.out.println("Per�metro = " + (2 * (l1 + l2)));
		System.out.println("�rea = " + (l1 * l2));
		System.out.println("Hipotenusa = " + Math.sqrt(Math.pow(l1, 2)+Math.pow(l2, 2)));
		
		int lado1 = 0;
		int lado2 = 0;
		int perimetro = 0; 
		int area = 0;
		double hipotenusa = 0;
		
		lado1 = 7; 
		lado2 = 4;
		
		perimetro = 2 * (lado1 + lado2);
		area = lado1 * lado2;
		hipotenusa = Math.sqrt(Math.pow(lado1, 2)+Math.pow(lado2, 2));
		
		System.out.println("Lados = " + lado1 + " y " + lado2 + " ==>  per�metro = " + perimetro + " �rea = " + area + " hipotenusa = " + hipotenusa);


	}

}

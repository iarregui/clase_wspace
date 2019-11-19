
public class Ejercicio_array_bidimensional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String [] dias = {"lunes","martes", "miercoles","jueves","viernes",
				"sabado","domingo"};
		// CREACION DE LA ESTRUCTURA DEL ARRAY BIDIMENSIONAL
		String [][] menus = {
								{"macarrones","lomo","sandia"},
								{"sopa","garbanzos","apaño","cafe","copa"},
								{"acelgas","pechuga plancha","melon","cafe"},
								{"lentejas","carne guisada","piña"},
								{"ensalada","rabo de toro","tarta",}
							};// ACABA EL ARRAY
		
		
		//RECORRER UNA FILA Y ME IDICA EL DIA  DEL ARRAY DE DIAS
		int fila = 1;
		System.out.println(dias[fila]+"/r");
		
		// RECORRE CADA FILA Y LISTA CADA COLUMNA  DEL ARRAY DE MENUS
		for (int j =0; j < menus[fila].length; j++)
			System.out.println(menus[fila][j]);
		
		
		System.out.println("MENU DE ESTA SEMANA");
		for (int i =0; i< menus.length; i++) {
			System.out.println("\n" + dias[i].toUpperCase());
			for (int j=0; j < menus[i].length; j++)
				System.out.print(menus[i][j] + "  - ");
				
		}
		
		
		
		
		
		

	}

}

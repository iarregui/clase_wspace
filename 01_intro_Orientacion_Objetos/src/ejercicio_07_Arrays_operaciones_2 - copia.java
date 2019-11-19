
public class ejercicio_07_Arrays_operaciones_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
	String[] dias= { "lunes ", "martes ","miercoles ","jueves ","viernes ","sabado","domingo "};
		
		// CASO1 :  EXTRAE UN ELEMENTO CONCRETO SGÚN UN INDICE , DEL ARRAY  COMPLETO
		int diaSemana =1;
		
		System.out.println (" hoy es : "+ dias[diaSemana-1]) ;
		
		// CASO2 : ARRAY INCOMPLETO CON HUECOS AL FINAL Y SE TOPE. VALE 
		
		System.out.println("\n\nCASO CON huecos AL FINAL ");
		
		for (String dia: dias) {
			if (dia != null){// para recorree y  evitar los nulos sabiemndo cuala es el limite 
			System.out.println (" dia "+ dia.toUpperCase() ) ;
			}
		}
			// para leer los cinco primeros , 
		for ( int i = 0 ; i<0 ; i++ )	{
			System.out.println (" dia v2 "+dias[i] ) ; //en el literal le digo qu elemento pintar dia [i]
			
			}
		//CASO3 : ARRAY INCOMPLETO SIN HUECOS Y NO SE EL TOPE DE CUANTOS VIENEN CON CONTENIDO.
		System.out.println("\n\nCASO 3  sin huecos sin saber tope");	
		int ind=0;
													
		while ( ind<dias.length && dias[ind] != null ){
				System.out.println (" dia v3"+dias[ind]);
					ind++;
				}
			
		//CASO 4: ARRAY INCOMPLETO CON  HUECOS POR CUALQUIER PARTE
		
		System.out.println("\n\nCASO 4 huecos sin saber donde");
		//	caso 4: un array con huecos
			for (String dia: dias) {
				 	if (dia != null)
							System.out.println("dia caso 4: " + dia);
			}
		
	}

}


public class ejercicio_recorre_allay {

	 /* ARRAYS
	  * DEFINICION ARRAY CON CONTENIDO
	  * MODIIFICACION DE UN VALOR DEL ARRAY
	  * LISTADO CONTENIDO ( SI LLENO CON FOR OPTIMIZADO)
	  * CONTEO ELEMENTOS DEL ARRAY
	  * BUSQUEDA DE UN ELEMENTO DE UN ARRAY
	  * CONVERSION DE STRING POR TROCEO SPLIT EN ARRAY
	  * 
	  * EFECTOS DE UN ELEMENTO VACIO SOBRE EL ARRAY ( CASCA EL PROGRAMA AL RECORRERLO O USAR UN METOD SOBRE EL ELEMENTO DEL ARRAY)
	  */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ----------DEFINICION DE UN ARRAY CON CONTENIDO	
		
		int [] pares= {2,4,6,8,10};
		
		String[] nombres= { "pepe" ,"juan" , "manuel","juan" , "ana"};
		
		//-------------- MODIFICACIONDE UN VALOR DE UNA POSICION DETERMINADA EN EL ARRAY
		  pares [1]= 66;
		// --------------LISTADO DE ARRAYS CON FOR
		for (int i=0; i<(pares.length); i++) { // recorre todos los elementos del array 
			
			System.out.println("en la posicion " +i+ " esta el numero "+ pares[i]);
		}
		///--------------LISTADO ARRAYS LLENOS (FOR OPTIMIZADO)
		
		for (String cucu: nombres) {// for optimiizado  .  cucu es un ejemplo de nombre de la variable String que contiene u nombres
			System.out.println(" me llamo "+cucu);
			//String  prueba =cucu.toUpperCase();// al aplicar un metodo sobre una salida que no es de la clase (en este caso  uno delos elementos del array es null ; no apunta a nada , da una excepcion porque no apunta a nada y no devuelve direrccion.
		}
		//---------------- CONTEO DE ELEMENTOS DEL ARRAY 
		System.out.println(pares.length);//Cuenta elementos del array pares[]
		
		System.out.println(nombres.length);//Cuenta elementos del array nombres[]
		 
		// ---------------BUSQUEDA DE ELEMENTO DE UN ARRAY EN ARRAY LLENO
		
		String miNombre="juan";
		boolean existeNombre = false;
		int i=0;
		
		for(i=0;i<nombres.length;i++){
            if (miNombre == nombres[i]) {
                System.out.println("El nombre  "+miNombre+"  esta en la posicion  "+i);
                existeNombre= true;
            }
        }

        if(existeNombre==false) 
            System.out.println("El nombre no esta");
		
		
		// -------------------------TROCEO POR CARACTERES DE UNA CADENA PARA GENERAR ARRAY 
		
		///Puedo trocear una cadena de strings con un separador  y luego generar a partir de esta cadena un array cuyos elementos se cortan entre los caracteres del separador )( en este caso concrreto la coma)
		
		String cadena= "juan,manuel,pepe";
		
		String nombre2 []= cadena.split(",") ; // split crea un array de string
		 
		for (String cucu1: nombre2 ) {
		System.out.println (cucu1);
		}

		
		//se puede hacer directamente
		String cadena1 = "juan,manuel,pepe";
		
		//String nombre2 []= cadena.split(",") ; // split crea un array de string
		 
		for (String cucu1: cadena1.split(",")) {
		System.out.println (cucu1);
		}
		
	
	
		pruebaArrayVacio();
	}	// acaba main


		
	
	public static void pruebaArrayVacio() {
		
		String [] cadenas= new String[6];
		int [] numero3= new int[6];
		boolean []  buleano=new boolean [2];
		
		
		for (String elemento: cadenas)
		
		System.out.println(elemento);
		
		
		for (int elemento: numero3)
		
		System.out.println(elemento);
		
		
		for (boolean elemento: buleano)
			
			System.out.println(elemento);
		
		
		//carga del array con numeros aleatorios
		
		for ( int i=0 ; i<numero3.length ; i++) {
			numero3[i]= (int)(Math.random() *50+1);
			System.out.println(numero3[i]);
		}
	}
	
	
	
	
	
	
	
	
	
	
}

package colecciones;

import java.util.ArrayList;
import java.util.HashMap;

import beans.Persona;

public class MainColecciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList<String> listaNombres=new ArrayList <String>();
		
		listaNombres.add("Mortadelo");
		listaNombres.add("filemon");
		listaNombres.add("bacterio");
		listaNombres.add("ofelia");
		listaNombres.add("Super intendente");
		
		
		
	System.out.println(listaNombres.get(0));//
	System.out.println(listaNombres.get(1));//
	System.out.println(listaNombres.get(2));//
	System.out.println(listaNombres.get(3));//
	System.out.println(listaNombres.get(4));//

	// manera mala o poco usada de recorrer lista de ArraAYS 
	System.out.println("************recorrer mal *****");//
	
		for ( int i = 0 ; i < listaNombres.size(); i++) {
			
				System.out.println(listaNombres.get(i) );
		}

// MANERA CORRECTA DE RECORREEL ALARRAYLIST   ---->FOR  EACH
	
// la primera parte : hay que ,eter una variable en el for del mismio tuiipo que la lista a recorrer ( valor) . en este caso reooro valores de tipo String 
// la segunda parte es la lista que queremos recorrer con la variable valor
		System.out.println("************recorrer bien *****");
		for ( String valor: listaNombres) {
	           System.out.println(valor);                      
	}                         
	                                 
	      
	// clases Wrapper o envoltorios 
		
		// si queremos un array de primitivos , no se pueden crar . los arrayList son solo para Objetos. HAY QUE HACERLES wRAPPING . 
		
	System.out.println("******array de enteros******");//
	
	//PARA ENTEROS 
		 Integer entero = new Integer(4);
		 
		 Integer entero2 = 5;//autoboxing
		 
		 ArrayList <Integer> listaEnteros= new ArrayList<>();
		 listaEnteros.add(1); //autoboxing
		 listaEnteros.add(5); //autoboxing
		 listaEnteros.add(10); //autoboxing
		 listaEnteros.add (new Integer(15));
		 
		 for( Integer valorEnteros : listaEnteros) {
	           System.out.println(valorEnteros);                      
	}                         
		 
	// las otras clases se ddenominan como sus primitivas pero empezando en Mayuscula
		 
		 double prrmitivoDouble=6.5;
		 Double objetoDouble=5.2;  //igual con las clasers Char, Integer etc.
		 
	
	
		 
		 // 
		 ArrayList <Persona>listaPersonas = new ArrayList<Persona>();
		 Persona p1= new Persona ();
		 p1.setNombre("Penelope");
		 		
		 p1.setEdad("45");
		 
		 Persona p2= new Persona ();
		 p2.setNombre("lucia");
		 p2.setEdad("25");
		 
		
		 
		 listaPersonas.add(p1);
		 listaPersonas.add(p2);
		 
		 for( Persona p: listaPersonas ) {
			 System.out.println("--------------------------");
	           System.out.println(p.getNombre());
	           System.out.println(p.getEdad());  
	           System.out.println("--------------------------");
	           
	           
	     //sacar  elementos de un Atrray List con Renmove y un indice
	           //listaPersonas.remove(1)// lo saco de la lista por posicion.
	           
	           
	           listaPersonas.remove(p2);// por referencia tra remover  
	           
	           // tambien podria eliminar ala Anas , recorriendo el array y extrayendo su indice y luego remuevo.
	           
	           System.out.println(p2);//permanece en memoria a traves del objeto persiona.);
	           
	           // no podemos acceder a unaq posicion que no existe
	           System.out.println(listaPersonas.get(1));
	           
	///-------MAPAS --------------------------           
	 // SE CREAN CON EL OBJETO HASMAP   DOS PARAMETROS ---CLAVE Y VALOR      
	           
	           System.out.println("------------MAPAS--------------");
	          
	           HashMap <String, String> mapaUsuarioContrasenia=new HashMap<String, String>();
	           mapaUsuarioContrasenia.put("felix","1234"); // uso PUT para dar valores
	           mapaUsuarioContrasenia.put("pepe","qwerty");
	           mapaUsuarioContrasenia.put("pepa","123456");
	           // siempre accedemos por clave
	           System.out.println(mapaUsuarioContrasenia.get("felix")); 
	           //para borrar uso REMOVE
	           mapaUsuarioContrasenia.remove("felix");
	           System.out.println(mapaUsuarioContrasenia.get("felix"));// da excepcion pues no existe
	           mapaUsuarioContrasenia.put("pepe","6542187");// esta reemplazando lo que referencia el indice (("pepe","qwerty") por "pepe","6542187" el INDICE ES UNICO.
		 
		 
	// mapa usuario Persona 
	          
	           
	           HashMap <String, Presona> mapaUsuarioPersona= new HashMap <String, Presona>();
	           mapaUsuarioPersona (p1.getNombre(), p1);// coge el nombre del la Persona 
	           mapaUsuarioPersona (p2.getNombre(), p2);
	           
		 
		 
		 
		 
		 
		 }
	}

}

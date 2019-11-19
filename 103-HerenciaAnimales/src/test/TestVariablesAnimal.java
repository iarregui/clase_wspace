package test;
import beans.Animal;
import beans.Gato;



public class TestVariablesAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animal a1,a2,a3,a4,a5; // en compilacion solo aparecen los metodos de la clase animal
		Gato gato1;
		
		
		a1=new Animal ("PULPO ROJO");
		a2=new Gato ("GATO MONTES  MARRON", 6);
		a3=new Animal ("CAMALEON   VERDE");
		a4= new Gato ("GATO gatuno  MARRON", 2);
		
		
		a4.saludar();
		a4.sonido();
		
		((Gato) a4).trepar();
		
		// uso metodo1
		a5= findAnimal();
		//gato1= findAnimal(); //no funciona pues find animal es un metodo sobre la clase animal
		gato1= (Gato)findAnimal();// sin punto!!! es un casting sobre un metodo  y yo necesito  un objeto gato para ejecutarlo.
		
		
		// uso metodo 2 
		String tontada= (String) readObject();
		System.out.println( tontada);
		
		
	}


//------- metodo 1

		public static Animal findAnimal() {
			return new Gato ("Gato callejero  blanco", 2);// este metodo devuelve un Gato
	
	
		}
		
		//------- metodo 2	
		
		public static Object readObject() {
			return new String  ("vaya tela marinera");// este metodo devuelve un String
		
		}
	
}
package test;

import beans.Animal;
import beans.Gato;

public class TestAnimal { 
	public static void main (String [] args) {
	Animal a1, a2, a3 ;
	
	a1 = new Animal ("camaleon verde");
	a2 = new Animal ("buho rojo");
	a3 = new Animal ("halcon negro");
	
	System.out.println( a1 + "  " + a2 +"  "+ a3);
	
	a1.saludar();
	
	a1.sonido();
	
	
	// voy a crear un array de animales ,(llamado zoologico)
	Animal [] zoologico= {a1, a2, a3};
	
	for (Animal ele: zoologico) {
		
		System.out.println(ele.getColor()+ " - " );
		ele.sonido();
		
		
	}
	
	Gato g4;
	
	g4= new Gato ("rojo", 7)	;
	
	g4.mostrarDatos();
	
	
	}

}

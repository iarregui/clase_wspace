package test;

import beans.Gato;

public class TestGato {

	public static void main (String[] args) {
		// TODO Auto-generated method stub

		Gato gato1, gato2 ;
		
		gato1 = new Gato ();
		gato2 = new Gato ("rojo", 7);
		
		
		
		gato1.mostrarDatos();
		gato2.mostrarDatos();
		
		gato2.saludar();
	}

}

package main;

import java.util.ArrayList;

import bean.Direccion;
import bean.Persona;

public class MainPersona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// sin constructor " es mas claro
		
		Persona p1 = new Persona ();
		
		
		
		
		p1.setNombre("Bud Spencer");
		p1.setPeso(89);
		p1.setEdad(89);
		
		// con constructor 
		
		
		Persona p2= new Persona ("Terence", 67, 0.12 );
		
		
		// funcionamiento de stack y heap de la jvm
		
		Persona pAux =  p1;// Ambas apuntan a la misma direccion de memoria del objeto. tanto p1 como pAux 
		
		
		
		pAux.setEdad(33);// ahora tambien a cambiado la edad de p1
		
		
		int numero = 50;// vaRIABLE PRIMITIVA (GUARDA EL VALOR)
		cambiarEntero (numero);
		System.out.println(numero);
		
		
		// arrayList ( no deeclaro el array como estatico[]
		
		ArrayList <Persona> listaPersonas= new ArrayList <Persona>() ;// crece el array en funcion de las necesidades
		Persona p3 = new Persona ();
		
		listaPersonas.add(p3);// en este caqso apuntaruia a p3 pero el contenido de p3 es aun nulos y cero
		
		p3.setNombre ("harry potter");
		p3.setPeso (89);
		p3.setEdad (75);
		
		//
		System.out.println(listaPersonas.get(0));// meget (0) daria la primera posicion del array  .harry potter 
		
		p3.setEdad(20);
		
		
		System.out.println(listaPersonas);
		
		listaPersonas.add (pAux);
		pAux = null;
		System.out.println(listaPersonas);
		
		
		
		
		
		
		//---------- con la direccion ( he creado una clase direccion y la he mertido como atributo en la prsona ( renovando geter y seter , to string y constructores
		
		
		
		Persona p4= new Persona();
		p4.setNombre ("haMortadelo");
		p4.setPeso (50);
		p4.setEdad (70);
		
		Direccion d1= new Direccion();
		
		d1.setTipoVia("calle");
		d1.setNombreVia("gran via 2");
		d1.setCiudad("madrid");
		d1.setCp("28054");
		
		
		p4.setDireccion(d1);
		
		//voy a a�adirlo al array
		
	
		listaPersonas.add(p4);// a�ade al array p4 con su direccion
		
		System.out.println(listaPersonas);
		
		
		
		
		
		
	}
	
		//---------METODOS PROPIOS 
		public static void cambiarEdad(Persona  p) {
			p.setEdad(45);		
		}
		public static void cambiarEntero(int numero) {// durante el ciclo de vida seria 100 durante la ejecucion
			numero=100;		
		}
		
		//
		
	

}







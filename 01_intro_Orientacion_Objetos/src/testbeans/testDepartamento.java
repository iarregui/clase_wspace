package testbeans;

import java.util.Scanner;

import beans.Departamento;

public class testDepartamento {
	
	
		public static void main ( String[] args) {
	
			
				Scanner sc= new Scanner(System.in);// creo un objeto escaner para las entradas
			
					Departamento dep1, dep2, dep3 ;
					 
					dep1 = new Departamento (10, "ventas");
					
					
					
					dep2 = new Departamento();
					
					dep2.setIdDepartamento(20);
	
					dep2.setNombre("Administracion");
					
					
					
					dep3 = new Departamento();	

					System.out.println("numero de departamento dep3 ");
					dep3.setIdDepartamento (sc.nextInt());//entradas por scaner
					
					//dep3.setIdDepartamento (Integer.parseInt(sc.next()));// recoge con next u string y lo convertimos mediante el metodo parseInt de la clase 
					

					
					System.out.println("Nombre dep 3: ");
					dep3.setNombre (sc.next());
					
					
					sc.close();
					
					System.out.println ("Datos del departamento");
						
					System.out.println(dep1);
					System.out.println(dep2);
					System.out.println(dep3);
					
					
					System.out.println("Datos sueltos");
					
					System.out.println("Id departamento dep1 : " +dep1.getIdDepartamento());
					System.out.println("Nombre departamento dep2 "+ dep2.getNombre());
					
					
	
					
		}
	
	
	
	
	
	
	
	

}

package testbeans;

import beans.Cliente;

public class TestDameclientes {
	public static void main (String[] args) {
		
		// Cliente cli1=new Cliente();   // creado cuando la clase era NO ESTATICA ( necesita crear un objeto en memoria referenciado paradevolver un resultado
		// Cliente  micliente =cli1.dameCliente(); 
		
		
	// lo mkismo con invocacion almetodo tras haber hecho su METODO ESTATICO	IMPORTANTE
		
	  Cliente otroCliente = Cliente.dameCliente();//cuando una clase no trabaja con dato de quien le invocaese metodo ese ra estatica
	
	  Cliente [] misClientes = Cliente.dameClientes();
	 	for (Cliente ele: misClientes) // recorrro el array mediante ele = elemento a elenmento del array 
	 		System.out.println(ele.getNombre());
	 	
	 	for ( int i=0 ; i< misClientes.length; i++)
	 		System.out.println(misClientes[i]);
	 		
	
	
	
	
	
	
	
	}

}

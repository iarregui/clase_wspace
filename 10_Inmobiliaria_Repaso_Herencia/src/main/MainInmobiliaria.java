package main;

import beans.Direccion;
import beans.Habitacion;
import beans.Persona;

import java.util.ArrayList;

import beans.Casa;

public class MainInmobiliaria {

	public static void main(String[] args) {

		// reo una persona y su direccion

		
		
		
		Persona p1 = new Persona();
		p1.setNombre("haMortadelo");
		p1.setPeso(50);
		p1.setEdad(70);
		// --- direccion del prpietario
		Direccion d1 = new Direccion();

		d1.setTipoVia("calle");
		d1.setNombreVia("gran via 2");
		d1.setCiudad("madrid");
		d1.setCp("28054");

		p1.setDireccion(d1);// le4adjudico la direccion a la persona
		 
		Persona p2= new Persona("luis giro",57,89,new Direccion("plaza"," santa Ana 12","Bardcelona ", "2")  );

		// dir de la casa
		Direccion d2 = new Direccion();
		
		// creo la casa

		Casa c1 = new Casa();

		c1.setPrecio(120000);
		c1.setPropietario(p1);
		c1.setDireccion(d2);

		// creo la lista de habitaciones

		ArrayList<Habitacion> listaHabitaciones = new ArrayList<Habitacion>();// al crear el array existe en memoria
																				// heap su referncia de dircionamiento y
																				// el resto de sus campos estan vacio
		// listaHabitaciones = null; //para eliminar el array

		Habitacion h1 = new Habitacion();
		Habitacion h2 = new Habitacion();
		Habitacion h3 = new Habitacion();

		h1.setM2(15);
		h1.setTipo("dormitorio");

		h2.setM2(15);
		h2.setTipo("salon con cocina americana");

		h3.setM2(15);
		h3.setTipo("ba�o");

		// a�ado las habitaciones al array

		listaHabitaciones.add(h1);
		listaHabitaciones.add(h2);
		listaHabitaciones.add(h2);

		// adjudoico el array a la casa
		c1.setListaHabitaciones(listaHabitaciones);

		// como dupli

		Direccion d3 = d1.duplicarDireccion();

		System.out.println("Casa c1: " + c1+ "\np2" + p2);

	}

}

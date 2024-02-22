package edu.ean.azapata.guia1.actividad2;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio14 {

	public static Hermano obtenerHermanoMayor(List<Hermano> hermanos) {
		
		Hermano hermanoMayor = new Hermano();
		hermanoMayor = hermanos.get(0);
		for(Hermano h: hermanos) {
			if(h.getEdad()>hermanoMayor.getEdad()) {
				hermanoMayor = h;
			}
		}
		
		return hermanoMayor;
	}
	
	public static void main(String[] args) {
		List<Hermano> hermanos = new ArrayList<Hermano> ();
		
		Hermano hermano = new Hermano();
		hermano.setNombre("Juan Perez");
		hermano.setEdad(14);
		hermanos.add(hermano);
		
		hermano = new Hermano();
		hermano.setNombre("Ricardo Perez");
		hermano.setEdad(21);
		hermanos.add(hermano);
		
		hermano = new Hermano();
		hermano.setNombre("Amalia Perez");
		hermano.setEdad(43);
		hermanos.add(hermano);
		
		hermano = new Hermano();
		hermano.setNombre("Carlos Perez");
		hermano.setEdad(8);
		hermanos.add(hermano);
		
		hermano = new Hermano();
		hermano.setNombre("Evelina Perez");
		hermano.setEdad(80);
		hermanos.add(hermano);
		
		Hermano hermanoMayor = obtenerHermanoMayor(hermanos);
		System.out.println("El hermano mayor es: "+hermanoMayor.getNombre()
			+" con edad: "+hermanoMayor.getEdad());
		
	}
}

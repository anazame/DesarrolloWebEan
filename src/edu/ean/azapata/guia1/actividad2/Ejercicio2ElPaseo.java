package edu.ean.azapata.guia1.actividad2;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio2ElPaseo {

	public static Integer getCantidadBuses(List<EstudianteEjercicio2ElPaseo> estudiantes, BusEjercicio2ElPaseo bus) {
		
		BusEjercicio2ElPaseo busAuxiliar = new BusEjercicio2ElPaseo();
		busAuxiliar.setCapacidad(bus.getCapacidad());
		Integer cantidadBuses = 1;
		
		for(EstudianteEjercicio2ElPaseo e : estudiantes) {
			if(e.getEsGordo()) { 
				if(busAuxiliar.getCapacidad()-2 >=0) {
					busAuxiliar.setCapacidad(busAuxiliar.getCapacidad()-2);
				} else {
					busAuxiliar.setCapacidad(0);
				}
			} else {	
				if(busAuxiliar.getCapacidad()-1 >=0) {
					busAuxiliar.setCapacidad(busAuxiliar.getCapacidad()-1);
				} else {
					busAuxiliar.setCapacidad(0);
				}
			}	
			
			if(busAuxiliar.getCapacidad()<=0) {
				cantidadBuses++;
				busAuxiliar.setCapacidad(bus.getCapacidad());
			}
		}
		
		return cantidadBuses;
	} 
	
	public static void main(String[] args) {
		
		List<EstudianteEjercicio2ElPaseo> estudiantes = new ArrayList<EstudianteEjercicio2ElPaseo>();
		
		EstudianteEjercicio2ElPaseo estudiante = new EstudianteEjercicio2ElPaseo();
		estudiante.setNombre("Pepito Perez");
		estudiante.setEsGordo(false);
		estudiantes.add(estudiante);
		
		estudiante = new EstudianteEjercicio2ElPaseo();
		estudiante.setNombre("Juan Perez");
		estudiante.setEsGordo(true);
		estudiantes.add(estudiante);
		
		estudiante = new EstudianteEjercicio2ElPaseo();
		estudiante.setNombre("Andres Lopez");
		estudiante.setEsGordo(true);
		estudiantes.add(estudiante);
		
		estudiante = new EstudianteEjercicio2ElPaseo();
		estudiante.setNombre("Diego Mendez");
		estudiante.setEsGordo(true);
		estudiantes.add(estudiante);
		
		estudiante = new EstudianteEjercicio2ElPaseo();
		estudiante.setNombre("Alejandro Gómez");
		estudiante.setEsGordo(false);
		estudiantes.add(estudiante);
		
		BusEjercicio2ElPaseo bus = new BusEjercicio2ElPaseo();
		bus.setCapacidad(2);
		bus.setPlaca("ABC-1234");
		
		System.out.println("Buses necesarios: "+Ejercicio2ElPaseo.getCantidadBuses(estudiantes, bus));
	}
}

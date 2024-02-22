package edu.ean.azapata.guia1.actividad2;

import java.util.Scanner;

public class Ejercicio12 {

	public String obtenerSiguienteDia(String dia) {
		switch(dia.toUpperCase()) {
		case "LUNES": return "Martes";
		case "MARTES": return "Miércoles";
		case "MIÉRCOLES": return "Jueves";
		case "MIERCOLES": return "Jueves";
		case "JUEVES": return "Viernes";
		case "VIERNES": return "Sábado";
		case "SÁBADO": return "Domingo";
		case "SABADO": return "Domingo";
		case "DOMINGO": return "Lunes";
		default: return "No se ha enviado un día válido";
		}
	}

	public static void main (String[] args) {
		Ejercicio12 ejercicio12 = new Ejercicio12();
		Scanner scan = new Scanner(System.in);
		System.out.println("Digita un día: ");
		String dia = scan.next();
		scan.close();
		System.out.println("Siguiente día: "+ejercicio12.obtenerSiguienteDia(dia));
	}
}

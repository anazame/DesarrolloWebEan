package edu.ean.azapata.guia1.actividad2;

public class Ejercicio5 {

	
	public static Double getArea(Double r) {
		
		return Math.PI*Math.pow(r,2);	
	}
	
	public static Double getAreaCorona(Double r, Double r2) {
		
		return getArea(r)- getArea(r2);
	}
	
	public static void main (String[] args) {
		System.out.println("Area de la corona circular: "+Ejercicio5.getAreaCorona(7d, 5d));		
	}
}

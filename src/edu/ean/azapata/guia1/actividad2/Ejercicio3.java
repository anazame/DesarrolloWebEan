package edu.ean.azapata.guia1.actividad2;

import java.util.Scanner;

public class Ejercicio3 {

	public static Double calcularHipotenusa(Integer altura, Integer angulo) {
		
		return (altura/Math.sin(angulo));
	}
	
	public static void main (String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite x: ");
		int x = scan.nextInt();
		System.out.println("Digite ángulo: ");
		int alpha = scan.nextInt();
		scan.close();
		
		System.out.println("Longitud (y) de la escalera: "+Ejercicio3.calcularHipotenusa(x, alpha));
	}
}

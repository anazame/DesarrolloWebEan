package edu.ean.azapata.guia1.actividad2;

import java.util.Scanner;

public class Ejercicio7 {

	public Integer getDistancia(Integer x1, Integer y1, Integer x2, Integer y2) {
		return (int)Math.sqrt(Math.pow((y2-y1), 2)+ Math.pow((x2-x1), 2));
	}
	
	public Integer getPendiente(Integer x1, Integer y1, Integer x2, Integer y2) {
		return (y2-y1)/(x2-x1);
	} 
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite la coordenada x del primer punto. ");
		Integer x1 = scan.nextInt();
		System.out.println("Digite la coordenada y del primer punto. ");
		Integer y1 = scan.nextInt();
		System.out.println("Digite la coordenada x del segundo punto. ");
		Integer x2 = scan.nextInt();
		System.out.println("Digite la coordenada y del segundo punto. ");
		Integer y2 = scan.nextInt();
		
		scan.close();
		
		Ejercicio7 ejercicio7 = new Ejercicio7();
		
		System.out.println("distancia entre los puntos ("+x1+","+y1+") y ("+x2+","+y2+") es: "+
		ejercicio7.getDistancia(x1, y1, x2, y2));
		
		System.out.println("pendiente entre los puntos ("+x1+","+y1+") y ("+x2+","+y2+") es: "+
				ejercicio7.getPendiente(x1, y1, x2, y2));
		
		
	}
}

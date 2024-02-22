package edu.ean.azapata.guia1.actividad2;

import java.util.Scanner;

public class Ejercicio1 {
	
	
	
	public static Integer funcionEjercicio1(Integer x, Integer y) {
		
		return (int)Math.pow(x,2)+2*x*y+(int)Math.pow(y,2); 
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite el numero x: ");
		int x=scan.nextInt();
		System.out.println("Digite el numero y: ");
		int y=scan.nextInt();
		scan.close();
		
		System.out.println("Resultado ejercicio 1 con x: "+x+", y: "+y+" es: "+Ejercicio1.funcionEjercicio1(x, y));
		
	}

}

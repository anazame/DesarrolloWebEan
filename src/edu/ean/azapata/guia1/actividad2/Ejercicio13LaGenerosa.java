package edu.ean.azapata.guia1.actividad2;

import java.util.Scanner;

public class Ejercicio13LaGenerosa {

	public Double calcularAumento(Double sueldo) {
		if(sueldo <=800000) {
			return sueldo*0.10;
		}else if(sueldo<=1200000) {
			return sueldo*0.08;
		}else {
			return sueldo*0.05;
		}
	}
	
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite el sueldo del empleado: ");
		Double sueldo=scan.nextDouble();
		scan.close();
		Ejercicio13LaGenerosa ejercicio13 = new Ejercicio13LaGenerosa();
		Double incremento = ejercicio13.calcularAumento(sueldo);
		System.out.println("Incremento aplicable: "+incremento);
		System.out.println("Nuevo sueldo: "+(incremento+sueldo));
		
	}
	
}

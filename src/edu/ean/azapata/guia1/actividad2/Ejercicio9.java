package edu.ean.azapata.guia1.actividad2;

import java.util.Scanner;

public class Ejercicio9 {

	public Integer getMayor(Integer n1, Integer n2) {
		return (n1>=n2)?n1:n2;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite el primer número: ");
		Integer n1 = scan.nextInt();
		System.out.println("Digite el segundo número: ");
		Integer n2 = scan.nextInt();
		scan.close();
		
		Ejercicio9 ejercicio9 = new Ejercicio9();
		System.out.println("El número mayor es: "+ejercicio9.getMayor(n1, n2));
	}
}

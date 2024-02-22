package edu.ean.azapata.guia1.actividad2;

import java.util.Scanner;

public class Ejercicio10 {

	public Integer getOperacion(Integer n1, Integer n2, String operador) {
		switch(operador) {
		case "+":
			return n1+n2;
		case "-":
			return n1-n2;
		case "*":
			return n1*n2;
		case "/":
			return (n2==0)?0:n1/n2;
		case "%":
			return n1%n2;
		case "**":
			return (int)Math.pow(n1,n2);
		default:
			return n1+n2;
		}
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite el primer número: ");
		Integer n1 = scan.nextInt();
		System.out.println("Digite el segundo número: ");
		Integer n2 = scan.nextInt();
		System.out.println("Digite el operador: ");
		String operador = scan.next();
		scan.close();
		Ejercicio10 ejercicio10 = new Ejercicio10();
		
		System.out.println(
				"Resultado de la operacion ("+n1+""+operador+""+n2+"): "+
						ejercicio10.getOperacion(n1, n2, operador));
	}
}

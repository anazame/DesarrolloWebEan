package edu.ean.azapata.guia1.actividad2;

import java.util.Scanner;

public class Ejercicio11 {

	public Integer obtenerDecenas(Integer n) {
		
		return n/10;
	}
	
	public Integer obtenerUnidades(Integer n) {
		return n%10;
	}
	
	public String obtenerRomanoDecena(Integer n) {
		switch(n) {
		case 1: return "X";
		case 2: return "XX";
		case 3: return "XXX";
		case 4: return "XL";
		case 5: return "L";
		case 6: return "LX";
		case 7: return "LXX";
		case 8: return "LXXX";
		case 9: return "XC";
		default: return "";
		}
	}
	
	public String obtenerRomanoUnidad(Integer n) {
		switch(n) {
		case 1: return "I";
		case 2: return "II";
		case 3: return "III";
		case 4: return "IV";
		case 5: return "V";
		case 6: return "VI";
		case 7: return "VII";
		case 8: return "VIII";
		case 9: return "IX";
		default: return "";
		}
	}
	
	public static void main (String[] args) {
		Ejercicio11 ejercicio11 = new Ejercicio11();
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite un número entero: ");
		Integer n = scan.nextInt();
		scan.close();
		if(n<100) {
			Integer decenas = ejercicio11.obtenerDecenas(n);
			Integer unidades = ejercicio11.obtenerUnidades(n);
			String romano= ejercicio11.obtenerRomanoDecena(decenas)
					+ejercicio11.obtenerRomanoUnidad(unidades);
			System.out.println("Representación en romano del número: "+romano);
		}	else {
			System.out.println("No puede procesarse un número mayor a 99!!");	
		}	
		
	}
}

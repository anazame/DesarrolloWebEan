package edu.ean.azapata.guia1.actividad2;

import java.util.Scanner;

public class Ejercicio4 {

	static final Double PORCENTAJE_ARRIENDO = 40d;
	static final Double PORCENTAJE_COMIDA =15d;
	
	public Double getArriendo(Double sueldo) {
		return sueldo*PORCENTAJE_ARRIENDO/100;
	}
	
	public Double getComida(Double sueldo) {
		return sueldo*PORCENTAJE_COMIDA/100;
	}
	
	public  void mostrarGastos(Double sueldo) {
		System.out.println("1. Gasto en arriendo: "+this.getArriendo(sueldo));
		System.out.println("2. Gasto en comida: "+this.getComida(sueldo));
		System.out.println("3. Restante: "+(sueldo-(this.getArriendo(sueldo)+this.getComida(sueldo))));
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite el sueldo: ");
		Double sueldo = scan.nextDouble();
		scan.close();
		Ejercicio4 ejercicio4 = new Ejercicio4();
		ejercicio4.mostrarGastos(sueldo);
	}
	
}

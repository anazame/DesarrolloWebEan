package edu.ean.azapata.guia1.actividad2;

import java.util.Scanner;

public class Ejercicio8Edificio {
	
	private Integer cantidadSalones;
	private Integer cantidadSalonesTotal;
	private Integer cantidadPisos;
	private Integer cantidadEstudiantes;
	private Integer capacidadSalon;
	
	public Integer getTotalSalones(Integer capacidadSalon, Integer cantidadEstudiantes) {
		return (int)Math.ceil(((double)cantidadEstudiantes/(double)capacidadSalon));
	}
	
	public Integer getNumeroPisos(Integer cantidadTotalSalones, Integer cantidadSalones) {
		return (int)Math.ceil(((double)cantidadTotalSalones/(double)cantidadSalones));
	}
	
	public static void main(String[] args) {
		Ejercicio8Edificio ejercicio8 = new Ejercicio8Edificio();
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite la capacidad del salón: ");
		Integer capacidadSalon = scan.nextInt();
		ejercicio8.setCapacidadSalon(capacidadSalon);
		
		System.out.println("Digite la cantidad de estudiantes de la universidad: ");
		Integer cantidadEstudiantes = scan.nextInt();
		ejercicio8.setCantidadEstudiantes(cantidadEstudiantes);
		
		System.out.println("Digite la cantidad de salones por piso: ");
		Integer cantidadSalones = scan.nextInt();
		ejercicio8.setCantidadSalones(cantidadSalones);
	
		scan.close();
		
		ejercicio8.setCantidadSalonesTotal(
				ejercicio8.getTotalSalones(
						ejercicio8.getCapacidadSalon(), 
						ejercicio8.getCantidadEstudiantes())
				);
		
		ejercicio8.setCantidadPisos(
				ejercicio8.getNumeroPisos(
						ejercicio8.getCantidadSalonesTotal(), 
						ejercicio8.getCantidadSalones())
				);
		
		System.out.println("----------------------");
		System.out.println("Datos iniciales");
		System.out.println("----------------------");
		System.out.println("Cantidad de estudiantes en la universidad: "+ejercicio8.getCantidadEstudiantes());
		System.out.println("Capacidad de salón: "+ejercicio8.getCapacidadSalon());
		System.out.println("Salones por piso: "+ejercicio8.getCantidadSalones());
		
		System.out.println("----------------------");
		System.out.println("Datos calculados");
		System.out.println("----------------------");
		System.out.println("Cantidad total salones: "+ejercicio8.getCantidadSalonesTotal());
		System.out.println("Cantidad pisos edificio nuevo: "+ejercicio8.getCantidadPisos());
	}
	
	
	public Integer getCantidadSalonesTotal() {
		return cantidadSalonesTotal;
	}

	public void setCantidadSalonesTotal(Integer cantidadSalonesTotal) {
		this.cantidadSalonesTotal = cantidadSalonesTotal;
	}

	public Integer getCantidadSalones() {
		return cantidadSalones;
	}


	public void setCantidadSalones(Integer cantidadSalones) {
		this.cantidadSalones = cantidadSalones;
	}


	public Integer getCantidadPisos() {
		return cantidadPisos;
	}


	public void setCantidadPisos(Integer cantidadPisos) {
		this.cantidadPisos = cantidadPisos;
	}


	public Integer getCantidadEstudiantes() {
		return cantidadEstudiantes;
	}


	public void setCantidadEstudiantes(Integer cantidadEstudiantes) {
		this.cantidadEstudiantes = cantidadEstudiantes;
	}


	public Integer getCapacidadSalon() {
		return capacidadSalon;
	}


	public void setCapacidadSalon(Integer capacidadSalon) {
		this.capacidadSalon = capacidadSalon;
	}

}

package edu.ean.azapata.guia1.actividad1.dto;

import java.io.Serializable;

public class Proyectil implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8755410348117952824L;
	private Double velocidad;
	private Double angulo;
	
	public Proyectil() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Proyectil(Double velocidad, Double angulo) {
		super();
		this.velocidad = velocidad;
		this.angulo = angulo;
	}
	
	public Double getVelocidad() {
		return velocidad;
	}
	public void setVelocidad(Double velocidad) {
		this.velocidad = velocidad;
	}
	public Double getAngulo() {
		return angulo;
	}
	public void setAngulo(Double angulo) {
		this.angulo = angulo;
	}

}

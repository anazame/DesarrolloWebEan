package edu.ean.azapata.guia1.actividad1.dto;

import java.io.Serializable;
import java.util.Date;

public class Estudiante extends Persona implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1269261842542338866L;
	
	private String colegioBachillerato;
	private Date fechaIngreso;
	
	public Estudiante() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Estudiante(String colegioBachillerato, Date fechaIngreso) {
		super();
		this.colegioBachillerato = colegioBachillerato;
		this.fechaIngreso = fechaIngreso;
	}
	
	public String getColegioBachillerato() {
		return colegioBachillerato;
	}
	public void setColegioBachillerato(String colegioBachillerato) {
		this.colegioBachillerato = colegioBachillerato;
	}
	public Date getFechaIngreso() {
		return fechaIngreso;
	}
	public void setFechaIngreso(Date fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}
	
}

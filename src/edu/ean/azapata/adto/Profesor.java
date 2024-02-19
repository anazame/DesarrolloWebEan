package edu.ean.azapata.adto;

import java.io.Serializable;

public class Profesor extends Persona implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6774861995919748146L;
	private String profesion;
	private String nacionalidad;
	private String sueldo;
	
	public Profesor() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Profesor(String profesion, String nacionalidad, String sueldo) {
		super();
		this.profesion = profesion;
		this.nacionalidad = nacionalidad;
		this.sueldo = sueldo;
	}
	
	public String getProfesion() {
		return profesion;
	}
	public void setProfesion(String profesion) {
		this.profesion = profesion;
	}
	public String getNacionalidad() {
		return nacionalidad;
	}
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	public String getSueldo() {
		return sueldo;
	}
	public void setSueldo(String sueldo) {
		this.sueldo = sueldo;
	}
	
}

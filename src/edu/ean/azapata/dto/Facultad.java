package edu.ean.azapata.dto;

import java.io.Serializable;
import java.util.List;

public class Facultad implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8888637471739731522L;
	private Long codigo;
	private String nombre;
	private List<Carrera> carreras;
	private List<Profesor> profesores;
	
	public Facultad() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Facultad(Long codigo, String nombre) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
	}
	
	
	public Long getCodigo() {
		return codigo;
	}
	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Carrera> getCarreras() {
		return carreras;
	}

	public void setCarreras(List<Carrera> carreras) {
		this.carreras = carreras;
	}

	public List<Profesor> getProfesores() {
		return profesores;
	}

	public void setProfesores(List<Profesor> profesores) {
		this.profesores = profesores;
	}
	
}

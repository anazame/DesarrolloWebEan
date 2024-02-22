package edu.ean.azapata.guia1.actividad1.dto;

import java.io.Serializable;
import java.util.List;

import edu.ean.azapata.guia1.actividad1.enumeration.NivelCarrera;

public class Carrera implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6499664585658131733L;
	private String nombre;
	private Integer numeroCreditos;
	private Integer semestres;
	private NivelCarrera nivelCarrera;
	private List<Estudiante> estudiantes;
	
	public Carrera() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Carrera(String nombre, Integer numeroCreditos, Integer semestres, NivelCarrera nivelCarrera) {
		super();
		this.nombre = nombre;
		this.numeroCreditos = numeroCreditos;
		this.semestres = semestres;
		this.nivelCarrera = nivelCarrera;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getNumeroCreditos() {
		return numeroCreditos;
	}
	public void setNumeroCreditos(Integer numeroCreditos) {
		this.numeroCreditos = numeroCreditos;
	}
	public Integer getSemestres() {
		return semestres;
	}
	public void setSemestres(Integer semestres) {
		this.semestres = semestres;
	}
	public NivelCarrera getNivelCarrera() {
		return nivelCarrera;
	}
	public void setNivelCarrera(NivelCarrera nivelCarrera) {
		this.nivelCarrera = nivelCarrera;
	}

	public List<Estudiante> getEstudiantes() {
		return estudiantes;
	}

	public void setEstudiantes(List<Estudiante> estudiantes) {
		this.estudiantes = estudiantes;
	}

	
}

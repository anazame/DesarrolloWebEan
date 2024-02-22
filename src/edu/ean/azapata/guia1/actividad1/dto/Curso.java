package edu.ean.azapata.guia1.actividad1.dto;

import java.io.Serializable;

public class Curso implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7640988043158073693L;
	private Integer codigo;
	private String nombre;
	private Integer numeroCreditos;
	private Salon salon;
	
	public Curso() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Curso(Integer codigo, String nombre, Integer numeroCreditos, Salon salon) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.numeroCreditos = numeroCreditos;
		this.salon = salon;
	}
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
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
	public Salon getSalon() {
		return salon;
	}
	public void setSalon(Salon salon) {
		this.salon = salon;
	}
}

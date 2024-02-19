package edu.ean.azapata.dto;

import java.io.Serializable;

public class Fraccionario implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5305209870525660082L;
	private Long numerador;
	private Long denominador;
	
	public Fraccionario() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Fraccionario(Long numerador, Long denominador) {
		super();
		this.numerador = numerador;
		this.denominador = denominador;
	}
	
	public Long getNumerador() {
		return numerador;
	}
	public void setNumerador(Long numerador) {
		this.numerador = numerador;
	}
	public Long getDenominador() {
		return denominador;
	}
	public void setDenominador(Long denominador) {
		this.denominador = denominador;
	}
	
}

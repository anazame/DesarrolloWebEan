package edu.ean.azapata.adto;

import java.io.Serializable;


public class Reloj implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 637245151231140925L;
	private Integer hora;
	private Integer minuto;
	private Integer segundo;
	
	public Reloj() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Reloj(Integer hora, Integer minuto, Integer segundo) {
		super();
		this.hora = hora;
		this.minuto = minuto;
		this.segundo = segundo;
	}
	
	public Integer getHora() {
		return hora;
	}
	public void setHora(Integer hora) {
		this.hora = hora;
	}
	public Integer getMinuto() {
		return minuto;
	}
	public void setMinuto(Integer minuto) {
		this.minuto = minuto;
	}
	public Integer getSegundo() {
		return segundo;
	}
	public void setSegundo(Integer segundo) {
		this.segundo = segundo;
	}
	
}

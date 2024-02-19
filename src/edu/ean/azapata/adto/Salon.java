package edu.ean.azapata.adto;

import java.io.Serializable;

public class Salon implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3729547053697470121L;
	private String codigo;
	private String descripcion;
	private Edificio edificio;
	
	public Salon() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Salon(String codigo, String descripcion, Edificio edificio) {
		super();
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.edificio = edificio;
	}
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Edificio getEdificio() {
		return edificio;
	}
	public void setEdificio(Edificio edificio) {
		this.edificio = edificio;
	}	
	
}

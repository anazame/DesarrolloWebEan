package edu.ean.azapata.dto;

import java.io.Serializable;

public class LocalizacionGeografica implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7466568357045907651L;
	private String codigo;
	private String nombre;
	private LocalizacionGeografica predecesor;
	
	public LocalizacionGeografica() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public LocalizacionGeografica(String codigo, String nombre, LocalizacionGeografica predecesor) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.predecesor = predecesor;
	}
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public LocalizacionGeografica getPredecesor() {
		return predecesor;
	}
	public void setPredecesor(LocalizacionGeografica predecesor) {
		this.predecesor = predecesor;
	}
}

package edu.ean.azapata.dto;

import java.io.Serializable;
import java.util.List;

public class Universidad implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 993456379073144337L;
	private String nombre;
	private String nombreRector;
	private LocalizacionGeografica ciudad;
	private List<Facultad> facultades;
	
	
	public Universidad() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Universidad(String nombre, String nombreRector, LocalizacionGeografica ciudad) {
		super();
		this.nombre = nombre;
		this.nombreRector = nombreRector;
		this.ciudad = ciudad;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNombreRector() {
		return nombreRector;
	}
	public void setNombreRector(String nombreRector) {
		this.nombreRector = nombreRector;
	}
	public LocalizacionGeografica getCiudad() {
		return ciudad;
	}
	public void setCiudad(LocalizacionGeografica ciudad) {
		this.ciudad = ciudad;
	}

	public List<Facultad> getFacultades() {
		return facultades;
	}

	public void setFacultades(List<Facultad> facultades) {
		this.facultades = facultades;
	}
	
}

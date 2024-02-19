package edu.ean.azapata.adto;

import java.io.Serializable;
import java.util.Date;

public class Persona implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3628625621027628084L;
	
	private String cedula;
	private String nombre;
	private Date fechaNacimiento;
	private LocalizacionGeografica lugarNacimiento;

	public Persona() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Persona(String cedula, String nombre, Date fechaNacimiento, LocalizacionGeografica lugarNacimiento) {
		super();
		this.cedula = cedula;
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.lugarNacimiento = lugarNacimiento;
	}
	
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public LocalizacionGeografica getLugarNacimiento() {
		return lugarNacimiento;
	}
	public void setLugarNacimiento(LocalizacionGeografica lugarNacimiento) {
		this.lugarNacimiento = lugarNacimiento;
	}
}

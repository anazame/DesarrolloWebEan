package edu.ean.azapata.adto;

import java.io.Serializable;
import java.util.List;

public class Edificio implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5536046334541511818L;
	private String codigo;
	private String nombre;
	private String direccion;
	private LocalizacionGeografica ciudad;
	private List<Salon> salones;
	
	public Edificio() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Edificio(String codigo, String nombre, String direccion, LocalizacionGeografica ciudad,
			List<Salon> salones) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.direccion = direccion;
		this.ciudad = ciudad;
		this.salones = salones;
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
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public LocalizacionGeografica getCiudad() {
		return ciudad;
	}
	public void setCiudad(LocalizacionGeografica ciudad) {
		this.ciudad = ciudad;
	}
	public List<Salon> getSalones() {
		return salones;
	}
	public void setSalones(List<Salon> salones) {
		this.salones = salones;
	}
}

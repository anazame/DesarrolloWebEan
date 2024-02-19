package edu.ean.azapata.dto;

import java.io.Serializable;
import java.util.List;

public class Tienda implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3797973152522254668L;
	private String nombre;
	private String direccion;
	private String telefono;
	private List<Producto> productos;
	
	public Tienda() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Tienda(String nombre, String direccion, String telefono) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
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
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public List<Producto> getProductos() {
		return productos;
	}

	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}

}

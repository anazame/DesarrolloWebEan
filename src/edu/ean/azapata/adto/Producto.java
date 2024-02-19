package edu.ean.azapata.adto;

import java.io.Serializable;
import java.util.Date;

import edu.ean.azapata.enumeration.TipoProducto;

public class Producto implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6504625813132356101L;
	private Long codigo;
	private String nombre;
	private TipoProducto tipoProducto;
	private Date fechaExpiracion;
	private String nombreFabricante;
	private Integer cantidadInventario;
	private Double precioUnitario;
	
	public Producto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Producto(Long codigo, String nombre, TipoProducto tipoProducto, Date fechaExpiracion,
			String nombreFabricante, Integer cantidadInventario, Double precioUnitario) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.tipoProducto = tipoProducto;
		this.fechaExpiracion = fechaExpiracion;
		this.nombreFabricante = nombreFabricante;
		this.cantidadInventario = cantidadInventario;
		this.precioUnitario = precioUnitario;
	}
	
	public Long getCodigo() {
		return codigo;
	}
	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public TipoProducto getTipoProducto() {
		return tipoProducto;
	}
	public void setTipoProducto(TipoProducto tipoProducto) {
		this.tipoProducto = tipoProducto;
	}
	public Date getFechaExpiracion() {
		return fechaExpiracion;
	}
	public void setFechaExpiracion(Date fechaExpiracion) {
		this.fechaExpiracion = fechaExpiracion;
	}
	public String getNombreFabricante() {
		return nombreFabricante;
	}
	public void setNombreFabricante(String nombreFabricante) {
		this.nombreFabricante = nombreFabricante;
	}
	public Integer getCantidadInventario() {
		return cantidadInventario;
	}
	public void setCantidadInventario(Integer cantidadInventario) {
		this.cantidadInventario = cantidadInventario;
	}
	public Double getPrecioUnitario() {
		return precioUnitario;
	}
	public void setPrecioUnitario(Double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}

}

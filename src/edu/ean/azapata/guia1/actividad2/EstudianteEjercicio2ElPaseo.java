package edu.ean.azapata.guia1.actividad2;

public class EstudianteEjercicio2ElPaseo {

	private String nombre;
	private Integer id;
	private Boolean esGordo;
	
	
	
	public EstudianteEjercicio2ElPaseo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EstudianteEjercicio2ElPaseo(String nombre, Integer id, Boolean esGordo) {
		super();
		this.nombre = nombre;
		this.id = id;
		this.esGordo = esGordo;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}

	public Boolean getEsGordo() {
		return esGordo;
	}
	
	public void setEsGordo(Boolean esGordo) {
		this.esGordo = esGordo;
	}
	
}

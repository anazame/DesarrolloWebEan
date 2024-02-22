package edu.ean.azapata.guia1.actividad2;

public abstract class Figura {

	protected Double area;
	protected Double perimetro;
	
	public Double getArea() {
		return area;
	}
	
	public Double getPerimetro() { 
		return perimetro;
	}
	
	protected abstract Double calculateArea();
	
	
	protected abstract Double calculatePerimetro() ;
}

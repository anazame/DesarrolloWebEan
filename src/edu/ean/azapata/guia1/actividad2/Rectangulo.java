package edu.ean.azapata.guia1.actividad2;

public class Rectangulo extends Figura{

	private Double base;
	private Double altura;
	
	@Override
	protected Double calculateArea() {
		// TODO Auto-generated method stub
		area = base*altura;
		return area;
	}

	@Override
	protected Double calculatePerimetro() {
		// TODO Auto-generated method stub
		perimetro = (2*(base+altura));
		return perimetro;
	}

	public Double getBase() {
		return base;
	}

	public void setBase(Double base) {
		this.base = base;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

	
}

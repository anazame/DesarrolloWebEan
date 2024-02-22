package edu.ean.azapata.guia1.actividad2;

public class Triangulo extends Figura{

	private Double base;
	private Double altura;
	
	@Override
	protected Double calculateArea() {
		// TODO Auto-generated method stub
		area = base*altura/2;
		return area;
	}

	@Override
	protected Double calculatePerimetro() {
		// TODO Auto-generated method stub
		perimetro = 2*Math.sqrt((Math.pow(altura,2)+Math.pow(base/2, 2)))+base;
		return perimetro;
	}
	
	protected Double calculateHipotenusa() {
		
		return Math.sqrt((Math.pow(base, 2)+Math.pow(altura, 2)));
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

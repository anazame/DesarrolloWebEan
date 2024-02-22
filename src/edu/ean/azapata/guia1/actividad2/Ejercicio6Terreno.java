package edu.ean.azapata.guia1.actividad2;

public class Ejercicio6Terreno extends Figura{

	private Double base;
	private Double altura;
	private Double lado;
	
	public Double calcularPerimetroTerreno(Double a, Double b, Double c) {
		System.out.println("calcularPerimetroTerreno: "+perimetro);
		Double baseRectangulo=b, alturaRectangulo = c, baseTriangulo=b, alturaTriangulo=(a-c);
		Rectangulo rectangulo = new Rectangulo();
		Triangulo triangulo = new Triangulo();
		rectangulo.setAltura(alturaRectangulo);
		rectangulo.setBase(baseRectangulo);
		Double perimetroRectangulo = rectangulo.calculatePerimetro();
		triangulo.setAltura(alturaTriangulo);
		triangulo.setBase(baseTriangulo);
		Double perimetroTriangulo = triangulo.calculatePerimetro();
		perimetro = perimetroRectangulo+perimetroTriangulo ;
		System.out.println("perimetro: "+perimetro);
		return perimetro;
	}
	
	public Double calcularAreaTerreno(Double a, Double b, Double c) {
		System.out.println("calcularAreaTerreno: "+area);
		Double baseRectangulo=b, alturaRectangulo = c, baseTriangulo=b, alturaTriangulo=(a-c);
		Rectangulo rectangulo = new Rectangulo();
		Triangulo triangulo = new Triangulo();
		rectangulo.setAltura(alturaRectangulo);
		rectangulo.setBase(baseRectangulo);
		Double areaRectangulo = rectangulo.calculateArea();
		triangulo.setAltura(alturaTriangulo);
		triangulo.setBase(baseTriangulo);
		Double areaTriangulo = triangulo.calculateArea();
		area = areaRectangulo+areaTriangulo ;
		System.out.println("area: "+area);
		return area;
	}

	@Override
	protected Double calculateArea() {
		// TODO Auto-generated method stub
		this.calcularAreaTerreno(altura,base,lado);
		return area;
	}

	@Override
	protected Double calculatePerimetro() {
		// TODO Auto-generated method stub
		this.calcularPerimetroTerreno(altura, base, lado);
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

	public Double getLado() {
		return lado;
	}

	public void setLado(Double lado) {
		this.lado = lado;
	}
	
	
	public static void main (String[] args ) {
		
		Ejercicio6Terreno terreno = new Ejercicio6Terreno();
		terreno.setBase(10d);
		terreno.setAltura(12d);
		terreno.setLado(7d);
		
		System.out.println("Perímetro del terreno: "+terreno.calculatePerimetro());
		System.out.println("Área del terreno: "+terreno.calculateArea());
	}
}

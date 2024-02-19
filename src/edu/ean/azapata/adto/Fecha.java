package edu.ean.azapata.adto;

import java.io.Serializable;

public class Fecha implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5385282769504559885L;
	private Integer ano;
	private Integer mes;
	private Integer dia;
	
	public Fecha() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Fecha(Integer ano, Integer mes, Integer dia) {
		super();
		this.ano = ano;
		this.mes = mes;
		this.dia = dia;
	}
	
	public Integer getAno() {
		return ano;
	}
	public void setAno(Integer ano) {
		this.ano = ano;
	}
	public Integer getMes() {
		return mes;
	}
	public void setMes(Integer mes) {
		this.mes = mes;
	}
	public Integer getDia() {
		return dia;
	}
	public void setDia(Integer dia) {
		this.dia = dia;
	}

}

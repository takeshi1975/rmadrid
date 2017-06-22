package com.epl.model;

import java.util.Date;


public class Ticket {

	private long id;

	private Date fecha;

	private String locata;

	private String codigo;

	private String caract;	
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getLocata() {
		return locata;
	}

	public void setLocata(String locata) {
		this.locata = locata;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getCaract() {
		return caract;
	}

	public void setCaract(String caract) {
		this.caract = caract;
	}
	
	
}

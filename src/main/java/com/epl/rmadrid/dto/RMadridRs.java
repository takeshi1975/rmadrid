package com.epl.rmadrid.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="RMADRID_REPONSES")
public class RMadridRs {

	@Id
	private String locata;
	
	@Column(name="NUM_AD")
	private int adultos;
	
	@Column(name="NUM_NI")
	private int niños;
	
	@OneToMany
	@JoinColumn(name="LOCATA")
	private List<CodigoBarras> codigoBarras;
	
	private Date fecha;
	
	
	public RMadridRs() {
		if (codigoBarras ==null)
			codigoBarras = new ArrayList<CodigoBarras>();
	}
	
	public RMadridRs(String locata, int adultos, int niños,  Date fecha){
		super();
		this.setLocata(locata);
		this.setAdultos(adultos);
		this.setNiños(niños);
		this.setFecha(fecha);
	}


	public String getLocata() {
		return locata;
	}


	public void setLocata(String locata) {
		this.locata = locata;
	}


	public int getAdultos() {
		return adultos;
	}


	public void setAdultos(int adultos) {
		this.adultos = adultos;
	}


	public int getNiños() {
		return niños;
	}


	public void setNiños(int niños) {
		this.niños = niños;
	}


	public List<CodigoBarras> getCodigoBarras() {
		return codigoBarras;
	}


	public void setCodigoBarras(List<CodigoBarras> codigoBarras) {
		this.codigoBarras = codigoBarras;
	}


	public Date getFecha() {
		return fecha;
	}


	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}	
	
	public void add(CodigoBarras codigoBarras){
		this.getCodigoBarras().add(codigoBarras);
	}
	
	public RMadridRs add(RMadridRs other){
		this.setAdultos(getAdultos()+other.getAdultos());
		this.setNiños(getNiños()+other.getNiños());
		this.getCodigoBarras().addAll(other.getCodigoBarras());
		this.setLocata(other.getLocata());
		if (this.getFecha()==null)
			this.setFecha(other.getFecha());
		return this;
	}
	
	
}

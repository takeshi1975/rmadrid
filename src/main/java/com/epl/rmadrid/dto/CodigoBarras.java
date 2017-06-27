package com.epl.rmadrid.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="RMADRID_COD_BARRAS")
public class CodigoBarras {
	
	@Id
	private long id;
	@Column
	private long numOperacion;
	@Column
	private String locata;
	@Column
	private String codigoBarras;
	@Column(length=2)
	private String caracteristica;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getNumOperacion() {
		return numOperacion;
	}
	public void setNumOperacion(long numOperacion) {
		this.numOperacion = numOperacion;
	}
	public String getLocata() {
		return locata;
	}
	public void setLocata(String locata) {
		this.locata = locata;
	}
	public String getCodigoBarras() {
		return codigoBarras;
	}
	public void setCodigoBarras(String codigoBarras) {
		this.codigoBarras = codigoBarras;
	}
	public String getCaracteristica() {
		return caracteristica;
	}
	public void setCaracteristica(String caracteristica) {
		this.caracteristica = caracteristica;
	}					

	public CodigoBarras(){
		
	}
	
	public CodigoBarras(long numOperacion, String locata, String codigoBarras, String caracteristica){
		this.setNumOperacion(numOperacion);
		this.setLocata(locata);
		this.setCodigoBarras(codigoBarras);
		this.setCaracteristica(caracteristica);
	}
	
}

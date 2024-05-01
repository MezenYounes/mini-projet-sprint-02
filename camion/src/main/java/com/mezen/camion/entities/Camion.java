package com.mezen.camion.entities;

import com.mezen.camion.entities.Marque;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
@Entity 
public class Camion {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idcamion;
	private String nomcamion;
	private Double prixcamion;
	private String description;
	@ManyToOne
	private Marque marque;
	public Long getIdcamion() {
		return idcamion;
	}
	public void setIdcamion(Long idcamion) {
		this.idcamion = idcamion;
	}
	public String getNomcamion() {
		return nomcamion;
	}
	public void setNomcamion(String nomcamion) {
		this.nomcamion = nomcamion;
	}
	public Double getPrixcamion() {
		return prixcamion;
	}
	public void setPrixcamion(Double prixcamion) {
		this.prixcamion = prixcamion;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Camion( String nomcamion, Double prixcamion, String description) {
		super();
		
		this.nomcamion = nomcamion;
		this.prixcamion = prixcamion;
		this.description = description;
	}
	public Camion() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Camion [idcamion=" + idcamion + ", nomcamion=" + nomcamion + ", prixcamion=" + prixcamion
				+ ", description=" + description + "]";
	}
	public Marque getMarque() {
		return marque;
	}
	public void setMarque(Marque marque) {
		this.marque = marque;
	}
	

	



}


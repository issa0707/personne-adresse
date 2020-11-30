package com.issa.demoSpringBoot.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Adresse {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int numeroRue;
	private String libelleVoie; 
	
	public Adresse() {
	}

	public Adresse(int numeroRue, String libelleVoie) {
		super();
		this.numeroRue = numeroRue;
		this.libelleVoie = libelleVoie;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNumeroRue() {
		return numeroRue;
	}

	public void setNumeroRue(int numeroRue) {
		this.numeroRue = numeroRue;
	}

	public String getLibelleVoie() {
		return libelleVoie;
	}

	public void setLibelleVoie(String libelleVoie) {
		this.libelleVoie = libelleVoie;
	}

	@Override
	public String toString() {
		return "Adresse [id=" + id + ", numeroRue=" + numeroRue + ", libelleVoie=" + libelleVoie + "]";
	}
	
	
}

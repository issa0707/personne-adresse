package com.issa.demoSpringBoot.beans;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="personne",schema = "public")
public class Personne {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	//@Id // clé primaire
//	@GeneratedValue(strategy = GenerationType.AUTO) // auto incrémenté
    //@Column(name = "NOM")
	//private int id;
	private String nom;
	private String prenom;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "id_Personne")
	private List<Adresse> adresse;
	
	public Personne() {
	}

	public Personne(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
	}

	public Personne(List<Adresse> adresse) {
		super();
		this.adresse = adresse;
	}

	public Personne(String nom, String prenom, List<Adresse> adresse) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public List<Adresse> getAdresse() {
		return adresse;
	}

	public void setAdresse(List<Adresse> adresse) {
		this.adresse = adresse;
	}

	@Override
	public String toString() {
		return "Personne [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", adresse=" + adresse + "]";
	}
	

}

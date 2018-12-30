package org.emsi.ejbapplication.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Banque {

	@GeneratedValue
	private Integer id;
	private String adresse;
	private double capital;
	private String libelle;
	private static final long serialVersionUID = 1L;

	public Banque(String adresse, double capital, String libelle) {
		super();
		this.adresse = adresse;
		this.capital = capital;
		this.libelle = libelle;
	}
	public Banque() {
		super();
	}   
	@Id
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}   
	public String getAdresse() {
		return this.adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}   
	public double getCapital() {
		return this.capital;
	}

	public void setCapital(double capital) {
		this.capital = capital;
	}   
	public String getLibelle() {
		return this.libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	@Override
	public String toString() {
		return "Banque{" +
				"id=" + id +
				", adresse='" + adresse + '\'' +
				", capital=" + capital +
				", libelle='" + libelle + '\'' +
				'}';
	}
}

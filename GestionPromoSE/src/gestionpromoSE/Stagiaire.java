package gestionpromoSE;

import java.time.LocalDateTime;

import javax.swing.Spring;

public class Stagiaire extends Apprenant {
	private boolean boursier;
	private double montant_bourse;
	private double salaire;
	private Spring nom_entreprise;
	
	@Override
	public void estAbsent(double nbJourneeAbsence) {
		// TODO Auto-generated method stub
		super.estAbsent(nbJourneeAbsence);
	}
	@Override
	public void estAbsent() {
		// TODO Auto-generated method stub
		super.estAbsent();
	}
	@Override
	public void estEnRetard(int dureeRetard, boolean justifier) {
		// TODO Auto-generated method stub
		super.estEnRetard(dureeRetard, justifier);
	}
	
	public boolean isBoursier() {
		return boursier;
	}
	public void setBoursier(boolean boursier) {
		this.boursier = boursier;
	}
	public double getMontant_bourse() {
		return montant_bourse;
	}
	public void setMontant_bourse(double montant_bourse) {
		this.montant_bourse = montant_bourse;
	}
	public double getSalaire() {
		return salaire;
	}
	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}
	public Spring getNom_entreprise() {
		return nom_entreprise;
	}
	public void setNom_entreprise(Spring nom_entreprise) {
		this.nom_entreprise = nom_entreprise;
	}
	public Stagiaire(int id_apprenant, String nom, String prenom, LocalDateTime dateInscreption, int numTel,
			String email, boolean boursier, double montant_bourse, double salaire, Spring nom_entreprise) {
		super(id_apprenant, nom, prenom, dateInscreption, numTel, email);
		this.boursier = boursier;
		this.montant_bourse = montant_bourse;
		this.salaire = salaire;
		this.nom_entreprise = nom_entreprise;
	}
	public Stagiaire() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Stagiaire(int id_apprenant, String nom, String prenom, LocalDateTime dateInscreption, int numTel,
			String email) {
		super(id_apprenant, nom, prenom, dateInscreption, numTel, email);
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Stagiaire [isBoursier()=" + isBoursier() + ", getMontant_bourse()=" + getMontant_bourse()
				+ ", getSalaire()=" + getSalaire() + ", getNom_entreprise()=" + getNom_entreprise()
				+ ", getId_apprenant()=" + getId_apprenant() + ", getNom()=" + getNom() + ", getPrenom()=" + getPrenom()
				+ ", getDateInscreption()=" + getDateInscreption() + ", getNumTel()=" + getNumTel() + ", getEmail()="
				+ getEmail() + ", getClass()=" + getClass() + "]";
	}
	@Override
	public void totalRetard() {
		// TODO Auto-generated method stub
		super.totalRetard();
	}
	@Override
	public void totalAbsence() {
		// TODO Auto-generated method stub
		super.totalAbsence();
	}

	
	
}

package gestionpromoSE;

import java.time.LocalDateTime;

import javax.swing.Spring;

public class Alternant extends Apprenant{
	
	private double  salaire;
	private int nb_jourEtreprise;
	private Spring nom_entreprise;
	public double getSalaire() {
		return salaire;
	}
	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}
	public int getNb_jourEtreprise() {
		return nb_jourEtreprise;
	}
	public void setNb_jourEtreprise(int nb_jourEtreprise) {
		this.nb_jourEtreprise = nb_jourEtreprise;
	}
	public Spring getNom_entreprise() {
		return nom_entreprise;
	}
	public void setNom_entreprise(Spring nom_entreprise) {
		this.nom_entreprise = nom_entreprise;
	}
	public Alternant(int id_apprenant, String nom, String prenom, LocalDateTime dateInscreption, int numTel,
			String email, double salaire, int nb_jourEtreprise, Spring nom_entreprise) {
		super(id_apprenant, nom, prenom, dateInscreption, numTel, email);
		this.salaire = salaire;
		this.nb_jourEtreprise = nb_jourEtreprise;
		this.nom_entreprise = nom_entreprise;
	}
	public Alternant() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Alternant(int id_apprenant, String nom, String prenom, LocalDateTime dateInscreption, int numTel,
			String email) {
		super(id_apprenant, nom, prenom, dateInscreption, numTel, email);
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Alternant [getSalaire()=" + getSalaire() + ", getNb_jourEtreprise()=" + getNb_jourEtreprise()
				+ ", getNom_entreprise()=" + getNom_entreprise() + ", getId_apprenant()=" + getId_apprenant()
				+ ", getNom()=" + getNom() + ", getPrenom()=" + getPrenom() + ", getDateInscreption()="
				+ getDateInscreption() + ", getNumTel()=" + getNumTel() + ", getEmail()=" + getEmail() + "]";
	}
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

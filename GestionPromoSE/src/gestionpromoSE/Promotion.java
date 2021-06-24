package gestionpromoSE;

import java.util.ArrayList;
import java.util.List;



public class Promotion  {

	private int id_promotion;
	private String nom_promotion;
//	la duree  est en nombre de jours 
	private int duree_promotion;
	private int duree_couler=0;
	private int id_apprenant;
	
	public int getId_promotion() {
		return id_promotion;
	}
	public void setId_promotion(int id_promotion) {
		this.id_promotion = id_promotion;
	}
	public String getNom_promotion() {
		return nom_promotion;
	}
	public void setNom_promotion(String nom_promotion) {
		this.nom_promotion = nom_promotion;
	}
	public int getDuree_promotion() {
		return duree_promotion;
	}
	public void setDuree_promotion(int duree_promotion) {
		this.duree_promotion = duree_promotion;
	}
	public int getDuree_couler() {
		return duree_couler;
	}
	public void setDuree_couler(int duree_couler) {
		this.duree_couler = duree_couler;
	}
	public int getId_apprenant() {
		return id_apprenant;
	}
	public void setId_apprenant(int id_apprenant) {
		this.id_apprenant = id_apprenant;
	}
	public Promotion( int id_promotion, String nom_promotion, int duree_promotion, int duree_couler, int id_apprenant) {
		
		
		this.id_promotion = id_promotion;
		this.nom_promotion = nom_promotion;
		this.duree_promotion = duree_promotion;
		this.duree_couler = duree_couler;
		this.id_apprenant = id_apprenant;
	}
	public Promotion(int id_promotion, String nom_promotion, int duree_promotion, int id_apprenant) {
	
		this.id_promotion = id_promotion;
		this.nom_promotion = nom_promotion;
		this.duree_promotion = duree_promotion;
		this.id_apprenant = id_apprenant;
	}
	

	

}

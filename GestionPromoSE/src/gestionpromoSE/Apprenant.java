package gestionpromoSE;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public abstract class Apprenant {
	final int maxabs = 3;
	final int maxretard = 30;
	private int id_apprenant;
	private String nom;
	private String prenom;
	private LocalDateTime dateInscreption;
	private int numTel;
	private String email;
	private  int id_promotion;
	public List<NonAssiduite> absenceRetard = new ArrayList<NonAssiduite>();
//	refaire de le code de façon qu'il rajoute directement les apprenants dans la list
//	public List<Apprenant> listAprenants= new ArrayList<Apprenant>();

	public int getId_apprenant() {
		return id_apprenant;
	}

	public int getId_promotion() {
		return id_promotion;
	}

	public void setId_promotion(int id_promotion) {
		this.id_promotion = id_promotion;
	}

	public void setId_apprenant(int id_apprenant) {
		this.id_apprenant = id_apprenant;
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

	public LocalDateTime getDateInscreption() {
		return dateInscreption;
	}

	public void setDateInscreption(LocalDateTime dateInscreption) {
		this.dateInscreption = dateInscreption;
	}

	public int getNumTel() {
		return numTel;
	}

	public void setNumTel(int numTel) {
		this.numTel = numTel;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Apprenant(int id_apprenant, String nom, String prenom, LocalDateTime dateInscreption, int numTel,
			String email) {
		this.id_apprenant = id_apprenant;
		this.nom = nom;
		this.prenom = prenom;
		this.dateInscreption = dateInscreption;
		this.numTel = numTel;
		this.email = email;
	}

	public Apprenant() {

	}

	public void estAbsent(double nbJourneeAbsence) {
		Absence abs = new Absence(absenceRetard.size() + 1, LocalDateTime.now(), true, nbJourneeAbsence);
		absenceRetard.add(abs);
	};

	public void estAbsent() {
		Absence abs = new Absence(absenceRetard.size() + 1, LocalDateTime.now(), false, 1);
		absenceRetard.add(abs);
	};

	public void estEnRetard(int dureeRetard, boolean justifier) {
		Retard rtd = new Retard(absenceRetard.size() + 1, LocalDateTime.now(), justifier, dureeRetard);
		absenceRetard.add(rtd);
	};

	public void totalRetard() {
		double somme = 0;
		for (NonAssiduite r : absenceRetard) {
			if (r instanceof Retard) {
				somme += ((Retard) r).getDureeRetard();
			}

		}
		if (somme >= maxretard) {
			System.out.println("ALERTE ROUGE");
			System.out.println("trop de retard: " + somme);
		} else {
			System.out.println(" nombre de retard en minutes: " + somme);
		}
	}

	public void totalAbsence() {
		double somme = 0;
		for (NonAssiduite a : absenceRetard) {
			if (a instanceof Absence) {
				somme += ((Absence) a).getNbJourneeAbsence();
			}
		}
		if (somme >= maxabs) {
			System.out.println("ALERTE ROUGE");
			System.out.println(" trop d'absence: " + somme);
		} else {
			System.out.println(" nombre d'absence en jours: " + somme);
		}
	}

	public List<NonAssiduite> getAbsenceRetard() {
		return absenceRetard;
	}

	public void setAbsenceRetard(List<NonAssiduite> absenceRetard) {
		this.absenceRetard = absenceRetard;
	}

	public int getMaxabs() {
		return maxabs;
	}

	public int getMaxretard() {
		return maxretard;
	}
	public List listeAbsence() {
		List<NonAssiduite> temp = new ArrayList<NonAssiduite>();
		for (NonAssiduite a : absenceRetard) {
			if (a instanceof Absence) {
				temp.add(a);
			}
		}
		return temp;
	}
	public List listeretard() {
		List<NonAssiduite> temp = new ArrayList<NonAssiduite>();
		for (NonAssiduite a : absenceRetard) {
			if (a instanceof Retard) {
				temp.add(a);
			}
		}
		return temp;
	}
}

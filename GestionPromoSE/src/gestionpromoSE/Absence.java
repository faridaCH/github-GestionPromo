package gestionpromoSE;

import java.time.LocalDateTime;

public class Absence extends NonAssiduite {
 private LocalDateTime date_reprise;
 private  double nbJourneeAbsence ;
public LocalDateTime getDate_reprise() {
	return date_reprise;
}
public void setDate_reprise(LocalDateTime date_reprise) {
	this.date_reprise = date_reprise;
}
public double getNbJourneeAbsence() {
	return nbJourneeAbsence;
}
public void setNbJourneeAbsence(double nbJourneeAbsence) {
	this.nbJourneeAbsence = nbJourneeAbsence;
}
public Absence(int numero, LocalDateTime date_NonAssiduite, boolean justifier, LocalDateTime date_reprise,
		double nbJourneeAbsence) {
	super(numero, date_NonAssiduite, justifier);
	this.date_reprise = date_reprise;
	this.nbJourneeAbsence = nbJourneeAbsence;
}
public Absence(int numero, LocalDateTime date_NonAssiduite, boolean justifier, double nbJourneeAbsence) {
	super(numero, date_NonAssiduite, justifier);
	this.nbJourneeAbsence = nbJourneeAbsence;
}
 
	
}

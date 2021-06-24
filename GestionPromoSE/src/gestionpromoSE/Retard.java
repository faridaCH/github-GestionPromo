package gestionpromoSE;

import java.time.LocalDateTime;

public class Retard  extends NonAssiduite{
private int dureeRetard;

public int getDureeRetard() {
	return dureeRetard;
}

public void setDureeRetard(int dureeRetard) {
	this.dureeRetard = dureeRetard;
}

public Retard(int numero, LocalDateTime date_NonAssiduite, boolean justifier, int dureeRetard) {
	super(numero, date_NonAssiduite, justifier);
	this.dureeRetard = dureeRetard;
}


}

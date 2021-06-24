package gestionpromoSE;

import java.time.LocalDateTime;

public class NonAssiduite {
	
	private int  Numero;
	private LocalDateTime date_NonAssiduite;
	private boolean justifier;
	public int getNumero() {
		return Numero;
	}
	public void setNumero(int numero) {
		Numero = numero;
	}
	public LocalDateTime getDate_NonAssiduite() {
		return date_NonAssiduite;
	}
	public void setDate_NonAssiduite(LocalDateTime date_NonAssiduite) {
		this.date_NonAssiduite = date_NonAssiduite;
	}
	public boolean isJustifier() {
		return justifier;
	}
	public void setJustifier(boolean justifier) {
		this.justifier = justifier;
	}
	public NonAssiduite(int numero, LocalDateTime date_NonAssiduite, boolean justifier) {
		Numero = numero;
		this.date_NonAssiduite = date_NonAssiduite;
		this.justifier = justifier;
	}
	public NonAssiduite() {
		
	}
	@Override
	public String toString() {
		return "NonAssiduite [Numero()=" + getNumero() + ", Date_NonAssiduite()=" + getDate_NonAssiduite()
				+ ",Justifier()=" + isJustifier() + ", Class()=" + getClass() + "]";
	}
	
	

}

package no.hvl.dat102;

import no.hvl.data102.adt.Sjanger;

public class Film {

	public static void main(String[] args) {}
		
		private int filmNr;
		private String Produsent;
		private String Tittel;
		private int Utgivelsesdato;
		private Sjanger s;
		private String Filmselskap;
		
	public Film() {
		
	}
	
	
	public Film(int filmNr, String Produsent, String Tittel, int Utgivelsesdato, Sjanger Sjanger, String Filmselskap) {
		this.filmNr = filmNr;
		this.Produsent = Produsent;
		this.Tittel = Tittel;
		this.Utgivelsesdato = Utgivelsesdato;
		this.s = Sjanger;
		this.Filmselskap = Filmselskap;
		
	}


	public int getFilmNr() {
		return filmNr;
	}


	public void setFilmnr(int filmNr) {
		this.filmNr = filmNr;
	}


	public String getProdusent() {
		return Produsent;
	}


	public void setProdusent(String produsent) {
		Produsent = produsent;
	}


	public String getTittel() {
		return Tittel;
	}


	public void setTittel(String tittel) {
		Tittel = tittel;
	}


	public int getUtgivelsesdato() {
		return Utgivelsesdato;
	}


	public void setUtgivelsesdato(int utgivelsesdato) {
		Utgivelsesdato = utgivelsesdato;
	}


	public Sjanger getS() {
		return s;
	}


	public void setS(Sjanger s) {
		this.s = s;
	}


	public String getFilmselskap() {
		return Filmselskap;
	}


	public void setFilmselskap(String filmselskap) {
		Filmselskap = filmselskap;
	}


	


	

	
	
		

}

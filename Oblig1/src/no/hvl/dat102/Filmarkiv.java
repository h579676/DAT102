package no.hvl.dat102;
import no.hvl.data102.adt.FilmarkivADT;
import no.hvl.data102.adt.Sjanger;

public class Filmarkiv implements FilmarkivADT {
	
	private Film [] filmTabell;
	private int antall;
	
	public Filmarkiv() {
		this.filmTabell = new Film[10];
			antall = 0;
	}

	@Override
	public Film[] hentFilmTabell() {
		// TODO Auto-generated method stub
		return filmTabell;
	}

	@Override
	public void leggTilFilm(Film nyFilm) {
		// TODO Auto-generated method stub
		filmTabell[antall] = nyFilm;
			antall++;
		
	}

	@Override
	public boolean slettFilm(int filmNr) {
		// TODO Auto-generated method stub
			for (int i = 0; i < antall; i++) {
				if (filmTabell[i].getFilmNr() == filmNr) {					
					filmTabell[i] = filmTabell[antall-1];
					filmTabell[antall-1] = null;
				
				antall--;
				return true; 
				}
			
	}
		return false;
	}

	@Override
	public Film[] sokTittel(String tittel) {
		// TODO Auto-generated method stub
		int j = 0;
		
		Film[] temp = new Film[antall];
		
		for(int i = 0; i < antall; i++) {
			if(filmTabell[i].getTittel().contains(tittel)) {
				
				temp[j] = filmTabell[i];
				
				j++;
			}
		}
		return temp;
	}

	@Override
	public Film[] sokProdusent(String produsent) {
		// TODO Auto-generated method stub
		int j = 0;
		
		Film[] temp = new Film[antall];
			for(int i = 0; i < antall; i++) {
				if(filmTabell[i].getProdusent() == produsent) {
				
					temp[j] =filmTabell[i];
					
					j++;
				}
			}
		return temp;
	}

	@Override
	public int antallSjanger(Sjanger sjanger) {
		// TODO Auto-generated method stub
		int antallSjanger = 0;
		
			for(int i = 0; i < antall; i++) {
				
				if(filmTabell[i].getS() == sjanger) {
					
					antallSjanger++;
				}
			}
		return antallSjanger;
	}

	@Override
	public int antall() {
		// TODO Auto-generated method stub
		
		return antall;
	}

}

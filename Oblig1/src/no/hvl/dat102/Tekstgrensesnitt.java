package no.hvl.dat102;
import java.util.Scanner;
import no.hvl.data102.adt.FilmarkivADT;
import no.hvl.data102.adt.Sjanger;

public class Tekstgrensesnitt {
		
		private Scanner sc = new Scanner(System.in); 
		
		
		
	public Film FilmlesFilm () {
			
		System.out.println("Enter film name:");
		
		int filmNr = sc.nextInt();
		String Produsent = sc.nextLine();
		String Tittel = sc.nextLine();
		int Utgivelsesdato = sc.nextInt();
		Sjanger s = Sjanger.finnSjanger(sc.nextLine());
		String Filmselskap = sc.nextLine();
		sc.nextLine();
		System.out.println ("Filmnummer:" + filmNr);
		System.out.println ("Produsent:" + Produsent);
		System.out.println ("Tittel:" + Tittel);
		System.out.println ("Utgivelsesdato:" + Utgivelsesdato);
		System.out.println ("Sjanger:" + s);
		System.out.println ("Filmselskap:" + Filmselskap);
		sc.nextLine();
		System.out.println("Velg en sjanger:");
		System.out.println("1) ACTION");
		System.out.println("2) DRAMA");
		System.out.println("2) HISTORY");
		System.out.println("3) SCIFI");
		
		Film f = new Film(filmNr, Produsent, Tittel, Utgivelsesdato, s, Filmselskap);
			return f;
			
		int valg = sc.nextInt();
		sc.nextInt();
		Sjanger s = Sjanger.SCIFI;
			if (valg == 1) {
				s = Sjanger.ACTION;
			} else if (valg == 2) {
				s = Sjanger.DRAMA;
			} else if (valg == 3) {
				s = Sjanger.HISTORY;
			} else if (valg == 4) {
				s = Sjanger.SCIFI;
			}
			System.out.println("Filmselskap: ");
			String filmselskap = sc.nextLine();
			return new Film(filmNr, Produsent, Tittel, Utgivelsesdato, s, Filmselskap);
			
			
	}
	
	
	
	public void visFilm (Film film) {
		System.out.println("FilmNummer:  " + film.getFilmNr());
		System.out.println("Produsent:  " + film.getProdusent());
		System.out.println("Tittel:  " + film.getTittel());
		System.out.println("Utgivelsesdato:  " + film.getUtgivelsesdato());
		System.out.println("Sjanger:  " + film.getS());
		System.out.println("Filmselskap:  " + film.getFilmselskap());
		System.out.println();
	}
	
	public void skrivUtFilmDelstrengTittel (FilmarkivADT filma, String delstreng) {
		Film[] subTittel = filma.sokTittel(delstreng);
		 for(int i = 0; i < subTittel.length; i++) {
			 System.out.println(subTittel[i].getTittel());
		 }
		
	}
	
	public void skrivUtFilmProdusent(FilmarkivADT filma, String delstreng) {
		 Film[] subProd = filma.sokProdusent(delstreng);
		 for(int i = 0; i < subProd.length; i++) {
			 System.out.println(subProd[i].getProdusent());
		 }
		 
	}	 	
	
	public void skrivUtStatistikk (FilmarkivADT filma) {
		
		System.out.println("");
		 System.out.println("Antall Filmer totalt : " + filma.antall());
		 for(Sjanger s : Sjanger.values()) {
			 System.out.println(s.toString() + ": " + filma.antallSjanger(s));
			 
		 }
		 System.out.println("");
		 
	 }
		

}

package no.hvl.dat102;
public class KlientFilmArkiv {

	public static void main(String[] args) {
		Filmarkiv filma = new Filmarkiv();
		Meny meny = new Meny(filma);
		meny.start();
		}
		
}
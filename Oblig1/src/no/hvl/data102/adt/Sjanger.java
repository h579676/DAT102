package no.hvl.data102.adt;

public enum Sjanger {
	ACTION, DRAMA, HISTORY, SCIFI;
	
/*
 * Konstruktøren er gitt implisitt og er private
	
*/

	public static Sjanger finnSjanger(String navn) {
		Sjanger sjang = null;
		for (Sjanger sj : Sjanger.values()) {
			if (sj.toString().equals(navn.toUpperCase())) {
				sjang = sj;
				break;
			}
		}
		return sjang;
	}// metode

}// class

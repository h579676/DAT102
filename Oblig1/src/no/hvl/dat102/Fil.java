package no.hvl.dat102;
import no.hvl.data102.adt.FilmarkivADT;
import no.hvl.data102.adt.Sjanger;

import java.io.*;

public class Fil {
    final static String DELIM = "#";

    public static void lesFraFil(FilmarkivADT arkiv, String filnavn) {
        File file = new File(filnavn);

        if (!file.exists()) {
            return;
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;

            while ((line = reader.readLine()) != null) {
                arkiv.leggTilFilm(stringToFilm(line));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void skrivTilFil(FilmarkivADT arkiv, String filnavn) {
        File file = new File(filnavn);
        Film[] filmtabell = arkiv.hentFilmTabell();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            for (Film film : filmtabell) {
                writer.write(formatFilm(film) + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String formatFilm(Film film) {
        return film.getFilmNr() + DELIM +
                film.getProdusent() + DELIM +
                film.getTittel() + DELIM +
                film.getUtgivelsesdato() + DELIM +
                film.getS() + DELIM +
                film.getFilmselskap();
    }

    private static Film stringToFilm(String filmString) {
        String[] filmFelt = filmString.split(DELIM);

        int filmNr = Integer.parseInt(filmFelt[0]);
        String Produsent = filmFelt[1];
        String Tittel = filmFelt[2];
        int Utgivelsesdato = Integer.parseInt(filmFelt[3]);
        Sjanger s = Sjanger.valueOf(filmFelt[4]);
        String Filmselskap = filmFelt[5];

        
        // (int nummer, String filmskaper, String tittel, int aar, String filmselskap, Sjanger sjanger) {
        return new Film(filmNr, Produsent, Tittel, Utgivelsesdato, s, Filmselskap);
    }
}
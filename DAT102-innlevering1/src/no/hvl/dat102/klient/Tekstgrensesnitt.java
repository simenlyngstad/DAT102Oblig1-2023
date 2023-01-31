package no.hvl.dat102.klient;


import no.hvl.dat102.Film;
import no.hvl.dat102.Sjanger;
import no.hvl.dat102.adt.FilmarkivADT;

public class Tekstgrensesnitt { 
	 // lese opplysningene om en FILM fra tastatur  
	 public Film lesFilm() {
		 return null; 
	 }
			  
	 // vise en film med alle opplysninger på skjerm (husk tekst for sjanger) 
	 public void visFilm(Film film) { 
		 
	  System.out.println(film.getFilmnr() + " " + film.getSjanger() + film.getTittel());
	  System.out.println("Produsert i " + film.getLanseringsår() + "av produsent " +
	  film.getFilmskaper());
	 } 
	 
	 // Skrive ut alle Filmer med en spesiell delstreng i tittelen 
	 public void skrivUtFilmDelstrengITittel(FilmarkivADT filma,  
	                                                String delstreng) { 
		 Film[] soek = filma.soekTittel(delstreng);
		 for(int i = 0; i < soek.length; i++) {
			 visFilm(soek[i]);
		 }
	 } 
	 
	 // Skriver ut alle Filmer av en produsent / en gruppe 
	 public void skrivUtFilmProdusent(FilmarkivADT filma, String delstreng) { 
	 
		 Film[] soek = filma.soekProdusent(delstreng);
		 for(Film soeker : soek) {
			 visFilm(soeker);
		 }
	 } 
	 
	 // Skrive ut en enkel statistikk som inneholder antall Filmer totalt 
	 // og hvor mange det er i hver sjanger 
	 public void skrivUtStatistikk(FilmarkivADT filma) { 
	System.out.println("Antall filmer: " + filma.antall() + "\n");
	System.out.println("Antall SciFi: " + filma.antall(Sjanger.SCIFI) + "\n");
	System.out.println("Antall Action: " + filma.antall(Sjanger.ACTION) + "\n");
	System.out.println("Antall Drama: " + filma.antall(Sjanger.DRAMA) + "\n");
	System.out.println("Antall History: " + filma.antall(Sjanger.HISTORY));
		 
	 } 
	 // ... Ev. andre metoder 
	 
	}
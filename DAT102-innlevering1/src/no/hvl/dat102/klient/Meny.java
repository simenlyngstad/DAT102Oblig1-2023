package no.hvl.dat102.klient;

import no.hvl.dat102.Film;
import no.hvl.dat102.Sjanger;
import no.hvl.dat102.adt.FilmarkivADT;

public class Meny {

	private Tekstgrensesnitt tekstgr;
	private FilmarkivADT filmarkiv2;

	public Meny(FilmarkivADT filmarkiv) {
		
		tekstgr = new Tekstgrensesnitt();
		this.filmarkiv2 = filmarkiv;
	}

	public void start() {
		Film f1 = new Film(000, "Daniel Fleksnes", "Barbell Killer", 1976, "Fleksnes productions", Sjanger.ACTION);
		Film f2 = new Film(001, "Daniel Motorentusiast", "The Hamsterman", 2001, "Daniel Motorparts Productions", Sjanger.DRAMA);
		Film f3 = new Film(002, "Daniello Caravello", "The Rabbithole", 1976, "Daniello bros", Sjanger.SCIFI);
		Film f4 = new Film(003, "Daniel Krezindsky", "The Chessgod", 1989, "Kasparov AS" ,Sjanger.HISTORY);
		filmarkiv2.leggTilFilm(f1);
		filmarkiv2.leggTilFilm(f2);
		filmarkiv2.leggTilFilm(f3);
		filmarkiv2.leggTilFilm(f4);
		tekstgr.skrivUtFilmProdusent(filmarkiv2, "DJdan");
		System.out.println(filmarkiv2.antall());
	}
}
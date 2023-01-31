package no.hvl.dat102;

import java.util.ArrayList;
import no.hvl.dat102.adt.FilmarkivADT;

public class Filmarkiv implements FilmarkivADT {

	Film[] arkiv;
	int filma;

	Filmarkiv(int storrelse) {
		arkiv = new Film[storrelse];
		filma = 0;
	}

	@Override
	public void visFilm(int filmnr) {
		for (Film f : this.arkiv) {
			if (f.getFilmnr() == filmnr) {
				System.out.println(f.getTittel());

				return;
			}
		}
		System.out.println("Ingen film ble funnet med gitt nr.");

	}

	@Override
	public void leggTilFilm(Film nyFilm) {

		if (this.arkiv.length == 
				this.filma || 
				this.filma > 
				this.arkiv.length) {
			System.out.println("Lengden på arkivet er det samme, " 
				+ "eller større enn maks.");
			System.out.println("Antallet filmer: " + this.filma);
			System.out.println("Size: " + this.arkiv.length);

			return;
		}
		this.arkiv[filma] = nyFilm;
		this.filma++;
	}

	@Override
	public boolean slettFilm(int filmnr) {
		for (int i = 0; i < this.filma; i++) {
			if (this.arkiv[i].getFilmnr() == filmnr) {
				System.out.println(this.arkiv[i].getTittel() 
						+ "er nå slettet");
			}
		}
		return false;

	}

	@Override
	public Film[] soekTittel(String delstreng) {
		ArrayList<Film> resultat = new ArrayList<Film>();
		for (Film f : this.arkiv) {
			if (f.getTittel().contains(delstreng))
				;
			resultat.add(f);
		}
		Film[] soek = resultat.toArray(new Film[0]);

		return soek;
	}

	@Override
	public Film[] soekProdusent(String delstreng) {
		ArrayList<Film> resultatet = new ArrayList<Film>();
		for (Film f : this.arkiv) {
			if (f != null && f.getFilmskaper().contains(delstreng));
			
			resultatet.add(f);
		}
		Film[] soek = resultatet.toArray(new Film[0]);
		
		return soek;
	}

	@Override
	public int antall(Sjanger filmsjanger) {
		int sum = 0;
		for(Film f : this.arkiv) {
			if(f.getSjanger() == filmsjanger) {
				sum++;
			}
		
		}
		return sum;
	}

	@Override
	public int antall() {
		return this.filma;
	}


}

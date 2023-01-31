package no.hvl.dat102;

import java.util.ArrayList;
import no.hvl.dat102.adt.FilmarkivADT;

public class Filmarkiv2 implements FilmarkivADT {

	private int antall;
	private LinearNode<Film> start;
	
	public Filmarkiv2() {
		this.antall = 0;
		this.start = new LinearNode<Film>();
	}
	
	private LinearNode<Film> forekomst(int iterasjon) {
		LinearNode<Film> forekomst = this.start;
		for(int i = 0; i < iterasjon; i++) {
			forekomst = forekomst.getNeste();
		}
		return forekomst;
	}
	
	
	@Override
	public void leggTilFilm(Film nyFilm) {
		LinearNode<Film> nynode = new LinearNode<Film>(nyFilm);
		if(this.antall != 0) {
			forekomst(this.antall-1).setNeste(nynode);
		} else {
			this.start = nynode;
		}
		this.antall++;
		
	}
	@Override
	public boolean slettFilm(int filmnr) {
		if(filmnr < 0) {
			System.out.println("Negativ input når film slettes.");
		}
		
		if(filmnr < this.antall && filmnr != 0) {
			if(filmnr == this.antall-1) {
				forekomst(filmnr).setElement(null);
			} else {
				forekomst(filmnr-1).setNeste(forekomst(filmnr-1));
			}
			
		} else if(filmnr == 0) {
			if(this.antall > 1) {
				this.start.setNeste(start.getNeste());
			} else {
				this.start.setElement(null);
			}
			this.antall--;
			
		} else {
			System.out.println("Denne forekomsten eksisterer ikke.");
			return false;
		}
		return false;
		
		
	}
	@Override
	public Film[] soekTittel(String delstreng) {
		ArrayList<Film> resultat = new ArrayList<>();
		for(int i = 0; i < antall; i++) {
			if(forekomst(i).getElement().getTittel().contains(delstreng))
				resultat.add(forekomst(i).getElement());
				
		}
		Film[] soek = resultat.toArray(new Film[0]);
		return soek;
		
	}
	@Override
	public Film[] soekProdusent(String delstreng) {
		ArrayList<Film> resultatet = new ArrayList<Film>();
		for(int i = 0; i < this.antall; i++) {
			Film filmResultat = forekomst(i).getElement();
			if(filmResultat != null && filmResultat.getFilmskaper().contains(delstreng))
				resultatet.add(filmResultat);
		}
		Film[] soek = resultatet.toArray(new Film[0]);
		return soek;
	}
	
	@Override
	public int antall() {
		return this.antall;
	}
	
	@Override
	public void visFilm(int filmnr) {
		
		if(filmnr < this.antall) {
			System.out.println
			(forekomst(filmnr).getElement().getTittel());
		} else {
			System.out.println
			("Denne forekomsten eksisterer ikke.");
		}
	}

	@Override
	public int antall(Sjanger filmsjanger) {
		int sum = 0;
		for(int i = 0; i < antall; i++) {
			if(forekomst(i).getElement().getSjanger() == filmsjanger){
				sum++;
			}
		}
		return sum;
	}
}

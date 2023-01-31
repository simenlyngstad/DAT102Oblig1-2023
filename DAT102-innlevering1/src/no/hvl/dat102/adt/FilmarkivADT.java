package no.hvl.dat102.adt;

import no.hvl.dat102.Film;
import no.hvl.dat102.Sjanger;

public interface FilmarkivADT {

	/** 
	  * Hente en film med gitt nr fra arkivet 
	 
	  *  
	  * @param nr nummer p� film som skal hentes.  
	  * @return film med gitt nr. Om nr ikke finnes, returneres null. 
	  */ 
	 void visFilm(int filmnr); 
	 
	 /** 
	  * Legger til en ny film. 
	  * @param nyFilm 
	  */ 
	 void leggTilFilm(Film nyFilm); 
	 
	 /** 
	  * Sletter en fil med gitt nr 
	  * @param filmnr nr p� film som skal slettes 
	  * @return true dersom filmen ble slettet, false ellers 
	  */ 
	 boolean slettFilm(int filmnr); 
	 
	  
	/** 
	  * S�ker og henter Filmer med en gitt delstreng i tittelen. 
	  * @param delstreng som m� v�re i tittel 
	  * @return tabell med filmer som har delstreng i tittel 
	  */ 
	 Film[] soekTittel(String delstreng); 
	 
	        /** 
	  * S�ker og henter filmer med en gitt delstreng i filmprodusent 
	  *  
	  * @param delstreng 
	  * @return 
	  */ 
	 Film[] soekProdusent(String delstreng);  
	 
	 /** 
	  * Finner antall filmer med gitt sjanger 
	  * @param sjanger  
	  * @return antall filmer av gitt sjanger. 
	  */ 
	           
	   
	 int antall(Sjanger filmsjanger); 
	 
	 /** 
	  *  
	  * @return antall filmer i arkivet 
	  */ 
	 int antall();

}


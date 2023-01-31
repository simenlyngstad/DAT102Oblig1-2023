package no.hvl.dat102;

public class Film {

	int filmnr;
	String filmskaper;
	String tittel;
	int lanseringsår;
	String filmselskap;
	Sjanger filmsjanger;
	
	public Film() {
		
	}
	
	public Film(int filmnr, String filmskaper, String tittel, 
			int lanseringsår, String filmselskap, Sjanger filmsjanger) {
		this.filmnr = filmnr;
		this.filmskaper = filmskaper;
		this.tittel = tittel;
		this.lanseringsår = lanseringsår;
		this.filmselskap = filmselskap;
		this.filmsjanger = filmsjanger;
	}
	
	public int getFilmnr() {
		return filmnr;
	}
	public void setFilmnr(int filmnr) {
		this.filmnr = filmnr;
	}
	public String getFilmskaper() {
		return filmskaper;
	}
	public void setFilmskaper(String filmskaper) {
		this.filmskaper = filmskaper;
	}
	public String getTittel() {
		return tittel;
	}
	public void setTittel(String tittel) {
		this.tittel = tittel;
	}
	public int getLanseringsår() {
		return lanseringsår;
	}
	public void setLanseringsår(int lanseringsår) {
		this.lanseringsår = lanseringsår;
	}
	public String getFilmselskap() {
		return filmselskap;
	}
	public void setFilmselskap(String filmselskap) {
		this.filmselskap = filmselskap;
	}
	public Sjanger getSjanger() {
		return filmsjanger;
	}
	public void setSjanger(Sjanger filmsjanger) {
		this.filmsjanger = filmsjanger;
	}
	
	@Override
	public String toString() {
		return "Film [filmnr =  " + filmnr + "#" + ", filmskaper = " + "#" + 
	filmskaper + ", filmselskap = " + filmselskap + "#" + ", filmsjanger = " +
	filmsjanger + "]";
	}
	
	@Override
	   public boolean equals(Object filmnr) {
			if (this == filmnr) {
				return true;
			}
			return false;
	}
	
	@Override 
	public int hashCode() { 
	    Integer temp = filmnr; 
	    return temp.hashCode(); 
	} 

	
}

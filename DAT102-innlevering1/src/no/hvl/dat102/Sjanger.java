package no.hvl.dat102;

public enum Sjanger {
	ACTION, DRAMA, HISTORY, SCIFI;
	
	public static Sjanger finnSjanger(String navn) {
		Sjanger filmsjanger = null;
		for(Sjanger sj : Sjanger.values()) {
			if(sj.toString().equals((navn.toUpperCase()))) {
				filmsjanger = sj;
				break;
			}
		}
		return filmsjanger;
	}
	
}
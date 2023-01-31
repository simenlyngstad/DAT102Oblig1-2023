package no.hvl.dat102.tabell;

import no.hvl.dat102.adt.KoeADT;
import no.hvl.dat102.koet.adt.koeADTTest;

public class TabellKoeTest extends koeADTTest {
	   @Override
		protected KoeADT<Integer> reset() {
			return new TabellSirkulaerKoe<Integer>();
		}
}
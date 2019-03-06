package it.polito.tdp.parole.model;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Parole {
	List<String> parole= new LinkedList<String>();
	public Parole() {
		
	}
	
	public void addParola(String p) {
		if(!parole.contains(p))
		parole.add(p);
	}
	
	public List<String> getElenco() {
		Collections.sort(parole, new ComparatorParole());
		return parole;
	}
	
	public void reset() {
		parole.clear();
	}
	
	public void cancella(String p) {
		parole.remove(p);
	}

}

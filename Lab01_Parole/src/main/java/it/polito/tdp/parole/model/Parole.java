package it.polito.tdp.parole.model;

import java.util.*;

public class Parole {
		
	List<String> parole;
	
	public Parole() {
		parole= new ArrayList<String>();
	}
	
	public void addParola(String p) {
		this.parole.add(p);
	}
	
	public List<String> getElenco() {
		List<String> temp= new ArrayList<String>(this.parole);
		Collections.sort(temp);
		return temp;
	}
	
	public void reset() {
		//elimina tutte le parole
		this.parole.clear();
	}
	
	public void cancellaParola(String p) {
		this.parole.remove(p);
	}

}

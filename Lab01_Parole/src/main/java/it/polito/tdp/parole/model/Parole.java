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
		//TODO
		return null;
	}
	
	public void reset() {
		// TODO
	}

}

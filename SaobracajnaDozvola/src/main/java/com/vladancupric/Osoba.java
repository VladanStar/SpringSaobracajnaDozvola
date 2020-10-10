package com.vladancupric;

public class Osoba {
	private String ime;
	private String prezime;
	private long jmbg;
	
	public Osoba() {
		super();
	}

	public Osoba(String ime, String prezime, long jmbg) {
		super();
		this.ime = ime;
		this.prezime = prezime;
		this.jmbg = jmbg;
	}
	

	public void setIme(String ime) {
		this.ime = ime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

	public void setJmbg(long jmbg) {
		this.jmbg = jmbg;
	}

	@Override
	public String toString() {
		return "Osoba [ime=" + ime + ", prezime=" + prezime + ", jmbg=" + jmbg + "]";
	}
	
	
	

}

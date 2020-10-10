package com.vladancupric;

public class SaobracajnaDozvola {
	private Osoba vlasnik;
	private Auto automobil;
	
	public SaobracajnaDozvola() {
		super();
	}

	public SaobracajnaDozvola(Osoba vlasnik, Auto automobil) {
		super();
		this.vlasnik = vlasnik;
		this.automobil = automobil;
	}

	public void setVlasnik(Osoba vlasnik) {
		this.vlasnik = vlasnik;
	}

	public void setAutomobil(Auto automobil) {
		this.automobil = automobil;
	}

	@Override
	public String toString() {
		return "SaobracajnaDozvola [vlasnik=" + vlasnik + ", automobil=" + automobil + "]";
	}
	
	
	

}

package com.vladancupric;

import org.springframework.beans.factory.annotation.Autowired;

public class SaobracajnaDozvola {
	@Autowired
	private Osoba vlasnik;
	@Autowired
	private Auto automobil;
	
	public SaobracajnaDozvola() {
		super();
	}
	//@Autowired
	public SaobracajnaDozvola(Osoba vlasnik, Auto automobil) {
		super();
		this.vlasnik = vlasnik;
		this.automobil = automobil;
	}
	//@Autowired
	public void setVlasnik(Osoba vlasnik) {
		this.vlasnik = vlasnik;
	}
	
	//@Autowired
	public void setAutomobil(Auto automobil) {
		this.automobil = automobil;
	}

	@Override
	public String toString() {
		return "SaobracajnaDozvola [vlasnik=" + vlasnik + ", automobil=" + automobil + "]";
	}
	
	
	

}

package com.vladancupric;

public class Auto {
	private String marka;
	private String tip;
	
	public Auto() {
		super();
	}

	public Auto(String marka, String tip) {
		super();
		this.marka = marka;
		this.tip = tip;
	}

	public void setMarka(String marka) {
		this.marka = marka;
	}

	public void setTip(String tip) {
		this.tip = tip;
	}

	@Override
	public String toString() {
		return "Auto [marka=" + marka + ", tip=" + tip + "]";
	}
	
	
	

}

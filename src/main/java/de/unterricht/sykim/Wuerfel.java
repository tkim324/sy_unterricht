package de.unterricht.sykim;

import java.util.Random;

public class Wuerfel {
	private int wert;
	static Random r = new Random();

	public Wuerfel() {
		this.wert = r.nextInt(6)+1;
	}


	public int getWert() {
		return wert;
	}

	public int wuerfeln() {
		this.wert = r.nextInt(6)+1;
		return this.wert;
	}

	public boolean istGleich (Wuerfel w1, Wuerfel w2) {
		return w1.getWert()== w2.getWert();

	}

}

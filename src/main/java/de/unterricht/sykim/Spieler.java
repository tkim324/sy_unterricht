package de.unterricht.sykim;

public class Spieler {

	Wuerfel w = new Wuerfel();
	String name;
	int punktzahl = 0;

	public Spieler(String name) {
		this.name = name;
	}

	public int punkte() {
		return this.punktzahl;
	}

	public int punktPlus() {
		this.punktzahl = this.punktzahl+1;
		return this.punktzahl;
	}
	public int punktPlus(int n) {
		return this.punktzahl+n;
	}

	public void reset() {
		this.punktzahl = 0;
	}
	@Override
	public String toString() {
		return "Spieler [name=" + name + ", punktzahl=" + punktzahl + "]";
	}

	public int wuerfeln() {
		return w.wuerfeln();
	}


}

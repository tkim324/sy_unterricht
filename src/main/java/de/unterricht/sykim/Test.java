package de.unterricht.sykim;

import java.util.Scanner;

public class Test {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.print("Bitte geben Sie Name : ");
		Spieler s1 = new Spieler(sc.next());
		Spieler s2 = new Spieler("computer");

		System.out.println("Ihr Name ist : " + s1.name);

		boolean weiter = true;

		while(weiter) {
			System.out.print("Moechten Sie spielen ? ");
			weiter = sc.nextBoolean();
			Spiel.simplesSpiel(s1, s2);
			System.out.println(s1.toString());
			System.out.println(s2.toString());
			if(weiter == false)
				break;
		}

//		do {
//			System.out.print("Moechten Sie spielen ? ");
//			weiter = sc.nextBoolean();
//			Spiel.simplesSpiel(s1, s2);
//			System.out.println(s1.toString());
//			System.out.println(s2.toString());
//		} while (weiter);

	}
}

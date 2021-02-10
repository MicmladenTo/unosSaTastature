package unosSaTastature;

import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String ime;
		String prezime;
		String brojIndeksa;
		double prosecnaOcena;
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Unesite ime:");
		ime = scn.next();
		
		System.out.println("Unesite prezime:");
		prezime = scn.next();
		
		System.out.println("Unesite broj indeksa:");
		brojIndeksa = scn.next();
		
		System.out.println("Unesite proseènu ocenu:");
		prosecnaOcena = scn.nextDouble();
		
		System.out.println("Ime: " + ime);
		System.out.println("Prezime: " + prezime);
		System.out.println("Br. ind: " + brojIndeksa);
		System.out.println("Prosek: " + prosecnaOcena);

	}

}
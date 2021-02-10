package unosSaTastature;

import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a;
		int b;
		int c;
		
		Scanner skener = new Scanner(System.in);
		
		System.out.println("Unesite prvi broj: ");
		a = skener.nextInt();
		
		System.out.println("Unesite drugi broj: ");
		b = skener.nextInt();
		
		c = (a + b) / 2;
		
//		System.out.println("Srednja vrednost je: " + c);
		System.out.println("Proizvod je: " + a * b);
		
	}

}

//Napisati program koji ucitava vrednosti a i b i na kraju ispistuje njihov proizvod.
package unosSaTastature;

import java.util.Scanner;

public class UnosSaTastature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		int b;
		
		//povezivanje sa tastature - ova klasa koda æe morati na samom poèetku koda 
		Scanner skener = new Scanner(System.in);
		
		System.out.println("Unesite prvi broj: ");
		a = skener.nextInt();
		
		System.out.println("Unesite drugi broj: ");
		b = skener.nextInt();
		
		System.out.println("Vrednost a je: " + a + ", a vrednost b je " + b);
		
	}

}

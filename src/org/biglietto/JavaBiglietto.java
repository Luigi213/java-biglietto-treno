package org.biglietto;

import java.util.Scanner;

public class JavaBiglietto {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Inserire i kolimetri");
		int km = in.nextInt();
		
		System.out.println("Inserire l'eta'");
		int age = in.nextInt();
		
		discount(km, age);
		
		in.close();
		
	}
	
	public static void discount(int km, int age) {
		if(age < 18) {
			double price = km * 0.8 * 0.21; 
			System.out.println("Il prezzo del biglietto: " + String.format("%.2f", price) + " €");
		}
		else if(age > 65) {
			double price = km * 0.6 * 0.21; 
			System.out.println("Il prezzo del biglietto: " + String.format("%.2f", price) + " €");
		}
		else {
			double price = km * 0.21; 
			System.out.println("Il prezzo del biglietto: " + String.format("%.2f", price) + " €");
		}
	}
}

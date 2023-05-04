package org.biglietto;

import java.util.Scanner;

public class FizzBazz {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Quanti numeri da stampare");
		int num = in.nextInt();
		
		System.out.println("Ecco i numeri:");
		
		for(int i=1; i<=num; i++) {
			if(i % 3 == 0 && i % 5 == 0) {
				System.out.println("FizzBazz");
			}
			else if(i % 3 == 0) {
				System.out.println("Fizz");
			} else if(i % 5 == 0) {
				System.out.println("Bazz");
			}
			else {
				System.out.println(i);
			}
		}
		
		in.close();
	}
}

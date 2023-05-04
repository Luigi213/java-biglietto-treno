package org.biglietto;

import java.util.Scanner;

public class Bonus {
	public static void main(String[] args) {
		
		String[] arrInv = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi", "Bebe Vio","Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"}; 
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Inserisci il nome");
		String name = in.nextLine();
		
		in.close();
		
//		for(int i =0; i<arrInv.length; i++) {
//			String guest = arrInv[i];
//			
//			if(name.equals(guest)) {
//				System.out.println("Sei stato invitato " + name);
//			}
//		}
		
		int i = 0;
		while(name.equals(arrInv[i])) {
			System.out.println("Sei stato invitato " + name);
			i++;
			return;
		}
		
		System.out.println("Non sei stato invitato " + name);
	}
}

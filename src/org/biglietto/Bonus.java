package org.biglietto;

import java.util.Scanner;

public class Bonus {
	public static void main(String[] args) {
		
		String[] arrInv = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi", "Bebe Vio","Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"}; 
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Inserisci il nome");
		String name = in.nextLine();
		String status = null;
		
		int i = 0;
		while(name.equals(arrInv[i])) {
			if(name.equals(arrInv[i])) {
				status = "Sei stato invitato " + name;
				System.out.println(status);
			}
			else {	
				status = "Non sei stato invitato " + name;
				System.out.println(status);
			}
			i++;
		}			

		
		System.out.println("Second method---------------------------");
		
//		if(arrInv[i].equals(name)) {
//			for(int i=0; i<arrInv.length; i++){
//				status = "Sei stato invitato " + name;
//				i++;
//			}			
//			System.out.println(status);
//		}
//		else {	
//			status = "Non sei stato invitato " + name;
//			System.out.println(status);
//		}
		
		
		in.close();
	}
}

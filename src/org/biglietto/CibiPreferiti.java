package org.biglietto;

public class CibiPreferiti {
	public static void main(String[] args) {
		String[] arrFood = {"lasagna", "pizza", "gelato", "kebab", "carbonara"};
		
		System.out.println("lunghezza della classifica: " + arrFood.length);
		for(int i=0; i<arrFood.length; i++) {
			if(i == 0) {
				System.out.println("il mio cibo preferito della classifica: " + arrFood[i]);
			} else if(i == arrFood.length - 1 ) {
				System.out.println("il mio cibo meno preferito della classifica: " + arrFood[i]);
			}
			else {
				System.out.println("il cibo in mezzo della classifica: " + arrFood[i]);
			}
		}
	}
}

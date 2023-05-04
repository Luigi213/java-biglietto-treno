package org.biglietto;

public class CibiPreferiti {
	public static void main(String[] args) {
		String[] arrFood = {"lasagna", "pizza", "gelato", "kebab", "carbonara", "ciao"};
		
		System.out.println("lunghezza della classifica: " + arrFood.length);
		for(int i=0; i<arrFood.length; i++) {
			if(i == 0) {
				System.out.println("il mio cibo preferito della classifica: " + arrFood[i]);
			} else if(i == arrFood.length - 1 ) {
				System.out.println("il mio cibo meno preferito della classifica: " + arrFood[i]);
			}
		}
		
		int media = arrFood.length / 2;
		
		System.out.println("mediano " + arrFood[media]);
		
		if(arrFood.length % 2 == 0) {
			System.out.println("mediano " + arrFood[media - 1]);
			System.out.println("mediano " + arrFood[media]);
		}
	}
}

package animais;

import java.util.Scanner;

public class Princiapal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		Elefante elefante = new Elefante (4,"marron","quadrupede", 9);
		System.out.println(elefante);
		
		
		sc.close();
	}

}

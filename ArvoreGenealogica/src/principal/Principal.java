package principal;

import java.util.Scanner;

import entities.Filho;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		Filho  filho1 = new Filho();
		System.out.println("Digite o nome do pai e da mãe: ");
		filho1.maeDe(sc.nextLine());
		filho1.paiDe(sc.nextLine());
		
		
		System.out.println(filho1);
		
		
		sc.close();

	}

}

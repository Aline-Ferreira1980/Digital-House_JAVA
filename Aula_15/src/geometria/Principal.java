package geometria;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 
		Retangulo ab = new Retangulo();
		
		
		System.out.println("Digite a altura do retangulo: ");
		ab.altura= sc.nextDouble();
		System.out.println("Digite a largura do retângulo: ");
		ab.largura = sc.nextDouble();

		System.out.println(ab);//estou sobrescrevendo o metodo toString somente é necessario colocar o objeto;
		System.out.println(Circulo.circunferencia(3.0));
		System.out.println(Circulo.volume(3.0));
		
		sc.close();
	}

}

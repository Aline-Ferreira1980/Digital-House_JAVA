package exercicios;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		// 5.	Crie um programa que receba um input do teclado com uma idade e retorne se � maior ou menor de idade.
		int idade;
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Digite sua idade: \n");
		idade= sc.nextInt();
		
		if (idade >= 18) {
			System.out.println("Voc� � maior de idade, pode entrar.");
		}else {
			System.out.println("Desculpe, voc� � menor de idade e n�o pode entrar. ");
		}
	}

}

package exercicios;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		// 7.	Crie um programa que verifique se a pessoa tem todos os requisitos para dirigir.
		String sabeLer, temCPF,temRG, foiAprovado;
		int idade = 0;
		String nome;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Diga seu nome e responda às perguntas:");
		nome= sc.next();
		System.out.println("Digite sua idade");
		idade = sc.nextInt();
		System.out.println("Você sabe ler?");
		sabeLer= sc.next();
		System.out.println("Você tem CPF?");
		temCPF = sc.next();
		System.out.println("Você tem RG?");
		temRG = sc.next();
		System.out.println("Foi aprovado nos exames?");
		foiAprovado = sc.next();
		
		
		if ((sabeLer.toLowerCase().equals("sim")) && (idade >=18) && (temCPF.toLowerCase().equals("sim")) && (temRG.toLowerCase().equals("sim")) && (foiAprovado.toLowerCase().equals("sim"))) {
			System.out.println("Parabéns "+ nome+ " você poderá ter sua habilitação... ");
		}
		else {
			System.out.println("Você não foi aprovado para ter a habilitação.");
		}
	}
}

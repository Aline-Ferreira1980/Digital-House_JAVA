package exercicios;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		// 7.	Crie um programa que verifique se a pessoa tem todos os requisitos para dirigir.
		String sabeLer, temCPF,temRG, foiAprovado;
		int idade = 0;
		String nome;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Diga seu nome e responda �s perguntas:");
		nome= sc.next();
		System.out.println("Digite sua idade");
		idade = sc.nextInt();
		System.out.println("Voc� sabe ler?");
		sabeLer= sc.next();
		System.out.println("Voc� tem CPF?");
		temCPF = sc.next();
		System.out.println("Voc� tem RG?");
		temRG = sc.next();
		System.out.println("Foi aprovado nos exames?");
		foiAprovado = sc.next();
		
		
		if ((sabeLer.toLowerCase().equals("sim")) && (idade >=18) && (temCPF.toLowerCase().equals("sim")) && (temRG.toLowerCase().equals("sim")) && (foiAprovado.toLowerCase().equals("sim"))) {
			System.out.println("Parab�ns "+ nome+ " voc� poder� ter sua habilita��o... ");
		}
		else {
			System.out.println("Voc� n�o foi aprovado para ter a habilita��o.");
		}
	}
}

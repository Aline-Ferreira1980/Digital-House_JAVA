package exercicios;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		// 6.	Crie um programa que, dado um dia da semana, verifique se � final de semana.
		String diaDeSemana;
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Entre com o dia de semana: ");
		diaDeSemana = sc.nextLine();
		
		if ((diaDeSemana.toLowerCase().equals("domingo")) ||(diaDeSemana.toLowerCase().equals("sabado"))) {
			System.out.println("� fim de semana, vamos fazer um churrasco");
		}else {
			System.out.println("N�o teremos churrasco pois ainda � dia de semana.");
		}
		
	}

}

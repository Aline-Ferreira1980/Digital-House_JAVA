package exercicio_02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		List<JogadorDeFutebol> lista = new ArrayList<>();
		
		JogadorDeFutebol  jogador = new JogadorDeFutebol();

		
		do {
			
		System.out.print("Digite o nome do jogador: ");
		String nome = sc.next();
		if (nome.isBlank()) {
			break;
		}else {
			lista.add(new JogadorDeFutebol());
		}
		System.out.print("Entre com o total de energia do jogador: ");
		Integer energia = sc.nextInt();
		sc.nextLine();
		System.out.print("Entre com o total de energia do jogador: ");
		Integer alegria = sc.nextInt();
		System.out.print("Entre com o total de energia do jogador: ");
		Integer gols = sc.nextInt();
		System.out.print("Entre com o total de energia do jogador: ");
		Integer experiencia = sc.nextInt();
		
		
		
		jogador.getAlegria();
		jogador.getEnergia();
		jogador.getExperiencia();
		
		lista.add(new JogadorDeFutebol(nome, energia,alegria , gols, experiencia));
		
		System.out.println("\n---------Dados do Jogador-----------\n");
		System.out.println("Jogador "+ nome);
		System.out.println("Energia: " + energia);
		
		
	}while (true);
		for (JogadorDeFutebol i: lista) {
			
		}
		System.out.println(lista);
		//jogador.fazerGol(gols);
		
		System.out.println("Alegria: " + jogador.getAlegria());
		System.out.println("Gols marcados: " + jogador.getGols());
		System.out.println("Experiência: "+ jogador.getExperiencia());
		
		
		System.out.println(jogador.fazerGol(3));
		System.out.println(lista.iterator());
	}
	
	}



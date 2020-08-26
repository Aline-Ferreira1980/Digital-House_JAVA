package principal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import cardapio.Bolo;
import cardapio.Massa;
import cardapio.Sanduiche;
import cardapio.TiposMassa;

public class Principal {

	private static int op;

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		do {
			System.out.println("Escolha uma opção: ");
			System.out.println("[1]Sanduíches \n[2]Massas \n[3]Bolos \n[4]Sair");
			op =sc.nextInt();
			switch(op) {
			case 1: 
					menuSanduiche();
				break;
			case 2: 
					menuMassa();
				break;
			case 3: 
					bolo();
				break;
			case 4: 
				if (op == 4) {
					System.out.println("Obrigada pela preferencia e volte sempre...");
					
				}else {
					System.out.println("Escolha a opção desejada.");
				}
				break;
				
			default:
			}
			
		}while(op!= 4);
		
		

	}

	private static void bolo() {
		Scanner sc = new Scanner(System.in);
		List<String> sabores  = new ArrayList<>();
		String massa = null;
		String recheio = null;
		String cobertura = null;
		while(sabores.size() <= 3) {
			System.out.println("Digite sabor da massa: ");
			sabores.add(sc.nextLine());
			System.out.println("Digite sabor do recheio: ");
			sabores.add(sc.nextLine());
			System.out.println("Digite a cobertura: ");
			sabores.add(sc.nextLine());
			System.out.println("Confirma as escolhas? (s/n)");
			char c= sc.next().charAt(0);
			sc.nextLine();
			if(c== 's') {
				break;
			}
			
		}

		Bolo bolo = new Bolo(25.00, massa, recheio, cobertura);
		System.out.print("Qual a distância da lanchonete até sua casa: ");
		double distancia = sc.nextDouble();
		System.out.println("Preço: "+ bolo.getPreco() + " Tempo para entrega: "+ bolo.tempoTotal(distancia)+ " minutos.");
		
	}

	private static void menuMassa() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Escolha o tipo de massa: ");
		for (TiposMassa tipo : TiposMassa.values()) {
		      System.out.printf("Tipos de massa: \n1 " +  tipo.LASANGNA+ "\n2 " + tipo.MACARRAO + "\n3 " + tipo.PIZZA);
		      int escolha = sc.nextInt();
		      if (escolha == 1) {
		    	  System.out.println("Sua escolha foi "+ tipo.LASANGNA);
		    	  break;
		      }if(escolha == 2) {
		    	  System.out.println("Sua escolha foi " + tipo.MACARRAO);
		    	  break;
		      }if (escolha ==3) {
		    	  System.out.println("Sua escolha foi " + tipo.PIZZA);
		    	  break;
		      }else {
			    	System.out.println("Opção inválida, tente novamente.");
			    	break;
			    }
		  }
		Object tipo = null;
		String molho = null;
		Massa massa = new Massa(25.00, molho, (TiposMassa) tipo);
		System.out.print("Qual a distância da lanchonete até sua casa: ");
		double distancia = sc.nextDouble();
		System.out.println("Preço: "+ massa.getPreco() + " Tempo para entrega: "+ massa.tempoTotal(distancia)+ " minutos.");
	
	}

	private static void menuSanduiche() {
		Scanner sc = new Scanner (System.in);
		List<String> ingredientes  = new ArrayList<>();
		while(ingredientes.size() <= 10) {
			System.out.println("Digite um ingrediente: ");
			ingredientes.add(sc.nextLine());
			System.out.println("Deseja adicionar outro ingredient? (s/n)");
			char c= sc.next().charAt(0);
			sc.nextLine();
			if(c== 'n') {
				break;
			}
		}
		Sanduiche sanduiche = new Sanduiche(12.00, ingredientes);
		System.out.println("Qual a distância da lanchonete até sua casa: ");
		double distancia = sc.nextDouble();
		System.out.println("Preço: "+ sanduiche.getPreco() + " Tempo para entrega: "+ sanduiche.tempoTotal(distancia)+ " minutos.");
		
	}
}








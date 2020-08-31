package principal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Filho;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		List<Filho> familia = new ArrayList<>();
		 int op = 0;
		 String pai, mae, filho, filho1 = null, filho2 = null;
	
			System.out.println("Escolha uma opção: ");
			System.out.println("[1]Cadastrar Familia \n[2]Tem A Mesma Mãe \n[3]Tem o Mesmo Pai \n[4]São Meio Irmãos \n[5]Sair\n");
			op = sc.nextInt();
			sc.nextLine();
			while(true) {
			switch(op) {
			case 1: 
				System.out.println("Entrem com a família:\n");
				System.out.print("Digite o nome do pai: ");
				pai = sc.nextLine();
				if (pai.equals(" ")){
					break;
				}
				
				System.out.print("Digite o nome da mãe: ");
				mae = sc.nextLine();
				
				System.out.print("Digite o nome do filho: ");
				filho = sc.nextLine();
				
				familia.add(new Filho(pai, mae, filho));
				
				System.out.println("\n"+familia+"\n");
				break;
				
			case 2: 
				temOMesmoPai(filho1, filho2);
				break;
			case 3: 
				temAMesmaMae(filho1, filho2);
				break;
			case 4: 
				saoMeioIrmaos(filho1, filho2);
				break;
			case 5: 
				if (op == 5) {
					System.out.println("Obrigado(a) pela consulta");
					break;
				}else {
					System.out.println("Escolha a opção desejada.");
					break;
				}
				
				
			default:
			}
		}
	}

	private static Object saoMeioIrmaos(String filho1, String filho2) {
		if (temAMesmaMae(filho1,filho2)!= temOMesmoPai(filho1, filho2)) {
			
		}
		return "São meio irmãos";
		
	}

	private static Object temAMesmaMae(String filho1, String filho2) {
		Object mae = null;
		if (filho1.equals(mae)&& (filho2.equals(mae))) {
			System.out.println("Filhos tem a mesma mãe!");
		}
		return temAMesmaMae(filho1, filho2);
	}

	private static Object temOMesmoPai(String filho1, String filho2) {
		Object pai = null;
		if (filho1.equals(pai)&& (filho2.equals(pai))) {
			System.out.println ("Filhos tem o mesmo pai");
		}
		return temOMesmoPai(filho1, filho2);
		
	}
	
	}
	
package principal;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import agenda.Contato;
import agenda.Endereco;


public class Main {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);

		List<Contato> agenda = new ArrayList<>();
		int id = 0, idade = 0, numero = 0;
		String nome = null, telefone = null, rua = null,bairro = null, cidade = null, estado = null;
		
		Integer segue;
		do {
			System.out.printf("**** Menu Principal *****\n");
			System.out.printf("[ 1 ] Incluir Contato\n");
			System.out.printf("[ 2 ] Excluir Contato\n");
			System.out.printf("[ 3 ] Listar Contatos\n");
			System.out.printf("[ 4 ] Pesquisar Contato\n");
			System.out.printf("[ 0 ] Encerrar o Programa\n");
			System.out.printf("\nOpção Desejada: ");
			
			Integer opcao = sc.nextInt();
			
			segue = opcao;
			
			switch (opcao) {
			case 1: 
				do {
					System.out.print("Digite ID: ");
					id = sc.nextInt();
					if (id < 0) {
						break;
					}
					sc.nextLine();
					System.out.print("Digite o nome: ");
					nome = sc.nextLine();
					System.out.print("Digite o idade: ");
					idade = sc.nextInt();
					System.out.print("Digite o telefone: ");
					telefone = sc.nextLine();
					sc.nextLine();
					System.out.print("Digite o rua: ");
					rua = sc.nextLine();
					System.out.print("Digite o numero: ");
					numero = sc.nextInt();
					sc.nextLine();
					System.out.print("Digite o bairro: ");
					bairro = sc.nextLine();
					System.out.print("Digite o cidade: ");
					cidade = sc.nextLine();
					System.out.print("Digite o estado: ");
					estado = sc.nextLine();
					
					
					agenda.add(new Contato(id, nome, idade, telefone, 
							new Endereco(rua, numero, bairro, cidade, estado)));
					
				}while(true) ;
				
				for (Contato in: agenda) {
					System.out.println(in);
				}
			case 2:
				System.out.printf("Digite o id do contato: ");
				Integer idRemove = sc.nextInt();
				if (!agenda.stream().anyMatch(contato -> contato.getId() == idRemove)) {
					System.out.println("Contato não encontrado!");
				} else {
					for (int i = 0; i < agenda.size(); i++) {
						if (agenda.get(i).getId() == idRemove) {
							
							agenda.remove(i);
						}
					}
				}
				break;
				
			case 3:
				if (agenda.size() == 0) {
					System.out.println("Não há contatos na sua lista!");
					System.out.println("");
					
				} else {
					System.out.println(agenda);	
				}
				
				break;
				
			case 4:
				System.out.printf("Digite o id do contato: ");
				Integer idSearch = sc.nextInt();
				if (!agenda.stream().anyMatch(contato -> contato.getId() == idSearch)) {
					System.out.println("Contato não encontrado!");
				} else {
					for (Contato c: agenda) {
						if (c.getId() == idSearch) {
							System.out.println(c);
						}
					}
				}
				break;
			
			case 0:
				System.out.println("Obrigado por utilizar o nossos serviços!");
				break;
			}
			
		} while(segue != 0);
		
		sc.close();
				
			}		
}
		
	



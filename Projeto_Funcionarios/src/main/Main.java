package main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import entities.Funcionario;
import entities.PessoaFisica;




public class Main {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		List<Funcionario> lista = new ArrayList<>();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date data = new Date();
		
		
		String cpf = null, cnpj;
		int numberWorkCard = 0;
		
		
		System.out.println("--- Dados do funcionario ---");
		System.out.print("Nome: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Identificação: ");
		String identificacao = sc.nextLine();
		if (identificacao.equals("Pessoa Fisica")) {
			 System.out.print("Digite o CPF  do funcionário:");
			 cpf= sc.nextLine();
			 System.out.print("Digite o número da carteira de trabalho:");
			 numberWorkCard = sc.nextInt();
			 sc.nextLine();
		}
		else {
			System.out.print("Digite seu CNPJ");
			cnpj = sc.nextLine();
		}
		System.out.print("Address: ");
		String address = sc.nextLine();
		System.out.print("Sector: ");
		String sector = sc.nextLine();
		System.out.print("Data de admissão: ");
		Date admissionDate = sdf.parse(sc.nextLine());
		System.out.print("Data de demissão: ");
		Date resignateDate= sdf.parse(sc.nextLine());
		System.out.print("Salario Base: ");
		double baseSalary = sc.nextDouble();
		
		lista.add(new PessoaFisica(name, email, identificacao, address, sector, admissionDate, resignateDate, baseSalary,cpf, numberWorkCard));
		
		
		System.out.println(lista);
		
		
	sc.close();
	}

}

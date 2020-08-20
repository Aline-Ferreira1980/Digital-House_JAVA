package main;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import entities.Funcionario;
import entities.PessoaFisica;




public class Main {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Funcionario> lista = new ArrayList();
		
		String name = null, email = null, identificacao = null, address = null, sector = null, cpf= null, cnpj = null;	
		Date admissionDate = null;
		Date resignateDate = null;
		Double baseSalary = 0.0;
		Integer numberWorkCard = 0;
		
		
		
		lista.add(new Funcionario(name, email, identificacao, address, sector, admissionDate, resignateDate, baseSalary));
		lista.add(new PessoaFisica());
		
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		Date admissionDate1 = new Date();
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy");
		Date demissao = new Date();
		
		
		System.out.println("--- Dados do funcionario ---");
		System.out.print("Nome: ");
		name = sc.nextLine();
		System.out.print("Email: ");
		email = sc.nextLine();
		System.out.print("Identificação: ");
		identificacao = sc.nextLine();
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
		address = sc.nextLine();
		System.out.print("Sector: ");
		sector = sc.nextLine();
//		System.out.print("Data de admissão: ");
//		admissionDate1.getDate();
//		System.out.print("Data de demissão: ");
//		resignateDate.getDate();
		System.out.print("Salario Base: ");
		baseSalary = sc.nextDouble();
		
		System.out.println(lista);
		
		
	sc.close();
	}

}

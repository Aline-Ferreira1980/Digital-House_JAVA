package funcionario;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Empregado funcionario1= new Empregado();
		
		System.out.println("Digite o nome do funcion�rio: ");
		funcionario1.nome= sc.next();
		System.out.println("Digite o sal�rio do funcion�rio: ");
		funcionario1.salarioBruto= sc.nextDouble();
		System.out.println("Digite o imposto do funcion�rio: ");
		funcionario1.imposto = sc.nextDouble();
		
		System.out.println("Nome: "+funcionario1.nome+ " Sal�rio bruto: R$"+ funcionario1.salarioBruto + "\nImposto: R$"+ funcionario1.imposto);
		
		System.out.println("Sal�rio Liquido: R$"+funcionario1.salario());
		double percentual = sc.nextDouble();
		System.out.println("Nome: "+ funcionario1.nome+ " Sal�rio atualizado: R$" +funcionario1.salarioComAcrescimo(percentual));
sc.close();
	}

}

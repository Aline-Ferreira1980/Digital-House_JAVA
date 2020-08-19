package funcionario;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Empregado funcionario1= new Empregado();
		
		System.out.println("Digite o nome do funcionário: ");
		funcionario1.nome= sc.next();
		System.out.println("Digite o salário do funcionário: ");
		funcionario1.salarioBruto= sc.nextDouble();
		System.out.println("Digite o imposto do funcionário: ");
		funcionario1.imposto = sc.nextDouble();
		
		System.out.println("Nome: "+funcionario1.nome+ " Salário bruto: R$"+ funcionario1.salarioBruto + "\nImposto: R$"+ funcionario1.imposto);
		
		System.out.println("Salário Liquido: R$"+funcionario1.salario());
		double percentual = sc.nextDouble();
		System.out.println("Nome: "+ funcionario1.nome+ " Salário atualizado: R$" +funcionario1.salarioComAcrescimo(percentual));
sc.close();
	}

}

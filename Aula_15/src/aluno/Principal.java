package aluno;

import java.util.Scanner;

import geometria.Circulo;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		Aluno alu1 = new Aluno();
		
		System.out.println("Digite o nome do aluno e suas notas:");
		alu1.nome=  sc.next();
		alu1.nota1= sc.nextDouble();
		alu1.nota2 = sc.nextDouble();
		alu1.nota3 = sc.nextDouble();
		
		
		System.out.println("Nota Final: "+ alu1.notaTotal() );
		System.out.println(alu1.passou());
		sc.close();
}

}

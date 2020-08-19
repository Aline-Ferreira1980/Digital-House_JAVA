package principal;

import java.util.Scanner;

import cotacao.CotacaoDolar;


public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Qual é o preço do dolar hoje: R$");
		double moeda = sc.nextDouble();
		System.out.print("Quanto de dolar você quer comprar? R$");
		double quantidade = sc.nextDouble();
		
		System.out.println(CotacaoDolar.conversorMoeda(moeda, quantidade));
	
		sc.close();
}

}

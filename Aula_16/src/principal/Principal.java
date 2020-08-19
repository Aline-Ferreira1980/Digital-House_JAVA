package principal;

import java.util.ArrayList;
import java.util.List;
//import java.util.Scanner;
import java.util.stream.Collectors;

import produto.Produto;

public class Principal {
	public static void main(String[] args) {
		List<Produto> lista = new ArrayList<>();
		
		lista.add( new Produto("TV", 900.00, 10) );		
		lista.add( new Produto("Microondas", 200.00, 100) );
		lista.add(new Produto ("Monitor", 500.0, 15));
		
		lista.stream().forEach(x -> System.out.println(x));	
		
		List<Produto> r = lista.stream()
				.filter(x -> x.getPreco() < 300)
				.collect(Collectors.toList());
		
		r.stream().forEach(x -> System.out.println(x));
		
	}
	}
//		
//		//Scanner sc = new Scanner(System.in);
//		
//		List<Produto> lista = new ArrayList();
//
//		
//		lista.add( new Produto("TV", 900.00, 10) );		
//		lista.add( new Produto("Microondas", 200.00, 100) );
//		
//		lista.stream().forEach(x -> System.out.println(x));	
//		
//		List<Produto> r = lista.stream()
//				.filter(x -> x.getPreco() < 300)
//				.collect(Collectors.toList());
//		
//		r.stream().forEach(x -> System.out.println(x));
////		for (int i=0; i< lista.size(); i++) {
////			System.out.println(lista.get(i));
////		}
////		double soma = 0.0;
////		for (Produto p: lista) {
////			soma = soma +p.getPreco();
////		}
////		System.out.println("Soma "+ soma);
//		sc.close();
//	}
//}
 


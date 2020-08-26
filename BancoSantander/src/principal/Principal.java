package principal;

import java.util.Scanner;

import conta.Cliente;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Cliente cliente = new Cliente();
		
		cliente.getId();
		System.out.println(cliente);
		sc.close();

	}

}

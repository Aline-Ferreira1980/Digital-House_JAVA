package Principal;

import java.util.ArrayList;
import java.util.List;

import entities.Animal;
import entities.Mamiferos;
import entities.Passaros;

public class Principal {

	public static void main(String[] args) {
		Animal animal = new Passaros("Passaro");
		//classe asbstract não pode ser instanciada por que é abstrato
		Animal animal3 = new Passaros();
		Animal animal4 = new Mamiferos();
		Mamiferos mamifero = new Mamiferos();
		Passaros passaro = new Passaros();
		
		List<Animal>lista1 = new ArrayList<>();
		lista1.add(animal3);
		lista1.add(animal4);
		lista1.add(mamifero);
		lista1.add(passaro);
		
		for (Animal a:lista1) {
			if (a instanceof Mamiferos) {
				System.out.println("É mamífero");//identificar em qual classe está inserido
			}
			if (a instanceof Passaros) {
				System.out.println("É pássaro");
			}
			
			//a.falar();
		}
	}

}

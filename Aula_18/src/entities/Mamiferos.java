package entities;

public class Mamiferos extends Animal {

	public Mamiferos() {
		super();
	}
	public Mamiferos(String nome) {
		super(nome);
	}
	public void beberLeite() {
		System.out.println("Bebendo leite");
	}
	@Override
	public void falar() {
		System.out.println("Mamífero falando");
	}
}


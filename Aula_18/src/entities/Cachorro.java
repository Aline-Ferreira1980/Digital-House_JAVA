package entities;

public class Cachorro extends Mamiferos{
	public Cachorro() {
		super();
	}
	
	public Cachorro(String nome) {
		super(nome);
	}
	@Override
	public void falar() {
		System.out.println("Estou latindo");
	}
}

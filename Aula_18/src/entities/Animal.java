package entities;

//classe asbstract n�o pode ser instanciada por que � abstrato
public class Animal implements Bicho {
	private String nome;
	
	public Animal () {
		
	}

	public Animal(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	public void falar() {
		System.out.println("Estou falando");
	}

	@Override
	public void crescer() {
		
		
	}

	@Override
	public Double beberLitrosDeAgua() {
		
		return 20.0;
	}
}

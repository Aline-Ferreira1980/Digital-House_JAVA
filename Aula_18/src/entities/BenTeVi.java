package entities;

public class BenTeVi extends Passaros {
	public BenTeVi() {
		super();
	}
	
	public BenTeVi(String nome) {
		super(nome);
	}
	@Override
	public void falar() {
		System.out.println("Piando...");
	}
}


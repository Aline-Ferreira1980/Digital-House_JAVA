package entities;

public class Filho {
	private String pai;
	private String mae;
	private String nome;
	
	public Filho() {
		
	}

	public Filho(String pai, String mae, String nome) {
		this.pai = pai;
		this.mae = mae;
		this.nome = nome;
	}

	public String getPai() {
		return pai;
	}

	public void setPai(String pai) {
		this.pai = pai;
	}

	public String getMae() {
		return mae;
	}

	public void setMae(String mae) {
		this.mae = mae;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	public boolean maeDe(Object filho) {
		if (maeDe(filho) == true) {
			System.out.println("É mãe de: "+ filho);
		}
		return false;
	}
	public boolean paiDe(Object filho) {
		if (maeDe(filho) == true) {
			System.out.println("É pai de: "+ filho);
		}
		return false;
	}
}

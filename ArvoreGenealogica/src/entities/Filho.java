package entities;

public class Filho {
	private String pai;
	private String mae;
	private String filho;
	
	public Filho() {
		
	}

	public Filho(String pai, String mae, String filho) {
		this.pai = pai;
		this.mae = mae;
		this.filho = filho;
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

	
	public String getFilho() {
		return filho;
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
//	public Object temOMesmoPai(Object filho1, Object filho2) {
//		if (filho1.equals(pai)&& (filho2.equals(pai))) {
//			return ("Filhos tem o mesmo pai");
//		}
//		return filho1;
//	}
//	public Object temAMesmaMae(Object filho1, Object filho2) {
//		if (filho1.equals(mae)&& (filho2.equals(mae))) {
//			return ("Filhos tem a mesma mãe!");
//		}
//		return filho1;
//	}
//	public Object saoMeioIrmaos(Object filho1 , Object filho2) {
//		if (filho.equals(temOMesmoPai(filho1, filho2))&& ! filho.equals(temAMesmaMae(filho1, filho2))|| !filho.equals(temOMesmoPai(filho1, filho2))&& filho.equals(temAMesmaMae(filho1, filho2))) {
//			
//		}
//		return "São meio irmãos";
//	}

	@Override
	public String toString() {
		return "Filho [pai= " + this.pai + ", mae= " + this.mae + ", filho= " + this.filho + "]";
	}

}
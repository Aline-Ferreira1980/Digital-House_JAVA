package animais;

public class Elefante extends Animal {
	private Integer tamanhoTromba;
	
	public Elefante() {
		super();
	}
	public Elefante(Integer quantidadePatas, String cor, String classificacao, Integer tamanhoTromba) {
		super(quantidadePatas, cor, classificacao);
		this.tamanhoTromba = tamanhoTromba;
	}

	public Integer getTamanhoTromba() {
		return tamanhoTromba;
	}

	public void setTamanhoTromba(Integer tamanhoTromba) {
		this.tamanhoTromba = tamanhoTromba;
	}
	
	
}

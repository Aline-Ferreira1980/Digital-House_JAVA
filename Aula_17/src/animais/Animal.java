package animais;

public class Animal {
	private Integer quantidadePatas;
	private String cor;
	private String classificacao;
	
	public Animal() {
		
	}

	public Animal(Integer quantidadePatas, String cor, String classificacao) {
		super();
		this.quantidadePatas = quantidadePatas;
		this.cor = cor;
		this.classificacao = classificacao;
	}

	public Integer getQuantidadePatas() {
		return quantidadePatas;
	}

	public void setQuantidadePatas(Integer quantidadePatas) {
		this.quantidadePatas = quantidadePatas;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getClassificacao() {
		return classificacao;
	}

	public void setClassificacao(String classificacao) {
		this.classificacao = classificacao;
	}

	@Override
	public String toString() {
		return "Animal [quantidadePatas=" + quantidadePatas + ", cor=" + cor + ", classificacao=" + classificacao + "]";
	}
	
}

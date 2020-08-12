package exercicio;

public class Produto {

	public String nome;
	public double preco;
	public int quantidade;
	
	public double totalValorEmEstoque() {
		return preco * quantidade;
		
		
	}
	public void addProdutos(int quantidade) {
		this.quantidade = this.quantidade + quantidade;
	
		
	}
	
	public void removerProdutos(int quantidade) {
		this.quantidade = this.quantidade -quantidade;
	}
}

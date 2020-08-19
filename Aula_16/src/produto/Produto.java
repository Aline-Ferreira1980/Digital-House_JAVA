package produto;

public class Produto {

	private String nome;
	private double preco;
	private	 int quantidade;
	
	
	public Produto (String nome, double preco, int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
		
		System.out.println(totalValorEmEstoque());
	}
	public Produto () {
		
	}
	public Produto(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}
	
	public  String getNome() {// pega o valor do nome;
		return nome;
	}
	public void setNome(String nome) { //Altera os nomes
		this.nome = nome;
	}
	
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public int getQuantidade() {
		return quantidade;
	}
//	public void setQuantidade(int quantidade) {
//		this.quantidade = quantidade; // garante a integridade de negocio, podendo alterar quantidade através do add e remover; 
//	}
	public double totalValorEmEstoque() {
		return preco * quantidade;
			
	}
	public void addProdutos(int quantidade) {
		this.quantidade = this.quantidade + quantidade;
	
	}
		
	public void removerProdutos(int quantidade) {
		this.quantidade = this.quantidade -quantidade;
	}
	public String toString() {
        return "Product name: " + nome + ", $" + String.format("%.2f", preco)  + ", " +  quantidade + " units | TOTAL:  $" + String.format("%.2f", totalValorEmEstoque());
    }
}


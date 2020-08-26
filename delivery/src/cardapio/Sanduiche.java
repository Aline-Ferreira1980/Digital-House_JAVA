package cardapio;


import java.util.List;

public class Sanduiche extends Lanche{
	private List<String> ingrediente;
	
	public Sanduiche() {
		super();
	}

	
	public Sanduiche(Double preco, List<String> ingrediente) {
		super(preco);
		this.ingrediente = ingrediente;
	}
	
	public List<String> getIngrediente() {
		return ingrediente;
	}



	public void setIngrediente(List<String> ingrediente) {
		this.ingrediente = ingrediente;
	}

	public double tempoTotal(double distancia) {
		return 15 + tempoEntrega(distancia);
	}
}

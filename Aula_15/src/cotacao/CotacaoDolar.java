package cotacao;

public class CotacaoDolar {

	public static final double taxa = 0.06;
	
	public static double conversorMoeda(double moeda, double quantidade) {
		
		return (moeda*quantidade)+(moeda * quantidade * taxa);
	}
	
}

package conta;

public class ContaPoupanca extends Conta{
	protected Double juros;

	public ContaPoupanca() {
		super();
	}

	public ContaPoupanca(Double saldo2, Double juros) {
		super(saldo2);
		this.juros = juros;
	}



	public Double getJuros() {
		return juros;
	}
	
	
	@Override
	public void sacar (double saque) {
		double limite = getSaldo() - saque ;
		if(limite >=0) {
			super.sacar(saque); // super está chamando a classe pai
		}else {
			System.out.println("Limite indisponível");
		}
	}
	
	public void recolherJuros() {
		double valor = getSaldo()*this.juros;
		super.depositar(valor);
	}

	@Override
	public String toString() {
		return "ContaPoupanca [Saldo: " + getSaldo() + "juros=" + juros + "]";
	}
	
}

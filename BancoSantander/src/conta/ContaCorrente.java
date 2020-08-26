package conta;

public class ContaCorrente extends Conta{
	private Double limiteChequeEspecial;
	
	public ContaCorrente() {
		super();
	}
	
	public ContaCorrente(Double limiteChequeEspecial) {
		super();
		this.limiteChequeEspecial = limiteChequeEspecial;
	}
	
	

	public Double getLimiteChequeEspecial() {
		return limiteChequeEspecial;
	}

	public void setLimiteChequeEspecial(Double limiteChequeEspecial) {
		this.limiteChequeEspecial = limiteChequeEspecial;
	}

	
	@Override
	public void sacar (double saque) {
		double limite = getSaldo() - saque ;
		if((limite + limiteChequeEspecial)>=0) {
			super.sacar(saque); // super está chamando a classe pai
			if (limite< 0) {
				limiteChequeEspecial = limiteChequeEspecial -limite;
			}
		}else {
			System.out.println("Limite indisponível");
		}
		}
	public void depositarCheque(Cheque cheque) {
		depositar(cheque.getValor());
	}
	
	
}

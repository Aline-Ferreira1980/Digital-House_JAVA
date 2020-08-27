package conta;

public abstract class Conta {
	private Double saldo;
	
	
	public Conta(Double saldo) {
	
	}
	public Conta() {
		
	}
	public Double getSaldo() {
		return saldo;
	
	}
	public void depositar(double deposito) {
		 saldo = saldo + deposito;
	}
	public void sacar (double saque) {
		saldo = saldo - saque;
	}
	
	public double consultar() {
		return saldo;
	}
	@Override
	public String toString() {
		return "Conta [saldo=" + saldo + "]";
	}
	
}

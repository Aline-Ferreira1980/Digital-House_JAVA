package entities;

import java.util.Date;

public class Gerente extends PessoaFisica{

	private Double increase = 12.0;
	
	public Gerente() {
		super();
	}

	public Gerente(String name, String email, String identificacao, String address, String sector, Date admissionDate,
			Date resignateDate, Double baseSalary, String cpf, Integer numberWorkCard, Double increase) {
		super(name, email, identificacao, address, sector, admissionDate, resignateDate, baseSalary, cpf,
				numberWorkCard);
		this.increase = increase;
	}

	public Double getIncrease() {
		return increase;
	}

	public void setIncrease(Double increase) {
		this.increase = increase;
	}

	@Override
	public String toString() {
		return "--------------\nSalario do Gerente [increase=" + increase + "]";
	}
	
		
	
}

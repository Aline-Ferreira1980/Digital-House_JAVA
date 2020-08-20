package entities;

import java.util.Date;

public class Supervisor extends PessoaFisica{
	private Double increase = 0.12;
	
	public Supervisor(){
		super();
	}

	public Supervisor(String name, String email, String identificacao, String address, String sector,
			Date admissionDate, Date resignateDate, Double baseSalary, String cpf, Integer numberWorkCard,
			Double increase) {
		super(name, email, identificacao, address, sector, admissionDate, resignateDate, baseSalary, cpf,
				numberWorkCard);
		this.increase = increase;
	}

	public Double getIncrease() {
		
		return this.getBaseSalary() * increase / 100 + this.getBaseSalary();
	}

	
	
}

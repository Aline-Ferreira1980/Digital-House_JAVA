package entities;

import java.util.Date;

public class PessoaFisica extends Funcionario {
	
	private String cpf;
	private Integer numberWorkCard;
	
	
	
	public PessoaFisica() {
		super();
	}

	public PessoaFisica(String name, String email, String identificacao, String address, String sector,
			Date admissionDate, Date resignateDate, Double baseSalary, String cpf, Integer numberWorkCard) {
		super(name, email, identificacao, address, sector, admissionDate, resignateDate, baseSalary);
		this.cpf = cpf;
		this.numberWorkCard = numberWorkCard;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Integer getNumberWorkCard() {
		return numberWorkCard;
	}

	public void setNumberWorkCard(Integer numberWorkCard) {
		this.numberWorkCard = numberWorkCard;
	}

	@Override
	public String toString() {
		return "PessoaFisica [cpf=" + cpf + ", numberWorkCard=" + numberWorkCard + "]";
	}
	

	
	

}

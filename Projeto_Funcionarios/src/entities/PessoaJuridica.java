package entities;

import java.util.Date;

public class PessoaJuridica extends Funcionario{

	private String cnpj;
	
	public PessoaJuridica() {
		super();
	}

	public PessoaJuridica(String name, String email, String identificacao, String address, String sector,
			Date admissionDate, Date resignateDate, Double baseSalary, String cnpj) {
		super(name, email, identificacao, address, sector, admissionDate, resignateDate, baseSalary);
		this.cnpj = cnpj;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	@Override
	public String toString() {
		return "PessoaJuridica [cnpj=" + cnpj + "]";
	}

	
	
}

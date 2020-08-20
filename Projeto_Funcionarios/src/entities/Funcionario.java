package entities;

import java.util.Date;

public class Funcionario {
	private String name;
	private String email;
	private String identificacao;
	private String address;
	private String sector;
	private Date admissionDate;
	private Date resignateDate;
	private Double baseSalary;
	
	


	public Funcionario() {
		
	}

	public Funcionario(String name, String email, String identificacao, String address, String sector, Date admissionDate,
			Date resignateDate, Double baseSalary) {
		
		this.name = name;
		this.email = email;
		this.identificacao = identificacao;
		this.address = address;
		this.sector = sector;
		this.admissionDate = admissionDate;
		this.resignateDate = resignateDate;
		this.baseSalary = baseSalary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getIdentificacao() {
		return identificacao;
	}

	public void setIdentificacao(String identificacao) {
		this.identificacao = identificacao;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getSector() {
		return sector;
	}

	public void setSector(String sector) {
		this.sector = sector;
	}

	public Date getAdmissionDate() {
		return admissionDate;
	}

	public void setAdmissionDate(Date admissionDate) {
		this.admissionDate = admissionDate;
	}

	public Date getResignateDate() {
		return resignateDate;
	}

	public void setResignateDate(Date resignateDate) {
		this.resignateDate = resignateDate;
	}

	public Double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}

	@Override
	public String toString() {
		return "Pessoa [name=" + name + ", email=" + email + ", identificacao=" + identificacao + ", address=" + address
				+ ", sector=" + sector + ", admissionDate=" + admissionDate + ", resignateDate=" + resignateDate
				+ ", baseSalary=" + baseSalary + "]";
	}
	
	
	
	
	
}

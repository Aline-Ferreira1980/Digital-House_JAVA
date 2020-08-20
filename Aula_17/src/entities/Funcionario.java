package entities;

import java.text.ParseException;
//import java.text.SimpleDateFormat;
//import java.util.Date;

public class Funcionario {
	private String name;
	private String identificacao;
	private String email;
	private String address;
	private String sector;
	private String admissionDate;
	private String resignateDate;
	private double salaryBase;


	public Funcionario() {
		
	}
	
	public Funcionario(String name, String identificacao, String email, String address, String sector, String admissionDate,
			String resignateDate, double salaryBase) {
		super();
		this.name = name;
		this.identificacao = identificacao;
		this.email = email;
		this.address = address;
		this.sector = sector;
		this.admissionDate = admissionDate;
		this.resignateDate = resignateDate;
		this.salaryBase = salaryBase;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIdentificacao() {
		return identificacao;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
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
	public String getAdmissionDate() throws ParseException {
	
		return admissionDate;
	}
	public String getResignateDate() throws ParseException {
		
		return resignateDate;
	}
	public double getSalaryBase() {
		
		return salaryBase;
	}
	public void setSalaryBase(double salaryBase) {
		this.salaryBase = salaryBase;
	}
	@Override
	public String toString() {
		return "Funcionario [Name=" + name + ", Identificacao=" + identificacao + ", Email=" + email + ", Address="
				+ address + ", Sector=" + sector + ", AdmissionDate=" + admissionDate + ", ResignateDate="
				+ resignateDate + ", SalaryBase=" + salaryBase + "]";
	}
	
	
}

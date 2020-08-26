package conta;

public class Cliente {
	private Integer id;
	private String sobrenome;
	private String rg;
	private String cpf;
	public Conta conta;
	
	
	public Cliente() {
		
	}


	

	public Cliente(Integer id, String sobrenome, String rg, String cpf, Conta conta) {
		this.id = id;
		this.sobrenome = sobrenome;
		this.rg = rg;
		this.cpf = cpf;
		this.conta = conta;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getSobrenome() {
		return sobrenome;
	}


	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}


	public String getRg() {
		return rg;
	}


	public void setRg(String rg) {
		this.rg = rg;
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public Conta getConta() {
		return conta;
	}

	public void setConta(Conta conta) {
		this.conta = conta;
	}




	@Override
	public String toString() {
		return "Cliente [id=" + id + ", sobrenome=" + sobrenome + ", rg=" + rg + ", cpf=" + cpf + ", conta=" + conta
				+ "]";
	}

	
}

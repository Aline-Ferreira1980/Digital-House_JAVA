package agenda;

public class Contato {
	private Integer id;
	private String nome;
	private Integer idade;
	private String telefone;
	private Endereco endereco;
	
	public Contato() {
		
	}

	public Contato(Integer id, String nome, Integer idade, String telefone, Endereco endereco) {
		super();
		this.id = id;
		this.nome = nome;
		this.idade = idade;
		this.telefone = telefone;
		this.endereco = endereco;
	}

	public Integer getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public Endereco getEndereco() {
		return endereco;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	
	
	@Override
	public String toString() {
		return "----------------\nContato [id=" + id + ", nome=" + nome + ", idade=" + idade + ", telefone=" + telefone + ", endereco="
				+ endereco + "]";
	}

	
	
	
}

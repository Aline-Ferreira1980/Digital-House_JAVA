package br.com.digitalhouse.exercicio.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "contato")
public class Contato {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Long id;
	
	@Column
	private String nome;
	
	@Column
	private String sobrenome;
	
	@Column(name= "data_nasc")
	private String dataNasc;
	
	@Column
	private String endereco;
	
	@Column
	private String email;
	
	public Contato() {
		
	}
	
	

	public Contato(Long id, String nome, String sobrenome, String dataNasc, String endereco, String email) {
		
		this.id = id;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.dataNasc = dataNasc;
		this.endereco = endereco;
		this.email = email;
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	
	public String getDataNasc() {
		return dataNasc;
	}



	public void setDataNasc(String dataNasc) {
		this.dataNasc = dataNasc;
	}



	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}



	@Override
	public String toString() {
		return "Contato [id=" + id + ", nome=" + nome + ", sobrenome=" + sobrenome + ", dataNasc=" + dataNasc
				+ ", endereco=" + endereco + ", email=" + email + "]";
	}

	
	
	
	
	
}

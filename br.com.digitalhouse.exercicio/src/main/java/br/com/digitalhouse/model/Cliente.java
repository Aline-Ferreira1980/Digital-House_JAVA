package br.com.digitalhouse.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
@Entity
@Table(name = "contato")
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column
	private String nome;
	
	@Column
	private String sobrenome;
	
	@DateTimeFormat(pattern="yyyy-mm-dd")
	@Column(name= "data_nasc")
	private String dataNasc;
	
	@Column
	private String cpf;
	
	@Column
	private String email;
	
	@Column
	private String rg;
	
	@OneToMany(mappedBy = "cliente", cascade= CascadeType.ALL)
	private List<Telefone> telefone;
	
	
	
	@Embedded
	private Endereco endereco;
	
}

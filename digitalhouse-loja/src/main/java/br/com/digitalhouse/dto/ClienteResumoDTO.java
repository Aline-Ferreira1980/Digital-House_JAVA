package br.com.digitalhouse.dto;

import br.com.digitalhouse.model.Endereco;
import lombok.Data;

@Data
public class ClienteResumoDTO {

	private long id;
	private String nome;
	private String sobrenome;
	private String email;
	private Endereco endereco;
	
	}

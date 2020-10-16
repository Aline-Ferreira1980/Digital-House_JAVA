package br.com.digitalhouse.dto;

import java.util.List;

import br.com.digitalhouse.model.Endereco;
import br.com.digitalhouse.model.Telefone;
import lombok.Data;

@Data
public class ClienteDTO {

	private Long id;
	private String nome;
	private String sobrenome;
	private List<Telefone>	telefones;
	private String cpf;
	private String rg;
	private String email;
	private Endereco endereco;
	private ImagemDTO foto;
}


	
//acessar o IAM via busca.
//fazer pasta do aws:
//	Usuarios
//	Marcar Acesso programático
//	Anexar políticas
//	-Criar política
//	S3
//	Gravação
//	- PutObject
//	- DeleteObject
//	Gerencimneto de Permissões
//	- PutObjectAcl
//	- PutObjectVersionAcl

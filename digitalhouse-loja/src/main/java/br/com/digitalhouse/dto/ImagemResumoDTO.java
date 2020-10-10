package br.com.digitalhouse.dto;

import java.net.URL;

import lombok.Data;

@Data
public class ImagemResumoDTO {

	private Long id;
	private String nomeArquivo;
	private String nomeArquivoCompleto;
	private String contentType;
	private Long tamanho;
	private URL url;
}

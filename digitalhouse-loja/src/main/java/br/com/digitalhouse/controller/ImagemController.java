package br.com.digitalhouse.controller;

import java.nio.file.Path;
import java.util.UUID;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/imagem")
public class ImagemController {
	
	@PostMapping
	public String salvarFoto(@RequestParam MultipartFile imagem) {
		
		String nomeArquivo = UUID.randomUUID().toString()
				+ "_" + imagem.getOriginalFilename();
		
		Path arquivoFoto = Path.of("C:/fotos", nomeArquivo);
		
		System.out.println(arquivoFoto);
		System.out.println(imagem.getContentType());
		
		try {
			imagem.transferTo(arquivoFoto);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		
		return arquivoFoto.toString();
	}
}
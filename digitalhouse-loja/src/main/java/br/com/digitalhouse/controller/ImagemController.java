package br.com.digitalhouse.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.digitalhouse.controller.openapi.ImagemControllerOpenApi;
import br.com.digitalhouse.dto.ImagemDTO;
import br.com.digitalhouse.request.ImagemRequest;
import br.com.digitalhouse.service.ImagemService;	
	@CrossOrigin
	@RestController
	@RequestMapping("/imagem")
	public class ImagemController implements ImagemControllerOpenApi {
		@Autowired
		private ImagemService service;
		
		@Override
		@GetMapping
		public List<ImagemDTO> listar(){
			return service.listar();
		}
		
		@Override
		@PostMapping
		public ImagemDTO salvarFoto(@Valid ImagemRequest imagem) {
			
			return service.salvar(imagem);
		}
		
		@Override
		@DeleteMapping ("/{id}")
		public ResponseEntity<ImagemDTO> excluir (@PathVariable Long id){
			try {
				service.excluir(id);
				return ResponseEntity.noContent().build();
			}catch (Exception e) {
				return ResponseEntity.notFound().build();
			}
		}
	}
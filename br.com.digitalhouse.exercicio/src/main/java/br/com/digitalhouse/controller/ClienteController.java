package br.com.digitalhouse.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.digitalhouse.exercicio.model.Cliente;
import br.com.digitalhouse.exercicio.model.Telefone;
import br.com.digitalhouse.service.ClienteService;

@CrossOrigin
@RestController
@RequestMapping ("/cliente")
public class ClienteController {

	@Autowired
	private ClienteService service;
	
	//POST - insert
	//PUT - Update
	//GET - select
	//Delete - Delete
	
	@PostMapping
	public void salvar(@RequestBody Cliente cliente) {
		service.salvar(cliente);
	}
	
	@GetMapping
	public List<Cliente> listar(){
		return service.listar();
	}
	
	@GetMapping("/{id}")
	public Optional<Cliente> buscar(@PathVariable Long id) {
		return service.buscar(id);
	}
	
//	@GetMapping("/sobrenome/{sobrenome}")
//	public List<Cliente> returnar(@PathVariable String sobrenome) {
//		
//	}
//	
	
	@GetMapping("/{id}/telefones")
	public List<Telefone> buscarTelefones(@PathVariable Long id) {
		return service.buscarTelefones(id);
	}
	
	@DeleteMapping("/{id}")
	public void excluir(@PathVariable Long id) {
		service.excluir(id);
	}
	
	@PutMapping("/{id}")
	public void atualizar(@PathVariable Long id, @RequestBody Cliente cliente) {
	service.atualizar(cliente, id);
		
}
}
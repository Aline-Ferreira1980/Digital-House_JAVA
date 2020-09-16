package br.com.digitalhouse.controller;

import java.util.List;

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

import br.com.digitalhouse.exercicio.model.Contato;
import br.com.digitalhouse.exercicio.repository.ContatoRepository;

@CrossOrigin
@RestController
@RequestMapping
public class ContatoController {

	@Autowired
	private ContatoRepository repository;
	
	//POST - insert
	//PUT - Update
	//GET - select
	//Delete - Delete
	
	@GetMapping
	public List<Contato> listar(){
		return repository.findAll();
	}
	
	@GetMapping("/{id}")
	public Contato buscar(@PathVariable Long id) {
		return repository.findById(id).orElse(null);
	}
	
	@PostMapping
	public void salvar(@RequestBody Contato contact) {
		repository.save(contact);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		
		repository.deleteById(id);
	}
	
	@PutMapping("/{id}")
	public void atualizar(@PathVariable Long id, @RequestBody Contato contact) {
		contact = repository.findById(id).get();
		
		contact.setNome(contact.getNome());
		contact.setSobrenome(contact.getSobrenome());
		contact.setDataNasc(contact.getDataNasc());
		contact.setEndereco(contact.getEndereco());
		contact.setEmail(contact.getEmail());
		
		repository.save(contact);
}
}
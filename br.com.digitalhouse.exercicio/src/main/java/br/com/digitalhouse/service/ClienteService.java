package br.com.digitalhouse.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.digitalhouse.exercicio.model.Cliente;
import br.com.digitalhouse.exercicio.model.Telefone;
import br.com.digitalhouse.exercicio.repository.ClienteRepository;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository repository;
	
	@Transactional
	public void salvar(Cliente cliente) {
		cliente.getTelefone().stream().
		forEach (telefone -> telefone.setCliente(cliente));
		
		//for(Telefone t : cliente.getTelefone())
//			
//				t.setCliente(cliente);
//			}
	
		repository.save(cliente);
	}

	@Transactional
	public void atualizar (Cliente cliente, Long id) {
		Cliente cl = repository.findById(id).get();
		
		cl.setNome(cliente.getNome());
		cl.setSobrenome(cliente.getSobrenome());
		cl.setDataNasc(cliente.getDataNasc());
		cl.setCpf(cliente.getCpf());
		cl.setRg(cliente.getRg());
		cl.setEmail(cliente.getEmail());
		cl.setTelefone(cliente.getTelefone());
		
		repository.save(cl);
		
		
	}
	public List<Cliente> listar() {
		
		return repository.findAll();
	}

	public Optional<Cliente> listar(Long id) {
		
		return repository.findById(id);
	}

	public Optional<Cliente> buscar(Long id) {
		
		return repository.findById(id);
	}
	
	public List<Telefone> buscarTelefones(Long id) {
		return repository.buscarTelefonesPorId(id);
	}

	@Transactional
	public void excluir(Long id) {
		repository.deleteById(id);
		
	}
	
}

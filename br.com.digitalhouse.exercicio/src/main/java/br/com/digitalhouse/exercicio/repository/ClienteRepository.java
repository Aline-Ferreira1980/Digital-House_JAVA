package br.com.digitalhouse.exercicio.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.digitalhouse.exercicio.model.Cliente;
import br.com.digitalhouse.exercicio.model.Telefone;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

	
	//vindo do JPA porém por boa pratica é bom colocar a anotação para fazer de a
//	@Query("from Cliente where sobrenome like :sobrenome%")
//	List<Cliente> findBySobrenome(String sobrenome);
//
//	
	@Query("select telefone from Cliente c where c.id = :id")
	List<Telefone> buscarTelefonesPorId(Long id);

	@Query("from Cliente where id like :id")
	List<Cliente> findAllById(Long id);
	

//	@Query("from Cliente where sobrenome like :sobrenome%")
//	List<Cliente> buscarPeloSobrenome(String sobrenome);
//	
	
}

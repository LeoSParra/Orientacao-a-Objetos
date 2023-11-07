package br.edu.fatecfranca.clientedb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.edu.fatecfranca.clientedb.model.entity.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{
	
	// Não fazemos nada
	// Herda os métodos de Crud já associados a classe Cliente
}

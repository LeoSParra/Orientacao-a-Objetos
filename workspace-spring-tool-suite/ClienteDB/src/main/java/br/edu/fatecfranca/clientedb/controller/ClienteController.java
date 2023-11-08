package br.edu.fatecfranca.clientedb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.fatecfranca.clientedb.model.dto.ClienteDto;
import br.edu.fatecfranca.clientedb.service.ClienteService;

@RestController // classe vai responder pelas requisições rest
@RequestMapping("/cliente") //o endpoint
public class ClienteController {

	@Autowired
	ClienteService servico;
	
	@GetMapping
	public List<ClienteDto> getCliente() {
		return servico.getCliente();
	}
	
	@GetMapping("/{cpf}")
	public ClienteDto getCliente(@PathVariable Long cpf) {
		ClienteDto cli = servico.getCliente(cpf);
		return cli;
	}
	
	@PostMapping
	public ClienteDto addCliente(@RequestBody ClienteDto clienteDto) {
		return servico.addCliente(clienteDto);
	}
	
	@DeleteMapping("/{cpf}")
	public String removeCliente(@PathVariable Long cpf) {
		return servico.removeCliente(cpf);
	}
	
	@PutMapping
	public ClienteDto uptadeCliente(@RequestBody ClienteDto clienteDto) {
		return servico.uptadeCliente(clienteDto);
	}
}

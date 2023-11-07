package br.edu.fatecfranca.clientedb.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import br.edu.fatecfranca.clientedb.model.dto.ClienteDto;
import br.edu.fatecfranca.clientedb.model.entity.Cliente;
import br.edu.fatecfranca.clientedb.repository.ClienteRepository;

@Service
public class ClienteService {
	
	// Criamos nossa injecao de dependencia que contem os métodos crud, esse objeto não exige o new
	@Autowired
	ClienteRepository injecao;
	
	@GetMapping
	public List<ClienteDto> getCliente() {
		List<Cliente> clientes = injecao.findAll();
		return converteListaClientesToListaDto(clientes);
	}
	
	@GetMapping("/{cpf}")
	public ClienteDto getCliente(@PathVariable Long cpf) {
		Optional<Cliente> optional = injecao.findById(cpf);
		if (optional.isPresent()) {
			return converteClienteToDto(optional.get());
		}
		return null;
	}
	
	@PostMapping
	public ClienteDto addCliente(@RequestBody ClienteDto clienteDto) {
		Cliente cliente = converteDtoToCliente(clienteDto);
		return converteClienteToDto(injecao.save(cliente));
	}
	
	
	public Cliente converteDtoToCliente(ClienteDto dto) {
		Cliente cliente = new Cliente();	
		cliente.setCpf(dto.getCpf());
		cliente.setDigital(dto.getDigital());
		cliente.setGenero(dto.getGenero());
		cliente.setIdade(dto.getIdade());
		cliente.setNome(dto.getNome());
		cliente.setTelefone(dto.getTelefone());
		return cliente;
	}
	
	
	public ClienteDto converteClienteToDto(Cliente cliente) {
		ClienteDto dto = new ClienteDto();
		dto.setCpf(cliente.getCpf());
		dto.setDigital(cliente.getDigital());
		dto.setGenero(cliente.getGenero());
		dto.setIdade(cliente.getIdade());
		dto.setNome(cliente.getNome());
		dto.setTelefone(cliente.getTelefone());
		return dto;
	}
	
	public List<ClienteDto> converteListaClientesToListaDto(List<Cliente> clientes){
		// cria uma lista de dtos
		List <ClienteDto> listaDto = new ArrayList<ClienteDto>();
		// para cada produto da lista
		for (int i=0; i<clientes.size(); i++) {
			// converte produto em dto e coloca na lista de dto
			listaDto.add(converteClienteToDto(clientes.get(i)));			
		}
		// retorna a lista de dto
		return listaDto;			
	}
}

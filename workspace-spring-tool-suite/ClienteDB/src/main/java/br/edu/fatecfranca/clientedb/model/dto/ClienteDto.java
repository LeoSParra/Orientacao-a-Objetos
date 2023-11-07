package br.edu.fatecfranca.clientedb.model.dto;

public class ClienteDto {

	private Long cpf;
	private String nome;
	private String genero;	
	private String telefone;	
	private String digital;
	private int idade;
		
	public ClienteDto() {
		
	}
	
	public ClienteDto(Long cpf, String nome, String genero, String telefone, String digital, int idade) {
		this.cpf = cpf;
		this.nome = nome;
		this.genero = genero;
		this.telefone = telefone;
		this.digital = digital;
		this.idade = idade;
	}

	public Long getCpf() {
		return cpf;
	}

	public void setCpf(Long cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getDigital() {
		return digital;
	}

	public void setDigital(String digital) {
		this.digital = digital;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
}

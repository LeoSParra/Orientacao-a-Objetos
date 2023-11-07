package br.edu.fatecfranca.clientedb.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity // entidade do banco
@Table(name = "cliente") // é uma tabela cliente
public class Cliente {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long cpf;
	
	@Column(name = "nome")
	private String nome;
	
	@Column(name = "genero")
	private String genero;
	
	@Column(name = "telefone")
	private String telefone;
	
	@Column(name = "digital")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String digital;
	
	@Column(name = "idade")
	private int idade;
	
	
	public Cliente() {
		
	}
	
	public Cliente(Long cpf, String nome, String genero, String telefone, String digital, int idade) {
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

	@Override
	public String toString() {
		return "Cliente [cpf=" + cpf + ", nome=" + nome + ", genero=" + genero + ", telefone=" + telefone + ", digital="
				+ digital + ", idade=" + idade + "]";
	}
}

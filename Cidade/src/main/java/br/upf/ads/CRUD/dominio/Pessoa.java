package br.upf.ads.CRUD.dominio;

import java.io.Serializable;
import java.lang.Long;
import java.lang.String;
import java.util.Date;
import javax.persistence.*;
import javax.validation.constraints.NotBlank;

import org.hibernate.validator.constraints.Length;

/**
 * Entity implementation class for Entity: Pessoa
 *
 */

@Entity

public abstract class Pessoa implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PessoaId")
	@SequenceGenerator(name = "PessoaId", sequenceName = "PessoaId", allocationSize = 1)
	private Long id;
	@Length(min = 1, max = 10, message = "a matricula deve ter entre {min} e {max} caracteres.")
	private String Matricula;
	@NotBlank(message = "Informar o nome da pessoa!")
	@Length(min = 2, max = 60, message = "o nome da pessoa deve ter entre {min} e {max} caracteres.")
	private String Nome;
	@NotBlank(message = "Informar o cpf da pessoa!")
	@Length(min = 14, max = 14, message = "o cpf da pessoa deve ter {min} caracteres.")
	@Column(unique = true)
	private String cpf;
	@NotBlank(message = "Informar o rg da pessoa!")
	@Length(min = 15, max = 15, message = "o rg da pessoa deve ter {min} caracteres.")
	private String rg;
	@NotBlank(message = "Informar o e-mail da pessoa!")
	@Length(min = 8, max = 100, message = "o e-mail da pessoa deve ter entre {min} e {max} caracteres.")
	@Column(unique = true)
	private String email;
	private String celular;
	private String outrasInformacoes;
	private Date dataInativacao;
	private static final long serialVersionUID = 1L;

	public Pessoa() {
		super();
	}   
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}   
	public String getMatricula() {
		return this.Matricula;
	}

	public void setMatricula(String Matricula) {
		this.Matricula = Matricula;
	}   
	public String getNome() {
		return this.Nome;
	}

	public void setNome(String Nome) {
		this.Nome = Nome;
	}   
	public String getCpf() {
		return this.cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}   
	public String getRg() {
		return this.rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}   
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}   
	public String getCelular() {
		return this.celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}   
	public String getOutrasInformacoes() {
		return this.outrasInformacoes;
	}

	public void setOutrasInformacoes(String outrasInformacoes) {
		this.outrasInformacoes = outrasInformacoes;
	}   
	public Date getDataInativacao() {
		return this.dataInativacao;
	}

	public void setDataInativacao(Date dataInativacao) {
		this.dataInativacao = dataInativacao;
	}
   
}

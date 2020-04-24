package br.upf.ads.CRUD.dominio;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.Long;
import java.lang.String;
import javax.persistence.*;
import javax.validation.constraints.NotBlank;

import org.hibernate.validator.constraints.Length;

/**
 * Entity implementation class for Entity: Disciplina
 *
 */
@Entity

public class Disciplina implements Serializable {

	   
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DisciplinaId")
	@SequenceGenerator(name = "DisciplinaId", sequenceName = "DisciplinaId", allocationSize = 1)
	private Long id;
	@NotBlank(message = "Informar o codigo da disciplina!")
	@Length(min = 1, max = 10, message = "o codigo da disciplina deve ter entre {min} e {max} caracteres.")
	@Column(unique = true)
	private String codigo;
	@NotBlank(message = "Informar o nome da disciplina!")
	@Length(min = 2, max = 80, message = "o nome da disciplina deve ter entre {min} e {max} caracteres.")
	@Column(unique = false)
	private String nome;
	@NotBlank(message = "Informar os creditos Praticos!")
	@Length(min = 0, max = 8, message = "os creditos praticos deve ter entre {min} e {max} caracteres.")
	private Integer creditosPraticos;
	@NotBlank(message = "Informar os creditos Teoricos!")
	@Length(min = 0, max = 8, message = "os creditos Teoricos deve ter entre {min} e {max} caracteres.")
	private Integer creditosTeoricos;
	@NotBlank(message = "Informar os creditos EAD!")
	@Length(min = 0, max = 8, message = "os creditos EAD deve ter entre {min} e {max} caracteres.")
	private Integer creditosEad;
	private static final long serialVersionUID = 1L;

	public Disciplina() {
		super();
	}   
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}   
	public String getCodigo() {
		return this.codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}   
	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}   
	public Integer getCreditosPraticos() {
		return this.creditosPraticos;
	}

	public void setCreditosPraticos(Integer creditosPraticos) {
		this.creditosPraticos = creditosPraticos;
	}   
	public Integer getCreditosTeoricos() {
		return this.creditosTeoricos;
	}

	public void setCreditosTeoricos(Integer creditosTeoricos) {
		this.creditosTeoricos = creditosTeoricos;
	}   
	public Integer getCreditosEad() {
		return this.creditosEad;
	}

	public void setCreditosEad(Integer creditosEad) {
		this.creditosEad = creditosEad;
	}
   
}

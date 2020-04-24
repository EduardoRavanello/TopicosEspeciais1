package br.upf.ads.CRUD.dominio;

import java.io.Serializable;
import java.lang.Long;
import java.lang.String;
import javax.persistence.*;
import javax.validation.constraints.NotBlank;

import org.hibernate.validator.constraints.Length;

/**
 * Entity implementation class for Entity: Curso
 *
 */
@Entity

public class Curso implements Serializable {

	   
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CursoId")
	@SequenceGenerator(name = "CursoId", sequenceName = "CursoId", allocationSize = 1)
	private Long id;
	@NotBlank(message = "Informar o codigo do curso!")
	@Length(min = 2, max = 10, message = "o codigo do curso deve ter entre {min} e {max} caracteres.")
	@Column(unique = true)
	private String codigo;
	@NotBlank(message = "Informar o nome do curso!")
	@Length(min = 2, max = 80, message = "o nome do curso deve ter entre {min} e {max} caracteres.")
	private String nome;
	private static final long serialVersionUID = 1L;

	public Curso() {
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
   
}

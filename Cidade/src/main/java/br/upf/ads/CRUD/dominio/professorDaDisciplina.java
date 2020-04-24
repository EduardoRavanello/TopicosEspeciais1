package br.upf.ads.CRUD.dominio;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.Long;
import javax.persistence.*;
import javax.validation.constraints.NotBlank;

import org.hibernate.validator.constraints.Length;

/**
 * Entity implementation class for Entity: professorDaDisciplina
 *
 */
@Entity

public class professorDaDisciplina implements Serializable {

	   
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ProfessorDisciplinaId")
	@SequenceGenerator(name = "ProfessorDisciplinaId", sequenceName = "ProfessorDisciplinaId", allocationSize = 1)
	private Long id;
	@NotBlank(message = "Informar a prioridade!")
	@Length(min = 0, max = 10, message = "a prioridade deve ter entre {min} e {max} caracteres.")
	private Integer prioridade;
	private static final long serialVersionUID = 1L;

	public professorDaDisciplina() {
		super();
	}   
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}   
	public Integer getPrioridade() {
		return this.prioridade;
	}

	public void setPrioridade(Integer prioridade) {
		this.prioridade = prioridade;
	}
   
}

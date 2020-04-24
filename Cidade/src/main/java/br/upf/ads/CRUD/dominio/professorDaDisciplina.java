package br.upf.ads.CRUD.dominio;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.Long;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: professorDaDisciplina
 *
 */
@Entity

public class professorDaDisciplina implements Serializable {

	   
	@Id
	private Long id;
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

package br.upf.ads.CRUD.dominio;

import java.io.Serializable;
import java.lang.Long;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Nivel
 *
 */
@Entity

public class Nivel implements Serializable {

	   
	@Id
	private Long id;
	private String descricao;
	private static final long serialVersionUID = 1L;

	public Nivel() {
		super();
	}   
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}   
	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
   
}

package br.upf.ads.CRUD.dominio;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.Long;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: disciplinaSemestre
 *
 */
@Entity

public class disciplinaSemestre implements Serializable {

	   
	@Id
	private Long id;
	private String grupo;
	private Integer distribuidosEad;
	private Integer distribuidosPraticos;
	private Integer distribuidosTeoricos;
	private static final long serialVersionUID = 1L;

	public disciplinaSemestre() {
		super();
	}   
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}   
	public String getGrupo() {
		return this.grupo;
	}

	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}   
	public Integer getDistribuidosEad() {
		return this.distribuidosEad;
	}

	public void setDistribuidosEad(Integer distribuidosEad) {
		this.distribuidosEad = distribuidosEad;
	}   
	public Integer getDistribuidosPraticos() {
		return this.distribuidosPraticos;
	}

	public void setDistribuidosPraticos(Integer distribuidosPraticos) {
		this.distribuidosPraticos = distribuidosPraticos;
	}   
	public Integer getDistribuidosTeoricos() {
		return this.distribuidosTeoricos;
	}

	public void setDistribuidosTeoricos(Integer distribuidosTeoricos) {
		this.distribuidosTeoricos = distribuidosTeoricos;
	}
   
}

package br.upf.ads.CRUD.dominio;

import br.upf.ads.CRUD.dominio.Pessoa;
import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Professor
 *
 */
@MappedSuperclass

public class Professor extends Pessoa implements Serializable {

	
	private String Titulacao;
	private static final long serialVersionUID = 1L;

	public Professor() {
		super();
	}   
	public String getTitulacao() {
		return this.Titulacao;
	}

	public void setTitulacao(String Titulacao) {
		this.Titulacao = Titulacao;
	}
   
}

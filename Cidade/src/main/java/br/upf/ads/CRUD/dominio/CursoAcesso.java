package br.upf.ads.CRUD.dominio;

import java.io.Serializable;
import java.lang.Long;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: CursoAcesso
 *
 */
@Entity

public class CursoAcesso implements Serializable {

	   
	@Id
	private Long id;
	private String senha;
	private boolean administrador;
	private static final long serialVersionUID = 1L;

	public CursoAcesso() {
		super();
	}   
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}   
	public String getSenha() {
		return this.senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}   
	public boolean getAdministrador() {
		return this.administrador;
	}

	public void setAdministrador(boolean administrador) {
		this.administrador = administrador;
	}
   
}

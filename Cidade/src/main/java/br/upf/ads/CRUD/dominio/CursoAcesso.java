package br.upf.ads.CRUD.dominio;

import java.io.Serializable;
import java.lang.Long;
import java.lang.String;
import javax.persistence.*;
import javax.validation.constraints.NotBlank;

import org.hibernate.validator.constraints.Length;

/**
 * Entity implementation class for Entity: CursoAcesso
 *
 */
@Entity

public class CursoAcesso implements Serializable {

	   
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CursoAcessoId")
	@SequenceGenerator(name = "CursoAcessoId", sequenceName = "CursoAcessoId", allocationSize = 1)
	private Long id;
	@NotBlank(message = "Informar a senha de acesso!")
	@Length(min = 6, max = 20, message = "a senha de acesso deve ter entre {min} e {max} caracteres.")
	private String senha;
	@NotBlank(message = "Informar se é administrador!")
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

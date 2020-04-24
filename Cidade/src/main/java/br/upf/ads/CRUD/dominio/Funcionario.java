package br.upf.ads.CRUD.dominio;

import br.upf.ads.CRUD.dominio.Pessoa;
import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;
import javax.validation.constraints.NotBlank;

import org.hibernate.validator.constraints.Length;

/**
 * Entity implementation class for Entity: Funcionario
 *
 */
@MappedSuperclass

public class Funcionario extends Pessoa implements Serializable {

	@NotBlank(message = "Informar a função!")
	@Length(min = 1, max = 80, message = "a função da pessoa deve ter entre {min} e {max} caracteres.")
	private String funcao;
	private Pessoa Pessoa;
	private static final long serialVersionUID = 1L;

	public Funcionario() {
		super();
	}   
	public String getFuncao() {
		return this.funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}   
	public Pessoa getPessoa() {
		return this.Pessoa;
	}

	public void setPessoa(Pessoa Pessoa) {
		this.Pessoa = Pessoa;
	}
   
}

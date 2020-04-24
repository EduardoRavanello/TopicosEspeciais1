package br.upf.ads.CRUD.dominio;

import java.io.Serializable;
import java.lang.Long;
import java.lang.String;
import javax.persistence.*;
import javax.validation.constraints.NotBlank;

import org.hibernate.validator.constraints.Length;

/**
 * Entity implementation class for Entity: Nivel
 *
 */
@Entity

public class Nivel implements Serializable {

	   
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "NivelId")
	@SequenceGenerator(name = "NivelId", sequenceName = "NivelId", allocationSize = 1)
	private Long id;
	@NotBlank(message = "Informar a descrição do nível!")
	@Length(min = 1, max = 4, message = "a descrição do nível deve ter entre {min} e {max} caracteres.")
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

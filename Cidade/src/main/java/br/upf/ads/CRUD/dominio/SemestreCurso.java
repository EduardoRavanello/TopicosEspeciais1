package br.upf.ads.CRUD.dominio;

import java.io.Serializable;
import java.lang.Long;
import java.util.Date;
import javax.persistence.*;
import javax.validation.constraints.NotBlank;

/**
 * Entity implementation class for Entity: SemestreCurso
 *
 */
@Entity

public class SemestreCurso implements Serializable {

	   
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SemestreCursoId")
	@SequenceGenerator(name = "SemestreCursoId", sequenceName = "SemestreCursoId", allocationSize = 1)
	private Long id;
	@NotBlank(message = "Informar a data de inicio!")
	private Date dataInicio;
	@NotBlank(message = "Informar a data de fim!")
	private Date dataFim;
	private static final long serialVersionUID = 1L;

	public SemestreCurso() {
		super();
	}   
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}   
	public Date getDataInicio() {
		return this.dataInicio;
	}

	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}   
	public Date getDataFim() {
		return this.dataFim;
	}

	public void setDataFim(Date dataFim) {
		this.dataFim = dataFim;
	}
   
}

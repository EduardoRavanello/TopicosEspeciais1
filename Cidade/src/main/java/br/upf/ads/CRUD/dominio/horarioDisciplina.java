package br.upf.ads.CRUD.dominio;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.Long;
import java.lang.String;
import java.util.Date;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: horarioDisciplina
 *
 */
@Entity

public class horarioDisciplina implements Serializable {

	   
	@Id
	private Long id;
	private String diaDaSemana;
	private String periodo;
	private Date horaInicio;
	private Date horaFim;
	private Integer creditosEad;
	private Integer creditosPraticos;
	private Integer creditosTeoricos;
	private static final long serialVersionUID = 1L;

	public horarioDisciplina() {
		super();
	}   
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}   
	public String getDiaDaSemana() {
		return this.diaDaSemana;
	}

	public void setDiaDaSemana(String diaDaSemana) {
		this.diaDaSemana = diaDaSemana;
	}   
	public String getPeriodo() {
		return this.periodo;
	}

	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}   
	public Date getHoraInicio() {
		return this.horaInicio;
	}

	public void setHoraInicio(Date horaInicio) {
		this.horaInicio = horaInicio;
	}   
	public Date getHoraFim() {
		return this.horaFim;
	}

	public void setHoraFim(Date horaFim) {
		this.horaFim = horaFim;
	}   
	public Integer getCreditosEad() {
		return this.creditosEad;
	}

	public void setCreditosEad(Integer creditosEad) {
		this.creditosEad = creditosEad;
	}   
	public Integer getCreditosPraticos() {
		return this.creditosPraticos;
	}

	public void setCreditosPraticos(Integer creditosPraticos) {
		this.creditosPraticos = creditosPraticos;
	}   
	public Integer getCreditosTeoricos() {
		return this.creditosTeoricos;
	}

	public void setCreditosTeoricos(Integer creditosTeoricos) {
		this.creditosTeoricos = creditosTeoricos;
	}
   
}

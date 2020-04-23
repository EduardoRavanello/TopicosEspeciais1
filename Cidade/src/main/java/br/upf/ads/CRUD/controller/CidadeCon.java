package br.upf.ads.CRUD.controller;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.persistence.EntityManager;

import br.upf.ads.CRUD.dominio.Cidade;
import br.upf.ads.CRUD.jpa.JPAUTIL;
import br.upf.ads.CRUD.jpa.JSFUTIL;
@ManagedBean
@ViewScoped
public class CidadeCon implements Serializable{
	private Boolean editando;
	private List<Cidade> lista;
	private Cidade selecionado;
	
	public CidadeCon() {
		editando = false;
	}
	

	public void carregarLista() {
		EntityManager em = JPAUTIL.getEntityManager();
		lista = em.createQuery("from Cidade").getResultList();
		em.close();
	}
	
	public void incluir() {
		editando = true;
		selecionado = new Cidade();
	}
	
	public void alterar() {
		editando = true;
	}
	
	public void salvar() {
		try {
			editando = false;
			EntityManager em = JPAUTIL.getEntityManager();
			em.getTransaction().begin();
			em.merge(selecionado);
			em.getTransaction().commit();
			em.close();
			carregarLista();
		} catch (Exception e) {
			e.printStackTrace();
			JSFUTIL.messagemDeErro("Ocorreu um erro ao salvar os dados.");
		}
	}
	
	public void excluir() {
		try {
			editando = false;
			EntityManager em = JPAUTIL.getEntityManager();
			em.getTransaction().begin();
			em.remove(selecionado);
			em.getTransaction().commit();
			em.close();
			carregarLista();
		} catch (Exception e) {
			e.printStackTrace();
			JSFUTIL.messagemDeErro("Ocorreu um erro ao excluir os dados.");
		}
	}
	
	public void cancelar() {
		editando =  false;
		selecionado = null;
	}


	public Boolean getEditando() {
		return editando;
	}


	public void setEditando(Boolean editando) {
		this.editando = editando;
	}


	public List<Cidade> getLista() {
		return lista;
	}


	public void setLista(List<Cidade> lista) {
		this.lista = lista;
	}


	public Cidade getSelecionado() {
		return selecionado;
	}


	public void setSelecionado(Cidade selecionado) {
		this.selecionado = selecionado;
	}
}

package br.upf.ads.CRUD.jpa;

import javax.persistence.Persistence;

public class teste {
	
	public teste(){
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persistence.createEntityManagerFactory("Cidade");

	}
}

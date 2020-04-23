package br.upf.ads.CRUD.jpa;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

public class JSFUTIL {
	public static void messagemDeErro(String mensagem) {
		FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_ERROR, mensagem, "");
		FacesContext.getCurrentInstance().addMessage(null, msg);
	}

}

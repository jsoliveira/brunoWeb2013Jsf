package br.integrado.jsf.bean;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class MenuBean {

    public String toUsuario () {
        return "index?faces-redirect=true"; 
    }
    
    public String toCidade () {
        return "cidade?faces-redirect=true";
    }

    public String toUf () {
        return "unidadeFederativa?faces-redirect=true";
    }
    
}

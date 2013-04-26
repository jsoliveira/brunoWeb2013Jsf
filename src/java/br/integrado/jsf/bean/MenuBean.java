package br.integrado.jsf.bean;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class MenuBean {

    private static final String cmd = "?faces-redirect=true";
    
    public String toUsuario () {
        return "index" + cmd; 
    }
    
    public String toCidade () {
        return "cidade" + cmd; 
    }

    public String toUf () {
        return "unidadeFederativa" + cmd; 
    }
    
    public String toCategoria () {
        return "categoria" + cmd; 
    }
    
    public String toProduto () {
        return "produto" + cmd; 
    }
    
    public String toAluno () {
        return "aluno" + cmd; 
    }
    
    public String toTurma () {
        return "turma" + cmd; 
    }
    
    public String toTela () {
        return "tela" + cmd; 
    }
    
    public String toUsuarioTela () {
        return "usuarioTela" + cmd; 
    }
}

package br.integrado.jsf.model;

import java.io.Serializable;

public class UsuarioTelaPK implements Serializable {
    
    private Long usuario;
    private Long tela;

    public UsuarioTelaPK() {
    }

    public Long getUsuario() {
        return usuario;
    }

    public void setUsuario(Long usuario) {
        this.usuario = usuario;
    }

    public Long getTela() {
        return tela;
    }

    public void setTela(Long tela) {
        this.tela = tela;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + (this.usuario != null ? this.usuario.hashCode() : 0);
        hash = 29 * hash + (this.tela != null ? this.tela.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final UsuarioTelaPK other = (UsuarioTelaPK) obj;
        if (this.usuario != other.usuario && (this.usuario == null || !this.usuario.equals(other.usuario))) {
            return false;
        }
        if (this.tela != other.tela && (this.tela == null || !this.tela.equals(other.tela))) {
            return false;
        }
        return true;
    }

    
}

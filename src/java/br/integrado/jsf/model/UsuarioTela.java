package br.integrado.jsf.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_usuarioTela")
@IdClass(UsuarioTelaPK.class)
public class UsuarioTela implements Serializable {
    
    @Id
    @OneToOne
    @JoinColumn(name = "usuarioId")
    private Usuario usuario;
    
    @Id
    @OneToOne
    @JoinColumn(name = "telaId")
    private Tela tela;
    
    private Boolean inserir;
    private Boolean alterar;
    private Boolean remover;
    private Boolean listar;

    public UsuarioTela() {
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Tela getTela() {
        return tela;
    }

    public void setTela(Tela tela) {
        this.tela = tela;
    }
    
    public Boolean getInserir() {
        return inserir;
    }

    public void setInserir(Boolean inserir) {
        this.inserir = inserir;
    }

    public Boolean getAlterar() {
        return alterar;
    }

    public void setAlterar(Boolean alterar) {
        this.alterar = alterar;
    }

    public Boolean getRemover() {
        return remover;
    }

    public void setRemover(Boolean remover) {
        this.remover = remover;
    }

    public Boolean getListar() {
        return listar;
    }

    public void setListar(Boolean listar) {
        this.listar = listar;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + (this.usuario != null ? this.usuario.hashCode() : 0);
        hash = 37 * hash + (this.tela != null ? this.tela.hashCode() : 0);
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
        final UsuarioTela other = (UsuarioTela) obj;
        if (this.usuario != other.usuario && (this.usuario == null || !this.usuario.equals(other.usuario))) {
            return false;
        }
        if (this.tela != other.tela && (this.tela == null || !this.tela.equals(other.tela))) {
            return false;
        }
        return true;
    }
}

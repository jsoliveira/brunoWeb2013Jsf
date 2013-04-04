package br.integrado.jsf.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="tb_usuario")
public class Usuario implements Serializable {

    @Id
    @GeneratedValue
    private Long codigo;
    
    @NotNull(message="O campo Nome é obrigatório")
    private String nome;
    
    @NotNull(message="O campo Usuario é obrigatório")
    private String usuario;
    
    @NotNull(message="O campo Senha é obrigatório")
    @Size(min=5, max=9)
    private String senha;
    
    @NotNull(message="O campo Nascimento é obrigatório")
    @Temporal(TemporalType.DATE)
    private Date nascimento;

    public Usuario() {
    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public Date getNascimento() {
        return nascimento;
    }

    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    
    
    
}

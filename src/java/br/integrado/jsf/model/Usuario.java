package br.integrado.jsf.model;

import br.com.caelum.stella.bean.validation.CPF;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.hibernate.validator.constraints.Email;

@Entity
@Table(name="tb_usuario")
public class Usuario implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long codigo;
    
    @NotNull(message="O campo Nome é obrigatório")
    private String nome;
    
    @NotNull(message="O campo Usuario é obrigatório")
    private String usuario;
    
    @NotNull(message="O campo Senha é obrigatório")
    @Size(min=5, max=9)
    private String senha;
    
    @Email(message="E-Mail Inválido")
    @NotNull(message="O campo E-Mail é obrigatório")
    private String email;
    
    @CPF(formatted=true, message="CPF inválido")
    @NotNull(message="O campo CPF é obrigatório")
    private String cpf;
    
    @NotNull(message="O campo Nascimento é obrigatório")
    @Temporal(TemporalType.DATE)
    private Date nascimento;
    
    @Enumerated(EnumType.ORDINAL)
    private Estado estado = Estado.ATIVO;
    

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
    
}

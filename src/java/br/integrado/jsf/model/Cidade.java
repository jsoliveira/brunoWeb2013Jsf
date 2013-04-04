package br.integrado.jsf.model;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name="tb_cidade")
public class Cidade implements Serializable {
    
    @Id
    @GeneratedValue
    private Long codigo;
    
    @Column(length=50)
    private String nome;
    
    @ManyToOne
    private UnidadeFederativa uf;

    public Cidade() {
    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public UnidadeFederativa getUf() {
        return uf;
    }

    public void setUf(UnidadeFederativa uf) {
        this.uf = uf;
    }    
    
}

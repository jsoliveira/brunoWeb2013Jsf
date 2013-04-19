package br.integrado.jsf.model;

import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="tb_cidade")
public class Cidade implements Serializable {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long codigo;
    
    @NotNull(message = "Campo nome é obrigatório")
    @Column(length=50)
    private String nome;
    
    @NotNull(message = "Selecione uma UF")
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

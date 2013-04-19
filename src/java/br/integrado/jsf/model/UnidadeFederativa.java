package br.integrado.jsf.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;

@Entity
@Table(name="tb_uf")
public class UnidadeFederativa implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long codigo;
    
    @Column(length=2, unique=true)
    private String sigla;
    
    @Column(length=50)
    private String nome;
    
    @OneToMany(mappedBy = "uf")
    private List<Cidade> cidades;

    public UnidadeFederativa() {}

    public List<Cidade> getCidades() {
        return cidades;
    }

    public void setCidades(List<Cidade> cidades) {
        this.cidades = cidades;
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

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final UnidadeFederativa other = (UnidadeFederativa) obj;
        if (this.codigo != other.codigo && (this.codigo == null || !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 31 * hash + (this.codigo != null ? this.codigo.hashCode() : 0);
        return hash;
    }

}

package br.integrado.jsf.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="tb_turma")
public class Turma implements Serializable {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long idTurma;
    
    private String nome;
    
    @ManyToMany
    private List<Aluno> alunos = new ArrayList<Aluno>();

    public Long getIdTurma() {
        return idTurma;
    }

    public void setIdTurma(Long idTurma) {
        this.idTurma = idTurma;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + (this.idTurma != null ? this.idTurma.hashCode() : 0);
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
        final Turma other = (Turma) obj;
        if (this.idTurma != other.idTurma && (this.idTurma == null || !this.idTurma.equals(other.idTurma))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return getIdTurma() + " " + getNome();
    }   
}

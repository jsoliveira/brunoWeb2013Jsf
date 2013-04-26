package br.integrado.jsf.bean;

import br.integrado.jsf.dao.AlunoDao;
import br.integrado.jsf.dao.TurmaDao;
import br.integrado.jsf.model.Aluno;
import br.integrado.jsf.model.Turma;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ViewScoped
@ManagedBean
public class AlunoBean implements Serializable {

    private Aluno aluno = new Aluno();
    private AlunoDao aDao = new AlunoDao();
    
    private List<Aluno> alunos = new ArrayList<Aluno>();
    
    public void salvar () {
        aDao.save(aluno);
        limpar();
    }
    
    public void deletar () {
        aDao.delete(this.aluno);
        limpar();
    }
    
    public void limpar () {
        this.aluno = new Aluno();
        this.alunos = null;
        this.getAlunos();
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public List<Aluno> getAlunos() {
        this.alunos = (this.alunos == null || this.alunos.isEmpty()) ? aDao.findAll() : this.alunos;
        return alunos;
    }
}


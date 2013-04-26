package br.integrado.jsf.bean;

import br.integrado.jsf.dao.TurmaDao;
import br.integrado.jsf.model.Turma;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ViewScoped
@ManagedBean
public class TurmaBean implements Serializable {
    
    private Turma turma = new Turma();
    private TurmaDao tDao = new TurmaDao();
    
    private List<Turma> turmas = new ArrayList<Turma>();
    
    public void salvar () {
        tDao.save(turma);
        limpar();
    }
    
    public void deletar () {
        tDao.delete(turma);
        limpar();
    }
    
    public void limpar () {
        turma = new Turma();
        turmas = null;
        getTurmas();
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }
    
    public List<Turma> getTurmas() {
        turmas = (turmas == null || turmas.isEmpty()) ? tDao.findAll() : turmas;
        return turmas;
    }
}
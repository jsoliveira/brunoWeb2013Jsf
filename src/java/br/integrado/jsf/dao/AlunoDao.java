package br.integrado.jsf.dao;

import br.integrado.jsf.model.Aluno;
import java.io.Serializable;

public class AlunoDao extends GenericDao<Aluno> implements Serializable {

    public AlunoDao() { 
        setClazz(Aluno.class);
    }
    
}

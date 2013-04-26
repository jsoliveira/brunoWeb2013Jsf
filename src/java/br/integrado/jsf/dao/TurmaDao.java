package br.integrado.jsf.dao;

import br.integrado.jsf.model.Turma;
import java.io.Serializable;

public class TurmaDao extends GenericDao<Turma> implements Serializable {

    public TurmaDao() {
         setClazz(Turma.class);
    }
    
}

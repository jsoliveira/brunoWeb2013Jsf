package br.integrado.jsf.dao;

import br.integrado.jsf.model.Tela;
import java.io.Serializable;

public class TelaDao extends GenericDao<Tela> implements Serializable {

    public TelaDao() {
        setClazz(Tela.class);
    }
    
}

package br.integrado.jsf.dao;

import br.integrado.jsf.model.Cidade;

public class CidadeDao extends GenericDao<Cidade> {

    public CidadeDao() {
        setClazz(Cidade.class);
    }
    
}

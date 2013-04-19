package br.integrado.jsf.dao;

import br.integrado.jsf.model.Categoria;

public class CategoriaDao extends GenericDao<Categoria> {

    public CategoriaDao() {
        setClazz(Categoria.class);
    }
    
}

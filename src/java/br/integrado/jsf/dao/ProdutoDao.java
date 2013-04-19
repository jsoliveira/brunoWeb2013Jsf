package br.integrado.jsf.dao;

import br.integrado.jsf.model.Produto;

public class ProdutoDao extends GenericDao<Produto> {

    public ProdutoDao() {
        setClazz(Produto.class);
    }
    
}

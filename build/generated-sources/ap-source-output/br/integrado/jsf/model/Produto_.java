package br.integrado.jsf.model;

import br.integrado.jsf.model.Categoria;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.3.2.v20111125-r10461", date="2013-04-23T04:05:34")
@StaticMetamodel(Produto.class)
public class Produto_ { 

    public static volatile SingularAttribute<Produto, Long> id;
    public static volatile SingularAttribute<Produto, String> detalhes;
    public static volatile SingularAttribute<Produto, String> nome;
    public static volatile ListAttribute<Produto, Categoria> categorias;

}
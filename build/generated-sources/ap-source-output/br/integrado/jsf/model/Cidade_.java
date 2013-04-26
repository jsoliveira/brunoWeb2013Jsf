package br.integrado.jsf.model;

import br.integrado.jsf.model.UnidadeFederativa;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.3.2.v20111125-r10461", date="2013-04-23T04:05:34")
@StaticMetamodel(Cidade.class)
public class Cidade_ { 

    public static volatile SingularAttribute<Cidade, Long> codigo;
    public static volatile SingularAttribute<Cidade, UnidadeFederativa> uf;
    public static volatile SingularAttribute<Cidade, String> nome;

}
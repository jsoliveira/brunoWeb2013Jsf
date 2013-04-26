package br.integrado.jsf.model;

import br.integrado.jsf.model.Cidade;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.3.2.v20111125-r10461", date="2013-04-23T04:05:34")
@StaticMetamodel(UnidadeFederativa.class)
public class UnidadeFederativa_ { 

    public static volatile SingularAttribute<UnidadeFederativa, Long> codigo;
    public static volatile SingularAttribute<UnidadeFederativa, String> sigla;
    public static volatile SingularAttribute<UnidadeFederativa, String> nome;
    public static volatile ListAttribute<UnidadeFederativa, Cidade> cidades;

}
package br.integrado.jsf.model;

import br.integrado.jsf.model.UnidadeFederativa;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.3.0.v20110604-r9504", date="2013-03-15T16:25:20")
@StaticMetamodel(Cidade.class)
public class Cidade_ { 

    public static volatile SingularAttribute<Cidade, Long> codigo;
    public static volatile SingularAttribute<Cidade, UnidadeFederativa> uf;
    public static volatile SingularAttribute<Cidade, String> nome;

}
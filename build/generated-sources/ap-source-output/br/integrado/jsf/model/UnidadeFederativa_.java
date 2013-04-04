package br.integrado.jsf.model;

import br.integrado.jsf.model.Cidade;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.3.0.v20110604-r9504", date="2013-03-15T16:25:20")
@StaticMetamodel(UnidadeFederativa.class)
public class UnidadeFederativa_ { 

    public static volatile SingularAttribute<UnidadeFederativa, Long> codigo;
    public static volatile SingularAttribute<UnidadeFederativa, String> sigla;
    public static volatile SingularAttribute<UnidadeFederativa, String> nome;
    public static volatile ListAttribute<UnidadeFederativa, Cidade> cidades;

}
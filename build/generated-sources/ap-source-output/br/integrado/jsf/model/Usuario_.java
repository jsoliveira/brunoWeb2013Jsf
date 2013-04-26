package br.integrado.jsf.model;

import br.integrado.jsf.model.Estado;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.3.2.v20111125-r10461", date="2013-04-23T04:05:34")
@StaticMetamodel(Usuario.class)
public class Usuario_ { 

    public static volatile SingularAttribute<Usuario, Long> codigo;
    public static volatile SingularAttribute<Usuario, Estado> estado;
    public static volatile SingularAttribute<Usuario, String> usuario;
    public static volatile SingularAttribute<Usuario, String> email;
    public static volatile SingularAttribute<Usuario, String> nome;
    public static volatile SingularAttribute<Usuario, String> cpf;
    public static volatile SingularAttribute<Usuario, Date> nascimento;
    public static volatile SingularAttribute<Usuario, String> senha;

}
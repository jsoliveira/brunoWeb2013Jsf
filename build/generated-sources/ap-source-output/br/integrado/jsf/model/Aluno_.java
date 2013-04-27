package br.integrado.jsf.model;

import br.integrado.jsf.model.Turma;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.3.2.v20111125-r10461", date="2013-04-23T04:05:34")
@StaticMetamodel(Aluno.class)
public class Aluno_ { 

    public static volatile SingularAttribute<Aluno, Long> idAluno;
    public static volatile SingularAttribute<Aluno, String> telefone;
    public static volatile SingularAttribute<Aluno, String> RA;
    public static volatile SingularAttribute<Aluno, String> Nome;
    public static volatile ListAttribute<Aluno, Turma> turmas;

}
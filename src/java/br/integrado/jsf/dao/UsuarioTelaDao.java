package br.integrado.jsf.dao;

import br.integrado.jsf.model.Usuario;
import br.integrado.jsf.model.UsuarioTela;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class UsuarioTelaDao extends GenericDao<UsuarioTela> implements Serializable {

    public UsuarioTelaDao() {
        setClazz(UsuarioTela.class);
    }
    
    public List<UsuarioTela> findAllByUsuario (Usuario u) {
        return entityManager.createQuery("SELECT ut FROM UsuarioTela ut where ut.usuario.codigo = " + u.getCodigo()).getResultList();
    }
    
}

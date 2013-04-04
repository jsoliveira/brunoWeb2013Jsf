package br.integrado.jsf.dao;

import br.integrado.jsf.model.Usuario;

public class UsuarioDao extends GenericDao<Usuario> {

    public UsuarioDao() {
        setClazz(Usuario.class);
    }
    
}

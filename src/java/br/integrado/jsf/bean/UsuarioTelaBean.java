package br.integrado.jsf.bean;

import br.integrado.jsf.dao.UsuarioTelaDao;
import br.integrado.jsf.model.UsuarioTela;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ViewScoped
@ManagedBean
public class UsuarioTelaBean {
    
    private UsuarioTela usuarioTela = new UsuarioTela();
    private UsuarioTelaDao utDao = new UsuarioTelaDao();

    private List<UsuarioTela> usuariosTela = new ArrayList<UsuarioTela>();
    
    private List<UsuarioTela> usuariosTelaUsuario = new ArrayList<UsuarioTela>();
    
    public void salvar () {
        utDao.save(usuarioTela);
        limpar ();
    }
    
    public void deletar () {
        utDao.delete(usuarioTela);
        limpar ();
    }
    
    public void limpar () {
        usuarioTela = new UsuarioTela();
        usuariosTela = null;
        usuariosTelaUsuario = null;
        getUsuariosTela();
    }
    
    public UsuarioTela getUsuarioTela() {
        return usuarioTela;
    }

    public void setUsuarioTela(UsuarioTela usuarioTela) {
        this.usuarioTela = usuarioTela;
    }

    public List<UsuarioTela> getUsuariosTela() {
        usuariosTela = (usuariosTela == null || usuariosTela.isEmpty()) ? utDao.findAll() : usuariosTela;
        return usuariosTela;
    }
    
    public List<UsuarioTela> getUsuariosTelaUsuario() {
        try {
            usuariosTelaUsuario = utDao.findAllByUsuario(usuarioTela.getUsuario());
        } catch (Exception e) {
            return null;
        }
        return usuariosTelaUsuario;
    }
    
}

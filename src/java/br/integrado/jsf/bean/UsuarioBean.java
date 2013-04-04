package br.integrado.jsf.bean;

import br.integrado.jsf.dao.UsuarioDao;
import br.integrado.jsf.model.Usuario;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class UsuarioBean {

    private Usuario u = new Usuario();
    private UsuarioDao uDao = new UsuarioDao();
    
    private List<Usuario> usuarios;
    
    public void salvar () {
        uDao.save(u);
        setU(new Usuario());
        clear ();
    }
    
    public void clear () {
        setU(null);
        setU(new Usuario());
        this.usuarios = null;
        this.usuarios = getUsuarios();
    }
    
    public void deletar (Usuario u) {
        uDao.delete(u);
        clear ();
    }
    
    public void deletarNovo () {
        uDao.delete(this.u);
        clear ();
    }
    
    public List<Usuario> getUsuarios () {
        this.usuarios = (this.usuarios == null) ? uDao.findAll() : this.usuarios;
        return this.usuarios;
    }
    
    public Usuario getU() {
        return u;
    }

    public void setU(Usuario u) {
        this.u = u;
    }
    
}


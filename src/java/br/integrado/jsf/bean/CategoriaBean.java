package br.integrado.jsf.bean;

import br.integrado.jsf.dao.CategoriaDao;
import br.integrado.jsf.model.Categoria;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ViewScoped
@ManagedBean
public class CategoriaBean implements Serializable {
    
    CategoriaDao cDao = new CategoriaDao();
    
    private Categoria categoria = new Categoria();
    private List<Categoria> categorias;

    public void salvar () {
        cDao.save(categoria);
        limpar();
    }
    
    public void deletar () {
        cDao.delete(categoria);
        limpar();
    }
    
    public void limpar () {
        categoria = new Categoria();
        categorias = null;
        categorias = getCategorias();
    }
    
    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public List<Categoria> getCategorias() {
        this.categorias = (this.categorias == null) ? cDao.findAll() : this.categorias;
        return categorias;
    }
}

package br.integrado.jsf.bean;

import br.integrado.jsf.dao.ProdutoDao;
import br.integrado.jsf.model.Categoria;
import br.integrado.jsf.model.Produto;
import java.awt.event.ActionEvent;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.FacesException;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

@ViewScoped
@ManagedBean
public class ProdutoBean implements Serializable {
     
    private ProdutoDao pDao = new ProdutoDao();
    
    private Produto produto = new Produto();
    
    private List<Produto> produtos = new ArrayList<Produto>();
    
    public void salvar () {
        if (!produto.getCategorias().isEmpty()) {
            pDao.save(produto);
            limpar();
        } else {
            erroRelCategoria ();
        }
    }
    
    public void erroRelCategoria () {
        String msg = "Você deve relacionar seu produto a pelo menos uma categoria.";
        FacesContext fc = FacesContext.getCurrentInstance();
        fc.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, msg, msg));
    }
    
    public void deletar () {
        pDao.delete(produto);
        limpar();
    }
    
    public void limpar () {
        produto = new Produto();
        produtos.clear();
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public List<Produto> getProdutos() {
        produtos = (produtos.isEmpty()) ? pDao.findAll() : produtos;
        return produtos;
    }
    
}

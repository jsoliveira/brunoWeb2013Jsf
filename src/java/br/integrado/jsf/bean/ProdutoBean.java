package br.integrado.jsf.bean;

import br.integrado.jsf.dao.ProdutoDao;
import br.integrado.jsf.model.Categoria;
import br.integrado.jsf.model.Produto;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ViewScoped
@ManagedBean
public class ProdutoBean implements Serializable {
     
    private ProdutoDao pDao = new ProdutoDao();
    
    private Produto produto = new Produto();
    
    private List<Produto> produtos = new ArrayList<Produto>();
    
    public void salvar () {
        pDao.save(produto);
        limpar();
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

    public ProdutoDao getpDao() {
        return pDao;
    }

    public void setpDao(ProdutoDao pDao) {
        this.pDao = pDao;
    }
    
}

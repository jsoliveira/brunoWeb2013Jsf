package br.integrado.jsf.bean;

import br.integrado.jsf.dao.CidadeDao;
import br.integrado.jsf.dao.UnidadeFederativaDao;
import br.integrado.jsf.model.Cidade;
import br.integrado.jsf.model.UnidadeFederativa;
import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class CidadeBean implements Serializable {
    
    private Cidade cidade = new Cidade();
    
    private CidadeDao cDao = new CidadeDao();
    
    private List<Cidade> cidades;
    
    public void salvar () {
        cDao.save(cidade);
        limpar();
    }
    
    public void alterar (Cidade c) {
        setCidade(c);
    }
    
    public void deletar (Cidade c) {
        cDao.delete(c);
        limpar();
    }
    
    public void limpar () {
        this.cidade = new Cidade();
        this.cidades = null;
        this.cidades = getCidades();
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public CidadeDao getcDao() {
        return cDao;
    }

    public void setcDao(CidadeDao cDao) {
        this.cDao = cDao;
    }
    
    public List<Cidade> getCidades() {
        this.cidades = (this.cidades == null) ? cDao.findAll() : this.cidades;
        return cidades;
    }
}

package br.integrado.jsf.bean;

import br.integrado.jsf.dao.UnidadeFederativaDao;
import br.integrado.jsf.model.UnidadeFederativa;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class UnidadeFederativaBean {
    
    
    private UnidadeFederativa uf = new UnidadeFederativa();
    private UnidadeFederativaDao ufDao = new UnidadeFederativaDao();
    
    private List<UnidadeFederativa> ufs;
    
    public void salvar () {
        ufDao.save(uf);
        limpar();
    }
    
    public void alterar (UnidadeFederativa uf) {
        setUf(uf);
    }
    
    public void remover (UnidadeFederativa uf) {
        ufDao.delete(uf);
        limpar();
    }
    
    public List getUfs () {
        this.ufs = (this.ufs == null) ? ufDao.findAll() : this.ufs;
        return ufs;
    }
    
    public void limpar () {
        this.uf = new UnidadeFederativa();
        this.ufs = null;
        this.ufs = getUfs();
    }

    public UnidadeFederativa getUf() {
        return uf;
    }

    public void setUf(UnidadeFederativa uf) {
        this.uf = uf;
    }
    
}

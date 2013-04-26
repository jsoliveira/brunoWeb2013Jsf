package br.integrado.jsf.bean;

import br.integrado.jsf.dao.TelaDao;
import br.integrado.jsf.model.Tela;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ViewScoped
@ManagedBean
public class TelaBean implements Serializable {
    
    private TelaDao tDao = new TelaDao();
    private Tela t = new Tela();
    
    private List<Tela> telas = new ArrayList<Tela>();

    public void salvar () {
        tDao.save(t);
        limpar();
    }
    
    public void deletar () {
        tDao.delete(t);
        limpar();
    }
    
    public void limpar () {
        t = new Tela();
        telas = null;
        getTelas();
    }
    
    public Tela getT() {
        return t;
    }

    public void setT(Tela t) {
        this.t = t;
    }

    public List<Tela> getTelas() {
        telas = (telas == null || telas.isEmpty()) ? tDao.findAll() : telas;
        return telas;
    }
}

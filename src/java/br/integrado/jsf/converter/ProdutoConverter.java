package br.integrado.jsf.converter;

import br.integrado.jsf.dao.ProdutoDao;
import br.integrado.jsf.model.Produto;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

@FacesConverter(forClass = Produto.class, value = "ProdutoConverter")
public class ProdutoConverter implements Converter {

    private ProdutoDao pDao = new ProdutoDao();
    
    @Override
    public Object getAsObject(FacesContext fc, UIComponent uic, String string) {
        try {
            return pDao.findOne(Long.parseLong(string));
        } catch (NumberFormatException e) {
            return null;
        }
    }

    @Override
    public String getAsString(FacesContext fc, UIComponent uic, Object o) {
        
        Produto p = (Produto) o;
        
        try {
            return String.valueOf(p.getId());
        } catch (Exception e) {
            return null;
        }
    }
    
}

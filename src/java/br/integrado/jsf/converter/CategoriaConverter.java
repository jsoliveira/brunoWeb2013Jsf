package br.integrado.jsf.converter;

import br.integrado.jsf.dao.CategoriaDao;
import br.integrado.jsf.model.Categoria;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

@FacesConverter(forClass=Categoria.class, value="CategoriaConverter")
public class CategoriaConverter implements Converter {

    private CategoriaDao cDao = new CategoriaDao();
    
    @Override
    public Object getAsObject(FacesContext fc, UIComponent uic, String string) {
        try {
            return cDao.findOne(Long.parseLong(string));
        } catch (NumberFormatException e) {
            return null;
        }
    }

    @Override
    public String getAsString(FacesContext fc, UIComponent uic, Object o) {
        try {
            Categoria c = (Categoria) o;
            
            return String.valueOf(c.getId());
        } catch (Exception e) {
            return null;
        }
    }
    
}

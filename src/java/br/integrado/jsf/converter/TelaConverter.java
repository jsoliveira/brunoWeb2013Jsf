package br.integrado.jsf.converter;

import br.integrado.jsf.dao.TelaDao;
import br.integrado.jsf.model.Tela;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

@FacesConverter(forClass = Tela.class, value = "TelaConverter")
public class TelaConverter implements Converter {

    private TelaDao tDao = new TelaDao();
    
    @Override
    public Object getAsObject(FacesContext fc, UIComponent uic, String string) {
        try {
            return tDao.findOne(Long.parseLong(string));
        } catch (NumberFormatException e) {
            return null;
        }
    }

    @Override
    public String getAsString(FacesContext fc, UIComponent uic, Object o) {
        Tela t = (Tela) o;
        
        try {
            return t.getId().toString();
        } catch (Exception e) {
            return null;
        }
    }
    
}

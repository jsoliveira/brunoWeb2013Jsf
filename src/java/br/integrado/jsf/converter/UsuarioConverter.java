package br.integrado.jsf.converter;

import br.integrado.jsf.dao.UsuarioDao;
import br.integrado.jsf.model.Usuario;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

@FacesConverter(forClass = Usuario.class, value = "UsuarioConverter")
public class UsuarioConverter implements Converter {

    private UsuarioDao uDao = new UsuarioDao();
    
    @Override
    public Object getAsObject(FacesContext fc, UIComponent uic, String string) {
        try {
            return uDao.findOne(Long.parseLong(string));
        } catch (NumberFormatException e) {
            return null;
        }
    }

    @Override
    public String getAsString(FacesContext fc, UIComponent uic, Object o) {
        Usuario u = (Usuario) o;
        try {
            return String.valueOf(u.getCodigo());
        } catch (Exception e) {
            return null;
        }
    }
    
}

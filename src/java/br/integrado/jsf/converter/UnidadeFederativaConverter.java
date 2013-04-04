package br.integrado.jsf.converter;

import br.integrado.jsf.dao.UnidadeFederativaDao;
import br.integrado.jsf.model.UnidadeFederativa;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

@FacesConverter(forClass=UnidadeFederativa.class, value="UnidadeFederativaConverter")
public class UnidadeFederativaConverter implements Converter {

    UnidadeFederativaDao ufDao = new UnidadeFederativaDao();
    
    public UnidadeFederativaConverter() { }
    
    @Override
    public Object getAsObject(FacesContext fc, UIComponent uic, String string) {
        if (string == null || string.isEmpty()) return null;
        
        return ufDao.findOne(Long.parseLong(string));
    }

    @Override
    public String getAsString(FacesContext fc, UIComponent uic, Object o) {
        UnidadeFederativa uf = (UnidadeFederativa) o;
        
        if (uf == null || uf.getCodigo() == null) return null;
        
        return String.valueOf(uf.getCodigo());
    }
    
}

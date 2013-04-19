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
        try {
            System.out.println("---->" + ufDao.findOne(Long.parseLong(string)).getNome());
            return ufDao.findOne(Long.parseLong(string));
        } catch (NumberFormatException ex) {
            return null;
        }
    }

    @Override
    public String getAsString(FacesContext fc, UIComponent uic, Object o) {
        UnidadeFederativa uf = (UnidadeFederativa) o;
        
        try {
            System.out.println(uf.getCodigo());
            return String.valueOf(uf.getCodigo());
        } catch (Exception e) {
            return null;
        }
    }
    
}

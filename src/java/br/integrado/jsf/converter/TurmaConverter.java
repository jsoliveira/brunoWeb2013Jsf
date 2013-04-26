package br.integrado.jsf.converter;

import br.integrado.jsf.dao.TurmaDao;
import br.integrado.jsf.model.Turma;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

@FacesConverter(forClass=Turma.class, value="TurmaConverter")
public class TurmaConverter implements Converter {

    private TurmaDao tDao = new TurmaDao();
    
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
        Turma t = (Turma) o;
        
        try {
            return String.valueOf(t.getIdTurma());
        } catch (Exception e) {
            return null;
        }
    }
    
}

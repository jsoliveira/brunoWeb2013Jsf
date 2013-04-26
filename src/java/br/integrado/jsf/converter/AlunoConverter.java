package br.integrado.jsf.converter;

import br.integrado.jsf.dao.AlunoDao;
import br.integrado.jsf.model.Aluno;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

@FacesConverter(forClass=Aluno.class, value="AlunoConverter")
public class AlunoConverter implements Converter {

    private AlunoDao aDao = new AlunoDao();
    
    @Override
    public Object getAsObject(FacesContext fc, UIComponent uic, String string) {
        try {
            return aDao.findOne(Long.parseLong(string));
        } catch (NumberFormatException e) {
            return null;
        }
    }

    @Override
    public String getAsString(FacesContext fc, UIComponent uic, Object o) {
        Aluno a = (Aluno) o;
        
        try {
            return String.valueOf(a.getIdAluno());
        } catch (Exception e) {
            return null;
        }
    }
    
}

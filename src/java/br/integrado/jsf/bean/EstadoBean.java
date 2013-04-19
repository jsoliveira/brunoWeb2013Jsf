package br.integrado.jsf.bean;

import br.integrado.jsf.model.Estado;
import javax.faces.bean.ManagedBean;

@ManagedBean
public class EstadoBean {
    
    private Estado estado;

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
    
}

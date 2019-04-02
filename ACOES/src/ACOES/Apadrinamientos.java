/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ACOES;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Santi
 */
@Entity
public class Apadrinamientos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_apadrinamiento;
     @Temporal(TemporalType.DATE)
    private Date fecha_inicio;
    
    
    @ManyToOne
    private Socio socio;
    
    public Long getId_apadrinamiento() {
        return id_apadrinamiento;
    }

    public void setId_apadrinamiento(Long id) {
        this.id_apadrinamiento = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id_apadrinamiento != null ? id_apadrinamiento.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Apadrinamientos)) {
            return false;
        }
        Apadrinamientos other = (Apadrinamientos) object;
        if ((this.id_apadrinamiento == null && other.id_apadrinamiento != null) || (this.id_apadrinamiento != null && !this.id_apadrinamiento.equals(other.id_apadrinamiento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ACOES.Apadrinamientos[ id=" + id_apadrinamiento + " ]";
    }
    
    
    /**
     * @return the fecha_inicio
     */
    public Date getFecha_inicio() {
        return fecha_inicio;
    }
    
}

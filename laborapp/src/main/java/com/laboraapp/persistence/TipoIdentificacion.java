/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.laboraapp.persistence;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author yalvarez
 */
@Entity
@Table(name = "tipo_identificacion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TipoIdentificacion.findAll", query = "SELECT t FROM TipoIdentificacion t")
    , @NamedQuery(name = "TipoIdentificacion.findByIdTipIdentificacion", query = "SELECT t FROM TipoIdentificacion t WHERE t.idTipIdentificacion = :idTipIdentificacion")
    , @NamedQuery(name = "TipoIdentificacion.findByDescripcion", query = "SELECT t FROM TipoIdentificacion t WHERE t.descripcion = :descripcion")
    , @NamedQuery(name = "TipoIdentificacion.findByFechaRegistro", query = "SELECT t FROM TipoIdentificacion t WHERE t.fechaRegistro = :fechaRegistro")})
public class TipoIdentificacion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_TIP_IDENTIFICACION")
    private Integer idTipIdentificacion;
    @Size(max = 45)
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Column(name = "FECHA_REGISTRO")
    @Temporal(TemporalType.DATE)
    private Date fechaRegistro;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idTipIdentificacion")
    private List<TipoPersona> tipoPersonaList;

    public TipoIdentificacion() {
    }

    public TipoIdentificacion(Integer idTipIdentificacion) {
        this.idTipIdentificacion = idTipIdentificacion;
    }

    public Integer getIdTipIdentificacion() {
        return idTipIdentificacion;
    }

    public void setIdTipIdentificacion(Integer idTipIdentificacion) {
        this.idTipIdentificacion = idTipIdentificacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    @XmlTransient
    public List<TipoPersona> getTipoPersonaList() {
        return tipoPersonaList;
    }

    public void setTipoPersonaList(List<TipoPersona> tipoPersonaList) {
        this.tipoPersonaList = tipoPersonaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTipIdentificacion != null ? idTipIdentificacion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoIdentificacion)) {
            return false;
        }
        TipoIdentificacion other = (TipoIdentificacion) object;
        if ((this.idTipIdentificacion == null && other.idTipIdentificacion != null) || (this.idTipIdentificacion != null && !this.idTipIdentificacion.equals(other.idTipIdentificacion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.laboraapp.persistence.TipoIdentificacion[ idTipIdentificacion=" + idTipIdentificacion + " ]";
    }
    
}

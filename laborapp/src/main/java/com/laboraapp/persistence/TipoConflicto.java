/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.laboraapp.persistence;

import java.io.Serializable;
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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author yalvarez
 */
@Entity
@Table(name = "tipo_conflicto")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TipoConflicto.findAll", query = "SELECT t FROM TipoConflicto t")
    , @NamedQuery(name = "TipoConflicto.findByIdTipoConflicto", query = "SELECT t FROM TipoConflicto t WHERE t.idTipoConflicto = :idTipoConflicto")
    , @NamedQuery(name = "TipoConflicto.findByDescripcion", query = "SELECT t FROM TipoConflicto t WHERE t.descripcion = :descripcion")
    , @NamedQuery(name = "TipoConflicto.findByEstado", query = "SELECT t FROM TipoConflicto t WHERE t.estado = :estado")
    , @NamedQuery(name = "TipoConflicto.findByFechaRegistro", query = "SELECT t FROM TipoConflicto t WHERE t.fechaRegistro = :fechaRegistro")})
public class TipoConflicto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_TIPO_CONFLICTO")
    private Integer idTipoConflicto;
    @Size(max = 45)
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Size(max = 45)
    @Column(name = "ESTADO")
    private String estado;
    @Size(max = 45)
    @Column(name = "FECHA_REGISTRO")
    private String fechaRegistro;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idTipoConflicto")
    private List<Demanda> demandaList;

    public TipoConflicto() {
    }

    public TipoConflicto(Integer idTipoConflicto) {
        this.idTipoConflicto = idTipoConflicto;
    }

    public Integer getIdTipoConflicto() {
        return idTipoConflicto;
    }

    public void setIdTipoConflicto(Integer idTipoConflicto) {
        this.idTipoConflicto = idTipoConflicto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(String fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    @XmlTransient
    public List<Demanda> getDemandaList() {
        return demandaList;
    }

    public void setDemandaList(List<Demanda> demandaList) {
        this.demandaList = demandaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTipoConflicto != null ? idTipoConflicto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoConflicto)) {
            return false;
        }
        TipoConflicto other = (TipoConflicto) object;
        if ((this.idTipoConflicto == null && other.idTipoConflicto != null) || (this.idTipoConflicto != null && !this.idTipoConflicto.equals(other.idTipoConflicto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.laboraapp.persistence.TipoConflicto[ idTipoConflicto=" + idTipoConflicto + " ]";
    }
    
}

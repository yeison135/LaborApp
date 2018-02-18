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
@Table(name = "tipo_contrato")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TipoContrato.findAll", query = "SELECT t FROM TipoContrato t")
    , @NamedQuery(name = "TipoContrato.findByIdTipContrato", query = "SELECT t FROM TipoContrato t WHERE t.idTipContrato = :idTipContrato")
    , @NamedQuery(name = "TipoContrato.findByDescipcion", query = "SELECT t FROM TipoContrato t WHERE t.descipcion = :descipcion")
    , @NamedQuery(name = "TipoContrato.findByFechaRegistro", query = "SELECT t FROM TipoContrato t WHERE t.fechaRegistro = :fechaRegistro")})
public class TipoContrato implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_TIP_CONTRATO")
    private Integer idTipContrato;
    @Size(max = 45)
    @Column(name = "DESCIPCION")
    private String descipcion;
    @Size(max = 45)
    @Column(name = "FECHA_REGISTRO")
    private String fechaRegistro;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idTipContrato")
    private List<Demanda> demandaList;

    public TipoContrato() {
    }

    public TipoContrato(Integer idTipContrato) {
        this.idTipContrato = idTipContrato;
    }

    public Integer getIdTipContrato() {
        return idTipContrato;
    }

    public void setIdTipContrato(Integer idTipContrato) {
        this.idTipContrato = idTipContrato;
    }

    public String getDescipcion() {
        return descipcion;
    }

    public void setDescipcion(String descipcion) {
        this.descipcion = descipcion;
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
        hash += (idTipContrato != null ? idTipContrato.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoContrato)) {
            return false;
        }
        TipoContrato other = (TipoContrato) object;
        if ((this.idTipContrato == null && other.idTipContrato != null) || (this.idTipContrato != null && !this.idTipContrato.equals(other.idTipContrato))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.laboraapp.persistence.TipoContrato[ idTipContrato=" + idTipContrato + " ]";
    }
    
}

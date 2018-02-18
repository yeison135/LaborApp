/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.laboraapp.persistence;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author yalvarez
 */
@Entity
@Table(name = "sentencia")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Sentencia.findAll", query = "SELECT s FROM Sentencia s")
    , @NamedQuery(name = "Sentencia.findByIdSentencia", query = "SELECT s FROM Sentencia s WHERE s.idSentencia = :idSentencia")
    , @NamedQuery(name = "Sentencia.findByDescripcion", query = "SELECT s FROM Sentencia s WHERE s.descripcion = :descripcion")
    , @NamedQuery(name = "Sentencia.findByDiasACancelar", query = "SELECT s FROM Sentencia s WHERE s.diasACancelar = :diasACancelar")
    , @NamedQuery(name = "Sentencia.findByFechaRegistro", query = "SELECT s FROM Sentencia s WHERE s.fechaRegistro = :fechaRegistro")
    , @NamedQuery(name = "Sentencia.findByTotal", query = "SELECT s FROM Sentencia s WHERE s.total = :total")})
public class Sentencia implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_SENTENCIA")
    private Integer idSentencia;
    @Size(max = 45)
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Size(max = 45)
    @Column(name = "DIAS_A_CANCELAR")
    private String diasACancelar;
    @Column(name = "FECHA_REGISTRO")
    @Temporal(TemporalType.DATE)
    private Date fechaRegistro;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "TOTAL")
    private Double total;
    @JoinColumn(name = "ID_DEMANDA", referencedColumnName = "ID_DEMANDA")
    @ManyToOne(optional = false)
    private Demanda idDemanda;

    public Sentencia() {
    }

    public Sentencia(Integer idSentencia) {
        this.idSentencia = idSentencia;
    }

    public Integer getIdSentencia() {
        return idSentencia;
    }

    public void setIdSentencia(Integer idSentencia) {
        this.idSentencia = idSentencia;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDiasACancelar() {
        return diasACancelar;
    }

    public void setDiasACancelar(String diasACancelar) {
        this.diasACancelar = diasACancelar;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Demanda getIdDemanda() {
        return idDemanda;
    }

    public void setIdDemanda(Demanda idDemanda) {
        this.idDemanda = idDemanda;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idSentencia != null ? idSentencia.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Sentencia)) {
            return false;
        }
        Sentencia other = (Sentencia) object;
        if ((this.idSentencia == null && other.idSentencia != null) || (this.idSentencia != null && !this.idSentencia.equals(other.idSentencia))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.laboraapp.persistence.Sentencia[ idSentencia=" + idSentencia + " ]";
    }
    
}

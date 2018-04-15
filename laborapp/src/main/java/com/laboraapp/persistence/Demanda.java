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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "demanda")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Demanda.findAll", query = "SELECT d FROM Demanda d")
    , @NamedQuery(name = "Demanda.findByIdDemanda", query = "SELECT d FROM Demanda d WHERE d.idDemanda = :idDemanda")
    , @NamedQuery(name = "Demanda.findByFechaRegistro", query = "SELECT d FROM Demanda d WHERE d.fechaRegistro = :fechaRegistro")
    , @NamedQuery(name = "Demanda.findByFechaIngreso", query = "SELECT d FROM Demanda d WHERE d.fechaIngreso = :fechaIngreso")
    , @NamedQuery(name = "Demanda.findByFechaDespido", query = "SELECT d FROM Demanda d WHERE d.fechaDespido = :fechaDespido")
    , @NamedQuery(name = "Demanda.findBySalarioBase", query = "SELECT d FROM Demanda d WHERE d.salarioBase = :salarioBase")
    , @NamedQuery(name = "Demanda.findByProfecion", query = "SELECT d FROM Demanda d WHERE d.profecion = :profecion")})
public class Demanda implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_DEMANDA")
    private Integer idDemanda;
    @Column(name = "FECHA_REGISTRO")
    @Temporal(TemporalType.DATE)
    private Date fechaRegistro;
    @Column(name = "FECHA_INGRESO")
    @Temporal(TemporalType.DATE)
    private Date fechaIngreso;
    @Column(name = "FECHA_DESPIDO")
    @Temporal(TemporalType.DATE)
    private Date fechaDespido;
    @Size(max = 45)
    @Column(name = "SALARIO_BASE")
    private String salarioBase;
    @Size(max = 45)
    @Column(name = "PROFECION")
    private String profecion;
    @JoinColumn(name = "ID_PERSONA", referencedColumnName = "ID_PERSONA")
    @ManyToOne(optional = false)
    private Persona idPersona;
    @JoinColumn(name = "ID_SALARIO_MINIMO", referencedColumnName = "ID_SALARIO_MINIMO")
    @ManyToOne(optional = false)
    private SalariosMinimos idSalarioMinimo;
    @JoinColumn(name = "ID_TIPO_CONFLICTO", referencedColumnName = "ID_TIPO_CONFLICTO")
    @ManyToOne(optional = false)
    private TipoConflicto idTipoConflicto;
    @JoinColumn(name = "ID_TIP_CONTRATO", referencedColumnName = "ID_TIP_CONTRATO")
    @ManyToOne(optional = false)
    private TipoContrato idTipContrato;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idDemanda")
    private List<Evidencia> evidenciaList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idDemanda")
    private List<Sentencia> sentenciaList;

    public Demanda() {
    }

    public Demanda(Integer idDemanda) {
        this.idDemanda = idDemanda;
    }

    public Integer getIdDemanda() {
        return idDemanda;
    }

    public void setIdDemanda(Integer idDemanda) {
        this.idDemanda = idDemanda;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public Date getFechaDespido() {
        return fechaDespido;
    }

    public void setFechaDespido(Date fechaDespido) {
        this.fechaDespido = fechaDespido;
    }

    public String getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(String salarioBase) {
        this.salarioBase = salarioBase;
    }

    public String getProfecion() {
        return profecion;
    }

    public void setProfecion(String profecion) {
        this.profecion = profecion;
    }

    public Persona getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(Persona idPersona) {
        this.idPersona = idPersona;
    }

    public SalariosMinimos getIdSalarioMinimo() {
        return idSalarioMinimo;
    }

    public void setIdSalarioMinimo(SalariosMinimos idSalarioMinimo) {
        this.idSalarioMinimo = idSalarioMinimo;
    }

    public TipoConflicto getIdTipoConflicto() {
        return idTipoConflicto;
    }

    public void setIdTipoConflicto(TipoConflicto idTipoConflicto) {
        this.idTipoConflicto = idTipoConflicto;
    }

    public TipoContrato getIdTipContrato() {
        return idTipContrato;
    }

    public void setIdTipContrato(TipoContrato idTipContrato) {
        this.idTipContrato = idTipContrato;
    }

    @XmlTransient
    public List<Evidencia> getEvidenciaList() {
        return evidenciaList;
    }

    public void setEvidenciaList(List<Evidencia> evidenciaList) {
        this.evidenciaList = evidenciaList;
    }

    @XmlTransient
    public List<Sentencia> getSentenciaList() {
        return sentenciaList;
    }

    public void setSentenciaList(List<Sentencia> sentenciaList) {
        this.sentenciaList = sentenciaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDemanda != null ? idDemanda.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Demanda)) {
            return false;
        }
        Demanda other = (Demanda) object;
        if ((this.idDemanda == null && other.idDemanda != null) || (this.idDemanda != null && !this.idDemanda.equals(other.idDemanda))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.laboraapp.persistence.Demanda[ idDemanda=" + idDemanda + " ]";
    }
    
}

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
@Table(name = "salarios_minimos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SalariosMinimos.findAll", query = "SELECT s FROM SalariosMinimos s")
    , @NamedQuery(name = "SalariosMinimos.findByIdSalarioMinimo", query = "SELECT s FROM SalariosMinimos s WHERE s.idSalarioMinimo = :idSalarioMinimo")
    , @NamedQuery(name = "SalariosMinimos.findByA\u00f1oSalario", query = "SELECT s FROM SalariosMinimos s WHERE s.a\u00f1oSalario = :a\u00f1oSalario")
    , @NamedQuery(name = "SalariosMinimos.findBySalario", query = "SELECT s FROM SalariosMinimos s WHERE s.salario = :salario")})
public class SalariosMinimos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_SALARIO_MINIMO")
    private Integer idSalarioMinimo;
    @Size(max = 45)
    @Column(name = "A\u00d1O_SALARIO")
    private String añoSalario;
    @Size(max = 45)
    @Column(name = "SALARIO")
    private String salario;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idSalarioMinimo")
    private List<Demanda> demandaList;

    public SalariosMinimos() {
    }

    public SalariosMinimos(Integer idSalarioMinimo) {
        this.idSalarioMinimo = idSalarioMinimo;
    }

    public Integer getIdSalarioMinimo() {
        return idSalarioMinimo;
    }

    public void setIdSalarioMinimo(Integer idSalarioMinimo) {
        this.idSalarioMinimo = idSalarioMinimo;
    }

    public String getAñoSalario() {
        return añoSalario;
    }

    public void setAñoSalario(String añoSalario) {
        this.añoSalario = añoSalario;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
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
        hash += (idSalarioMinimo != null ? idSalarioMinimo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SalariosMinimos)) {
            return false;
        }
        SalariosMinimos other = (SalariosMinimos) object;
        if ((this.idSalarioMinimo == null && other.idSalarioMinimo != null) || (this.idSalarioMinimo != null && !this.idSalarioMinimo.equals(other.idSalarioMinimo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.laboraapp.persistence.SalariosMinimos[ idSalarioMinimo=" + idSalarioMinimo + " ]";
    }
    
}

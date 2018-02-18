/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.laboraapp.persistence;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author yalvarez
 */
@Entity
@Table(name = "oficina")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Oficina.findAll", query = "SELECT o FROM Oficina o")
    , @NamedQuery(name = "Oficina.findByIdOficina", query = "SELECT o FROM Oficina o WHERE o.idOficina = :idOficina")
    , @NamedQuery(name = "Oficina.findByDireccion", query = "SELECT o FROM Oficina o WHERE o.direccion = :direccion")
    , @NamedQuery(name = "Oficina.findByTelefono", query = "SELECT o FROM Oficina o WHERE o.telefono = :telefono")
    , @NamedQuery(name = "Oficina.findByHorario", query = "SELECT o FROM Oficina o WHERE o.horario = :horario")})
public class Oficina implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_OFICINA")
    private Integer idOficina;
    @Size(max = 45)
    @Column(name = "DIRECCION")
    private String direccion;
    @Size(max = 45)
    @Column(name = "TELEFONO")
    private String telefono;
    @Size(max = 45)
    @Column(name = "HORARIO")
    private String horario;
    @JoinColumn(name = "D_MUNICIPIO", referencedColumnName = "ID_MUNICIPIO")
    @ManyToOne(optional = false)
    private Municipio dMunicipio;

    public Oficina() {
    }

    public Oficina(Integer idOficina) {
        this.idOficina = idOficina;
    }

    public Integer getIdOficina() {
        return idOficina;
    }

    public void setIdOficina(Integer idOficina) {
        this.idOficina = idOficina;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public Municipio getDMunicipio() {
        return dMunicipio;
    }

    public void setDMunicipio(Municipio dMunicipio) {
        this.dMunicipio = dMunicipio;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idOficina != null ? idOficina.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Oficina)) {
            return false;
        }
        Oficina other = (Oficina) object;
        if ((this.idOficina == null && other.idOficina != null) || (this.idOficina != null && !this.idOficina.equals(other.idOficina))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.laboraapp.persistence.Oficina[ idOficina=" + idOficina + " ]";
    }
    
}

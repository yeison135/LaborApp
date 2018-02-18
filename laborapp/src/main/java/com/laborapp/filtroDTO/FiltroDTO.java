/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.laborapp.filtroDTO;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Carlos.Marin
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FiltroDTO {
    
    /**
     * Fecha Inicial para filtrado
     */
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy", timezone="EST")
    private Date fechaInicial;
    /**
     * Fecha final para filtrado
     */
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy", timezone="EST")
    private Date fechaFinal;

    /**
     * Identificador para filtrar
     */
    private Integer filtroId;
    
    /**
     * Filtro uno
     */
    private String filtroUno;
    /**
     * Filtro uno
     */
    private Double cantidad;

    public Double getCantidad() {
        return cantidad;
    }

    public void setCantidad(Double cantidad) {
        this.cantidad = cantidad;
    }
    /**
     * Filtro dis
     */
    private String filtroDos;
    
    /**
     * Filtro tres
     */
    private String filtroTres;
    
    /**
     * Filtro cuatro
     */
    private String filtroCuatro;
    
    /**
     * Filtro cinco
     */
    private String filtroCinco;
    
    /**
     * Filtro por identificador
     */
    private Integer filtroDosId;
    /**
     * Filtro por tipo de documento
     */
    private String tipoDoc;
    
    /**
     * Filtro por numero de documento
     */
    private String numeroDoc;
    
    /**
     * Filtro de tipo byte[]
     */
    private byte[] bFiltro;
    
    /**
     * Lista de filtros
     */
    private List<String> listaFiltros;
    /**
     * Filtro booleano
     */
    private boolean filtroBoolean;
     /**
     * Filtro booleano
     */
    private Double filtroSeis;

    public boolean isFiltroBoolean() {
        return filtroBoolean;
    }

    public Double getFiltroSeis() {
        return filtroSeis;
    }

    public void setFiltroSeis(Double filtroSeis) {
        this.filtroSeis = filtroSeis;
    }

    public void setFiltroBoolean(boolean filtroBoolean) {
        this.filtroBoolean = filtroBoolean;
    }

    public List<String> getListaFiltros() {
        return listaFiltros;
    }

    public void setListaFiltros(List<String> listaFiltros) {
        this.listaFiltros = listaFiltros;
    }

    /**
     * 
     * @return 
     */
    public String getFiltroCinco() {
        return filtroCinco;
    }

    /**
     * 
     * @param filtroCinco 
     */
    public void setFiltroCinco(String filtroCinco) {
        this.filtroCinco = filtroCinco;
    }
    
    /**
     * @return the fechaInicial
     */
    public Date getFechaInicial() {
        return fechaInicial;
    }

    /**
     * @param fechaInicial the fechaInicial to set
     */
    public void setFechaInicial(Date fechaInicial) {
        this.fechaInicial = fechaInicial;
    }

    /**
     * @return the fechaFinal
     */
    public Date getFechaFinal() {
        return fechaFinal;
    }

    /**
     * @param fechaFinal the fechaFinal to set
     */
    public void setFechaFinal(Date fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    /**
     * @return the filtroId
     */
    public Integer getFiltroId() {
        return filtroId;
    }

    /**
     * @param filtroId the filtroId to set
     */
    public void setFiltroId(Integer filtroId) {
        this.filtroId = filtroId;
    }

    /**
     * 
     * @return 
     */
    public String getFiltroUno() {
        return filtroUno;
    }

    /**
     * 
     * @param filtroUno 
     */
    public void setFiltroUno(String filtroUno) {
        this.filtroUno = filtroUno;
    }

    /**
     * 
     * @return 
     */
    public String getFiltroDos() {
        return filtroDos;
    }

    /**
     * 
     * @param filtroDos 
     */
    public void setFiltroDos(String filtroDos) {
        this.filtroDos = filtroDos;
    }

    /**
     * 
     * @return 
     */
    public String getFiltroTres() {
        return filtroTres;
    }

    /**
     * 
     * @param filtroTres 
     */
    public void setFiltroTres(String filtroTres) {
        this.filtroTres = filtroTres;
    }

    /**
     * 
     * @return 
     */
    public String getFiltroCuatro() {
        return filtroCuatro;
    }

    /**
     * 
     * @param filtroCuatro 
     */
    public void setFiltroCuatro(String filtroCuatro) {
        this.filtroCuatro = filtroCuatro;
    }
    
    /*
     * @return the filtroDosId
     */
    public Integer getFiltroDosId() {
        return filtroDosId;
    }

    /**
     * @param filtroDosId the filtroDosId to set
     */
    public void setFiltroDosId(Integer filtroDosId) {
        this.filtroDosId = filtroDosId;
    }

    /**
     * @return the tipoDoc
     */
    public String getTipoDoc() {
        return tipoDoc;
    }

    /**
     * @param tipoDoc the tipoDoc to set
     */
    public void setTipoDoc(String tipoDoc) {
        this.tipoDoc = tipoDoc;
    }

    /**
     * @return the numeroDoc
     */
    public String getNumeroDoc() {
        return numeroDoc;
    }

    /**
     * @param numeroDoc the numeroDoc to set
     */
    public void setNumeroDoc(String numeroDoc) {
        this.numeroDoc = numeroDoc;
    }

    /**
     * @return 
     */
    public byte[] getbFiltro() {
        return bFiltro;
    }

    /**
     * @param bFiltro 
     */
    public void setbFiltro(byte[] bFiltro) {
        this.bFiltro = bFiltro;
    }
    
    
}


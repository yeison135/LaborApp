/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.laboraapp.Dtos;

/**
 *
 * @author Yeisson alvarez
 */
public class TotalDosi {
    
Integer cantidadPorVeinte;    
Integer cantidadPorDiez;
String total;

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public Integer getCantidadPorVeinte() {
        return cantidadPorVeinte;
    }

    public void setCantidadPorVeinte(Integer cantidadPorVeinte) {
        this.cantidadPorVeinte = cantidadPorVeinte;
    }

    public Integer getCantidadPorDiez() {
        return cantidadPorDiez;
    }

    public void setCantidadPorDiez(Integer cantidadPorDiez) {
        this.cantidadPorDiez = cantidadPorDiez;
    }
    
    
}

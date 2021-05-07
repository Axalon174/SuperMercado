/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.supermercado;

import java.util.Date;

/**
 *
 * @author Predator1
 */
public class Historial {
    private int CantidadCompra;
    private String Codigo;
    private Date FechaCompra;
    private int NumCompra;

    public Historial(int CantidadCompra, String Codigo, Date FechaCompra, int NumCompra) {
        this.CantidadCompra = CantidadCompra;
        this.Codigo = Codigo;
        this.FechaCompra = FechaCompra;
        this.NumCompra = NumCompra;
    }

    @Override
    public String toString() {
        return "Historial{" + "CantidadCompra=" + CantidadCompra + ", Codigo=" + Codigo + ", FechaCompra=" + FechaCompra + ", NumCompra=" + NumCompra + '}';
    }

    public float getCantidadCompra() {
        return CantidadCompra;
    }

    public void setCantidadCompra(int CantidadCompra) {
        this.CantidadCompra = CantidadCompra;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public Date getFechaCompra() {
        return FechaCompra;
    }

    public void setFechaCompra(Date FechaCompra) {
        this.FechaCompra = FechaCompra;
    }

    public int getNumCompra() {
        return NumCompra;
    }

    public void setNumCompra(int NumCompra) {
        this.NumCompra = NumCompra;
    }
    
    
}

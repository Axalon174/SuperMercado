/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.supermercado;

import java.util.ArrayList;

/**
 *
 * @author Predator1
 */
public class Cliente {
    private String nombre;
    private String rfc;
    private ArrayList<Historial>historial = new ArrayList<Historial>();

    public Cliente(String nombre, String rfc) {
        this.nombre = nombre;
        this.rfc = rfc;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", rfc=" + rfc + ", historial=" + historial + '}';
    }

    public ArrayList<Historial> getHistorial() {
        return historial;
    }

    public void setHistorial(ArrayList<Historial> historial) {
        this.historial = historial;
    }
    
    
    
}

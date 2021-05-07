/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.supermercado;

/**
 *
 * @author Predator1
 */
public class Producto {
    private String nombre;
    private String codigo;
    private String marca;
    private double precio;
    private int existencia;
    private int categoría;

    public Producto(String nombre, String codigo, String marca, double precio, int categoría) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.marca = marca;
        this.precio = precio;
        this.existencia = 0;
        this.categoría = categoría;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getExistencia() {
        return existencia;
    }

    public void setExistencia(int existencia) {
        this.existencia = existencia;
    }

    public int getCategoría() {
        return categoría;
    }

    public void setCategoría(int categoría) {
        this.categoría = categoría;
    }

    @Override
    public String toString() {
        return "Producto{" + "nombre=" + nombre + ", codigo=" + codigo + ", marca=" + marca + ", precio=" + precio + ", existencia=" + existencia + ", categor\u00eda=" + categoría + '}';
    }
    
    
    
}

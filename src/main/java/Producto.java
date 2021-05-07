/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user01
 */
public class Producto {
    private String nombre;
    private int codigo;
    private String marca;
    private double precio;
    private String descripcion;
    private int existencia;
    private int categoria;

    public Producto(String nombre, int codigo, String marca, double precio, String descripcion, int categoria) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.marca = marca;
        this.precio = precio;
        this.descripcion = descripcion;
        this.categoria = categoria;
        this.existencia = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getExistencia() {
        return existencia;
    }

    public void setExistencia(int existencia) {
        this.existencia = existencia;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Producto{" + "nombre=" + nombre + ", codigo=" + codigo + ", marca=" + marca + ", precio=" + precio + ", descripcion=" + descripcion + ", existencia=" + existencia + ", categoria=" + categoria + '}';
    }
    
    
}

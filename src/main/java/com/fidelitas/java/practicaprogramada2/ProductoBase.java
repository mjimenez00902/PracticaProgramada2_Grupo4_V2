/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fidelitas.java.practicaprogramada2;

/**
 *
 * @author marcojimenezmena
 */
public abstract class ProductoBase {

    private String codigo;
    private String nombre;
    private double precio;
    private int cantidadInventario;

    //Constructor
    public ProductoBase(String codigo, String nombre, double precio, int cantidadInventario) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidadInventario = cantidadInventario;
    }

    // --- Método Abstractos ---
    
    public abstract double obtenerPrecioFinal();

    // --- Getters y Setters ---

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidadInventario() {
        return cantidadInventario;
    }

    public void setCantidadInventario(int cantidadInventario) {
        this.cantidadInventario = cantidadInventario;
    }
}

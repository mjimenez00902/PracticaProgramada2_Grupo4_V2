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

    private final int codigo;
    private String nombre;
    private double precio;
    private int cantidadInventario;

    //Constructor
    public ProductoBase(int codigo, String nombre, double precio, int cantidadInventario) throws Exception {
        this.codigo = codigo;
        this.setNombre(nombre);
        this.setPrecio(precio);
        this.setCantidadInventario(cantidadInventario);
    }

    // --- Método Abstractos ---
    
    public abstract double obtenerPrecioFinal();

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) throws Exception {
        if (nombre == null || nombre.trim().equals("")) {
            throw new Exception("El nombre no puede estar vacío.");
        }

        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) throws Exception {
        if (precio <= 0) {
            throw new Exception("El precio debe ser mayor que cero.");
        }

        this.precio = precio;
    }

    public int getCantidadInventario() {
        return cantidadInventario;
    }

    public void setCantidadInventario(int cantidadInventario) throws Exception {
        if (cantidadInventario < 0) {
            throw new Exception("La cantidad en inventario no puede ser negativa.");
        }

        this.cantidadInventario = cantidadInventario;
    }
}

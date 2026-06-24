/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fidelitas.java.practicaprogramada2;

/**
 *
 * @author kendr
 */
public class DetalleCarrito {
    
    private Producto producto;
    private int cantidad;
    
    //Constructor
    
    public DetalleCarrito(Producto producto, int cantidad) throws Exception {
        this.producto = producto;
        this.setCantidad(cantidad);
    }
    
    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) throws Exception {
        if (cantidad <= 0) {
            throw new Exception("La cantidad debe ser mayor que cero.");
        }

        this.cantidad = cantidad;
    }

    public double calcularSubtotal() {
        return producto.obtenerPrecioFinal() * cantidad;
    }
    
}

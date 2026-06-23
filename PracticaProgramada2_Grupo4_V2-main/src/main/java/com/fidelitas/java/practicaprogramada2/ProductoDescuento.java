/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fidelitas.java.practicaprogramada2;

/**
 *
 * @author marcojimenezmena
 */
public class ProductoDescuento extends ProductoBase {

    private double porcentajeDescuento;

    //Constructor
    
    public ProductoDescuento(String codigo, String nombre, double precio, 
                             int cantidadInventario, double porcentajeDescuento) {
        super(codigo, nombre, precio, cantidadInventario);
        this.porcentajeDescuento = porcentajeDescuento;
    }
    
    @Override
    public double obtenerPrecioFinal() {
        return getPrecio() - (getPrecio() * (porcentajeDescuento / 100));
    }

    // --- Getters y Setters ---

    public double getPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    public void setPorcentajeDescuento(double porcentajeDescuento) {
        this.porcentajeDescuento = porcentajeDescuento;
    }
}

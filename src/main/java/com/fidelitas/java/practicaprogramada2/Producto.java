/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fidelitas.java.practicaprogramada2;

/**
 *
 * @author marcojimenezmena
 */
public class Producto extends ProductoBase {

    //Constructor
    public Producto(String codigo, String nombre, double precio, int cantidadInventario) {
        super(codigo, nombre, precio, cantidadInventario);
    }

    @Override
    public double obtenerPrecioFinal() {
        return getPrecio(); 
    }
}

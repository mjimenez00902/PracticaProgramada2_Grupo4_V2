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
    public Producto(int codigo, String nombre, double precio, int cantidadInventario) throws Exception {
        super(codigo, nombre, precio, cantidadInventario);
    }

    @Override
    public double obtenerPrecioFinal() {
        return getPrecio();
    }

    @Override
    public String toString() {
        return "Código: " + getCodigo()
                + " | Nombre: " + getNombre()
                + " | Precio: " + getPrecio()
                + " | Precio final: " + obtenerPrecioFinal()
                + " | Inventario: " + getCantidadInventario();
    }
}

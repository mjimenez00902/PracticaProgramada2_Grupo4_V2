/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fidelitas.java.practicaprogramada2;

/**
 *
 * @author elias
 */
public class Medicamento extends ProductoBase {
    
    private boolean requiereReceta;

    public Medicamento(String codigo,
            String nombre,
            double precio,
            int cantidadInventario,
            boolean requiereReceta) {

        super(codigo, nombre, precio, cantidadInventario);
        this.requiereReceta = requiereReceta;
    }

    @Override
    public double obtenerPrecioFinal() {
        return getPrecio();
    }

    public boolean isRequiereReceta() {
        return requiereReceta;
    }

    public void setRequiereReceta(boolean requiereReceta) {
        this.requiereReceta = requiereReceta;
    }

    @Override
    public String toString() {
        return "Medicamento{"
                + "codigo=" + getCodigo()
                + ", nombre=" + getNombre()
                + ", precio=" + getPrecio()
                + ", cantidadInventario=" + getCantidadInventario()
                + ", requiereReceta=" + requiereReceta
                + '}';
    }
}


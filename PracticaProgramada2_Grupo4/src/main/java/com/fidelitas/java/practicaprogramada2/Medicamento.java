/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fidelitas.java.practicaprogramada2;

/**
 *
 * @author elias
 */
public class Medicamento extends Producto {
    
    private boolean requiereReceta;

    public Medicamento(int codigo, String nombre, double precio,
            int cantidadInventario, boolean requiereReceta) throws Exception {

        super(codigo, nombre, precio, cantidadInventario);
        this.requiereReceta = requiereReceta;
    }

    public boolean isRequiereReceta() {
        return requiereReceta;
    }

    public void setRequiereReceta(boolean requiereReceta) {
        this.requiereReceta = requiereReceta;
    }

    @Override
    public String toString() {
        return super.toString()
                + " | Requiere receta: " + requiereReceta;
    }
}


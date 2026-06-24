/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fidelitas.java.practicaprogramada2;

/**
 *
 * @author elias
 */
public class Suplemento extends Producto {
    
    private String tipoVitamina;

    public Suplemento(int codigo, String nombre, double precio,
            int cantidadInventario, String tipoVitamina) throws Exception {

        super(codigo, nombre, precio, cantidadInventario);
        this.tipoVitamina = tipoVitamina;
    }

    public String getTipoVitamina() {
        return tipoVitamina;
    }

    public void setTipoVitamina(String tipoVitamina) {
        this.tipoVitamina = tipoVitamina;
    }

    @Override
    public String toString() {
        return super.toString()
                + " | Tipo vitamina: " + tipoVitamina;
    }
    
}

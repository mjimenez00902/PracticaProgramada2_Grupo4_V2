/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fidelitas.java.practicaprogramada2;

/**
 *
 * @author elias
 */
public class Suplemento extends ProductoBase {
    
    private String tipoVitamina;

    public Suplemento(String codigo,
            String nombre,
            double precio,
            int cantidadInventario,
            String tipoVitamina) {

        super(codigo, nombre, precio, cantidadInventario);
        this.tipoVitamina = tipoVitamina;
    }

    @Override
    public double obtenerPrecioFinal() {
        return getPrecio();
    }

    public String getTipoVitamina() {
        return tipoVitamina;
    }

    public void setTipoVitamina(String tipoVitamina) {
        this.tipoVitamina = tipoVitamina;
    }

    @Override
    public String toString() {
        return "Suplemento{"
                + "codigo=" + getCodigo()
                + ", nombre=" + getNombre()
                + ", precio=" + getPrecio()
                + ", cantidadInventario=" + getCantidadInventario()
                + ", tipoVitamina=" + tipoVitamina
                + '}';
    }
    
}

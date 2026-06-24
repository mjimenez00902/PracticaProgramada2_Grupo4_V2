/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fidelitas.java.practicaprogramada2;

/**
 *
 * @author marcojimenezmena
 */
public class ProductoDescuento extends Producto {

    private double porcentajeDescuento;

    //Constructor
    
    public ProductoDescuento(int codigo, String nombre, double precio,
            int cantidadInventario, double porcentajeDescuento) throws Exception {

        super(codigo, nombre, precio, cantidadInventario);
        this.setPorcentajeDescuento(porcentajeDescuento);
    }
    
    //Polimorfismo
    
    @Override
    public double obtenerPrecioFinal() {
        return getPrecio() - (getPrecio() * porcentajeDescuento / 100);
    }

    public double getPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    public void setPorcentajeDescuento(double porcentajeDescuento) throws Exception {
        if (porcentajeDescuento < 0 || porcentajeDescuento > 100) {
            throw new Exception("El descuento debe estar entre 0 y 100.");
        }

        this.porcentajeDescuento = porcentajeDescuento;
    }

    @Override
    public String toString() {
        return "Código: " + getCodigo()
                + " | Nombre: " + getNombre()
                + " | Precio: " + getPrecio()
                + " | Descuento: " + porcentajeDescuento + "%"
                + " | Precio final: " + obtenerPrecioFinal()
                + " | Inventario: " + getCantidadInventario();
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fidelitas.java.practicaprogramada2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kendr
 */
public class CarritoCompra {
    
    private List<DetalleCarrito> detalles;
    
    public CarritoCompra() {
        this.detalles = new ArrayList<>();
    }
    
    public void agregarProducto(Producto producto, int cantidad) throws Exception {

        if (cantidad <= 0) {
            throw new Exception("La cantidad solicitada debe ser mayor que cero.");
        }

        if (producto.getCantidadInventario() < cantidad) {
            throw new Exception("No hay stock suficiente para ese producto.");
        }

        DetalleCarrito detalleEncontrado = buscarDetalle(producto.getCodigo());

        if (detalleEncontrado == null) {
            detalles.add(new DetalleCarrito(producto, cantidad));
        } else {
            detalleEncontrado.setCantidad(detalleEncontrado.getCantidad() + cantidad);
        }
        
        producto.setCantidadInventario(producto.getCantidadInventario() - cantidad);
    }

    public DetalleCarrito buscarDetalle(int codigo) {

        for (DetalleCarrito detalle : detalles) {
            if (detalle.getProducto().getCodigo() == codigo) {
                return detalle;
            }
        }
        return null;
    }

    public List<DetalleCarrito> getDetalles() {
        return detalles;
    }

    public double calcularTotal() {
        double total = 0;

        for (DetalleCarrito detalle : detalles) {
            total = total + detalle.calcularSubtotal();
        }
        return total;
    }

    public boolean estaVacio() {
        return detalles.isEmpty();
    }

    public void limpiar() {
        detalles.clear();
    }    
}

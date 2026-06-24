/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fidelitas.java.practicaprogramada2;

/**
 *
 * @author kendr
 */
public class Factura {
    
    private CarritoCompra carrito;
    
    public Factura(CarritoCompra carrito) {
        this.carrito = carrito;
    }
    
    public void imprimirRecibo() {

        if (carrito.estaVacio()) {
            System.out.println("No hay productos en el carrito.");
            return;
        }

        System.out.println("\n========== RECIBO FARMACIA SALUD INTEGRAL ==========");

        for (DetalleCarrito detalle : carrito.getDetalles()) {

            Producto producto = detalle.getProducto();

            System.out.println("Producto: " + producto.getNombre());
            System.out.println("Cantidad: " + detalle.getCantidad());
            System.out.println("Precio unitario final: " + producto.obtenerPrecioFinal());
            System.out.println("Subtotal: " + detalle.calcularSubtotal());
            System.out.println("---------------------------------------------------");
        }

        System.out.println("TOTAL A PAGAR: " + carrito.calcularTotal());
        System.out.println("===================================================\n");
    }  
}

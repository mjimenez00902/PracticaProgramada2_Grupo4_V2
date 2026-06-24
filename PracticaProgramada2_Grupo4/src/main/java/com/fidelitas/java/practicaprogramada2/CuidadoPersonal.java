/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fidelitas.java.practicaprogramada2;

/**
 *
 * @author hugob
 */
public class CuidadoPersonal extends Producto {
    
    //atributos
    private String tipoCuidado;
    private String presentacion;

    //constructor
    public CuidadoPersonal(int codigo, String nombre, double precio,
            int cantidadInventario, String tipoCuidado, String presentacion) throws Exception {

        super(codigo, nombre, precio, cantidadInventario);
        this.tipoCuidado = tipoCuidado;
        this.presentacion = presentacion;
    }
    
    //getter and setters

    public String getTipoCuidado() {
        return tipoCuidado;
    }

    public void setTipoCuidado(String tipoCuidado) {
        this.tipoCuidado = tipoCuidado;
    }

    public String getPresentacion() {
        return presentacion;
    }

    public void setPresentacion(String presentacion) {
        this.presentacion = presentacion;
    }

    @Override
    public String toString() {
        return super.toString()
                + " | Tipo cuidado: " + tipoCuidado
                + " | Presentación: " + presentacion;
    }
    
}

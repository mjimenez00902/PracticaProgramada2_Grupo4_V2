/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.fidelitas.java.practicaprogramada2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author kendr
 */
public class PracticaProgramada2 {

    // Scanner para leer datos desde consola
    private static Scanner entrada = new Scanner(System.in);

    // Lista para guardar el inventario completo
    private static List<Producto> inventario = new ArrayList<>();

    // Mapa para buscar productos por código
    private static Map<Integer, Producto> mapaProductos = new HashMap<>();

    // Carrito de compras
    private static CarritoCompra carrito = new CarritoCompra();
    
    public static void main(String[] args) {

        int opcion = 0;

        do {
            mostrarMenu();

            try {
                opcion = leerEntero("Digite una opción: ");

                switch (opcion) {
                    case 1:
                        agregarProductoFarmaceutico();
                        break;

                    case 2:
                        modificarProducto();
                        break;

                    case 3:
                        listarProductos();
                        break;

                    case 4:
                        eliminarProducto();
                        break;

                    case 5:
                        agregarProductoAlCarrito();
                        break;

                    case 6:
                        generarRecibo();
                        break;

                    case 7:
                        System.out.println("Saliendo del sistema...");
                        break;

                    default:
                        System.out.println("Opción inválida.");
                        break;
                }

            } catch (Exception error) {
                System.out.println("Error: " + error.getMessage());

            } finally {
                System.out.println("Operación finalizada.\n");
            }

        } while (opcion != 7);
    }
    
    public static void mostrarMenu() {
        System.out.println("========== FARMACIA SALUD INTEGRAL ==========");
        System.out.println("1. Agregar producto farmacéutico");
        System.out.println("2. Modificar producto");
        System.out.println("3. Listar productos");
        System.out.println("4. Eliminar producto");
        System.out.println("5. Agregar producto al carrito");
        System.out.println("6. Generar recibo");
        System.out.println("7. Salir");
        System.out.println("=============================================");
    }
    
    public static void agregarProductoFarmaceutico() throws Exception {

        System.out.println("\n--- Agregar producto farmacéutico ---");
        System.out.println("1. Producto normal");
        System.out.println("2. Producto con descuento");
        System.out.println("3. Medicamento");
        System.out.println("4. Vitamina o suplemento");
        System.out.println("5. Cuidado personal");

        int tipo = leerEntero("Seleccione el tipo de producto: ");
        int codigo = leerEntero("Código: ");
      
        if (mapaProductos.containsKey(codigo)) {
            throw new Exception("Ya existe un producto con ese código.");
        }
        
        String nombre = leerTexto("Nombre: ");
        double precio = leerDouble("Precio: ");
        int cantidadInventario = leerEntero("Cantidad en inventario: ");

        Producto productoNuevo;

        switch (tipo) {
            case 1:
                productoNuevo = new Producto(codigo, nombre, precio, cantidadInventario);
                break;

            case 2:
                double descuento = leerDouble("Porcentaje de descuento: ");
                productoNuevo = new ProductoDescuento(codigo, nombre, precio, cantidadInventario, descuento);
                break;

            case 3:
                boolean requiereReceta = leerBooleano("¿Requiere receta? S/N: ");
                productoNuevo = new Medicamento(codigo, nombre, precio, cantidadInventario, requiereReceta);
                break;

            case 4:
                String tipoVitamina = leerTexto("Tipo de vitamina o suplemento: ");
                productoNuevo = new Suplemento(codigo, nombre, precio, cantidadInventario, tipoVitamina);
                break;

            case 5:
                String tipoCuidado = leerTexto("Tipo de cuidado: ");
                String presentacion = leerTexto("Presentación: ");
                productoNuevo = new CuidadoPersonal(codigo, nombre, precio, cantidadInventario, tipoCuidado, presentacion);
                break;

            default:
                throw new Exception("Tipo de producto inválido.");
        }
        
        inventario.add(productoNuevo);
        mapaProductos.put(codigo, productoNuevo);

        System.out.println("Producto agregado correctamente.");
    }

    public static void modificarProducto() throws Exception {

        System.out.println("\n--- Modificar producto ---");
        int codigo = leerEntero("Digite el código del producto: ");

        Producto producto = mapaProductos.get(codigo);

        if (producto == null) {
            throw new Exception("El producto no existe.");
        }

        System.out.println("Producto encontrado: " + producto);
        System.out.println("1. Modificar nombre");
        System.out.println("2. Modificar precio");
        System.out.println("3. Modificar cantidad en inventario");
        System.out.println("4. Modificar descuento");

        int opcion = leerEntero("Seleccione qué desea modificar: ");

        switch (opcion) {
            case 1:
                String nombre = leerTexto("Nuevo nombre: ");
                producto.setNombre(nombre);
                break;

            case 2:
                double precio = leerDouble("Nuevo precio: ");
                producto.setPrecio(precio);
                break;

            case 3:
                int cantidad = leerEntero("Nueva cantidad en inventario: ");
                producto.setCantidadInventario(cantidad);
                break;

            case 4:
                if (producto instanceof ProductoDescuento) {
                    double descuento = leerDouble("Nuevo porcentaje de descuento: ");

                    ProductoDescuento productoDescuento = (ProductoDescuento) producto;
                    productoDescuento.setPorcentajeDescuento(descuento);

                } else {
                    throw new Exception("Este producto no tiene descuento.");
                }
                break;

            default:
                throw new Exception("Opción inválida.");
        }

        System.out.println("Producto modificado correctamente.");
    }

    public static void listarProductos() {

        System.out.println("\n--- Lista de productos ---");

        if (inventario.isEmpty()) {
            System.out.println("No hay productos registrados.");
            return;
        }

        for (Producto producto : inventario) {
            System.out.println(producto);
        }
    }

    public static void eliminarProducto() throws Exception {

        System.out.println("\n--- Eliminar producto ---");
        int codigo = leerEntero("Digite el código del producto: ");

        Producto producto = mapaProductos.get(codigo);

        if (producto == null) {
            throw new Exception("El producto no existe.");
        }
        
        inventario.remove(producto);
        mapaProductos.remove(codigo);

        System.out.println("Producto eliminado correctamente.");
    }

    public static void agregarProductoAlCarrito() throws Exception {

        System.out.println("\n--- Agregar producto al carrito ---");
        int codigo = leerEntero("Digite el código del producto: ");

        Producto producto = mapaProductos.get(codigo);

        if (producto == null) {
            throw new Exception("El producto no existe.");
        }

        int cantidad = leerEntero("Cantidad a comprar: ");
        
        carrito.agregarProducto(producto, cantidad);

        System.out.println("Producto agregado al carrito correctamente.");
    }

    public static void generarRecibo() {

        System.out.println("\n--- Generar recibo ---");

        Factura factura = new Factura(carrito);
        factura.imprimirRecibo();
        
        if (!carrito.estaVacio()) {
            carrito.limpiar();
            System.out.println("Compra finalizada. El carrito quedó vacío.");
        }
    }

    public static int leerEntero(String mensaje) throws Exception {
        System.out.print(mensaje);
        String texto = entrada.nextLine();

        return Integer.parseInt(texto);
    }

    public static double leerDouble(String mensaje) throws Exception {
        System.out.print(mensaje);
        String texto = entrada.nextLine();

        return Double.parseDouble(texto);
    }

    public static String leerTexto(String mensaje) throws Exception {
        System.out.print(mensaje);
        String texto = entrada.nextLine();

        if (texto.trim().equals("")) {
            throw new Exception("El texto no puede estar vacío.");
        }

        return texto;
    }

    public static boolean leerBooleano(String mensaje) throws Exception {
        System.out.print(mensaje);
        String texto = entrada.nextLine();

        if (texto.equalsIgnoreCase("S")) {
            return true;

        } else if (texto.equalsIgnoreCase("N")) {
            return false;

        } else {
            throw new Exception("Debe digitar S o N.");
        }
    }
}

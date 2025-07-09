/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller15.Ejercicio;

public class MainProducto {
    public static void main(String[] args) {
        Producto producto = new Producto("Camiseta", 50000);

        EtiquetaService etiquetaService = new EtiquetaService();
        PrecioService precioService = new PrecioService();

        etiquetaService.generarEtiqueta(producto);

        double precioFinal = precioService.calcularPrecioConIVA(producto);
        System.out.println("Precio con IVA: $" + precioFinal);
    }
}


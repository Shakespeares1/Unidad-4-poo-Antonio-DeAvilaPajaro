/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller15.Ejercicio;

public class EtiquetaService {
    public void generarEtiqueta(Producto producto) {
        System.out.println("=== Etiqueta del Producto ===");
        System.out.println("Nombre: " + producto.getNombre());
        System.out.println("Precio: $" + producto.getPrecio());
    }
}


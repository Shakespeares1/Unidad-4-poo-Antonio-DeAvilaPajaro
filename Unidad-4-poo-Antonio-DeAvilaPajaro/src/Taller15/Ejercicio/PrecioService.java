/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller15.Ejercicio;

public class PrecioService {
    public double calcularPrecioConIVA(Producto producto) {
        return producto.getPrecio() * 1.19; // 19% de IVA
    }
}


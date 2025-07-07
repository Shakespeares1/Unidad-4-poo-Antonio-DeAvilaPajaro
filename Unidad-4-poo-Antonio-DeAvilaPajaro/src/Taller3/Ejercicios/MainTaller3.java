/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller3.Ejercicios;

public class MainTaller3 {
    public static void main(String[] args) {
        // Crear un producto
        Producto producto1 = new Producto("Laptop", 3500000, 10);

        // Mostrar información inicial
        producto1.mostrarInformacion();

        // Modificar algunos valores con los métodos set
        producto1.setPrecio(3200000);
        producto1.setStock(15);

        // Mostrar información actualizada
        System.out.println("\n--- Despues de modificar ---");
        producto1.mostrarInformacion();
    }
}


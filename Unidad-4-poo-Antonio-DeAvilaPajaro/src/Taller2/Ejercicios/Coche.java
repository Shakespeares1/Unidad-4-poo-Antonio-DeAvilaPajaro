/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller2.Ejercicios;

public class Coche extends Vehiculo {
    String marca;

    public Coche(String tipo, String marca) {
        super(tipo); // Llama al constructor de Vehiculo
        this.marca = marca;
    }

    public void mostrarDetalles() {
        mostrarTipo(); // Llama al método de la clase padre
        System.out.println("Marca del coche: " + marca);
    }
}


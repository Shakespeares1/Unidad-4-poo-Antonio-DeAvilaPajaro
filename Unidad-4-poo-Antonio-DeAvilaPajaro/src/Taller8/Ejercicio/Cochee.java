/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller8.Ejercicio;

public class Cochee extends Vehiculo {
    public Cochee(String marca) {
        super(marca);
    }

    public void mostrarMarca() {
        // Esto causará un error porque 'marca' es private
        System.out.println("Marca: " + marca);
    }
}

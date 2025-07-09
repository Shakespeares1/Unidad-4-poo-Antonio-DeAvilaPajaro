/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller10.Ejercicio;

public class MainVehiculo {
    public static void main(String[] args) {
        Vehiculo vehiculo = new Vehiculo();
        Vehiculo bicicleta = new Bicicleta(); // Polimorfismo

        vehiculo.moverse();    // El vehículo se está moviendo.
        bicicleta.moverse();   // La bicicleta avanza pedaleando.
    }
}

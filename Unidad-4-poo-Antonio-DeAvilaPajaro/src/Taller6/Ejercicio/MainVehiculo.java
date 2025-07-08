/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller6.Ejercicio;

public class MainVehiculo {
    public static void main(String[] args) {
        Moto moto = new Moto("Deportiva", "Yamaha", 600);
        moto.mostrarInformacion();

        // Acceso directo desde clase no heredada
        // System.out.println(moto.tipo); // Esto compila porque está en el mismo paquete
    }
}


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller4.Ejercicios;

public class MainCoche {
    public static void main(String[] args) {
        Coche miCoche = new Coche("Toyota", "Corolla", 180);

        // Acceso correcto mediante métodos públicos
        System.out.println("Marca: " + miCoche.getMarca());
        System.out.println("Modelo: " + miCoche.getModelo());
        System.out.println("Velocidad Maxima inicial: " + miCoche.getVelocidadMaxima());

        // Acelerar correctamente
        miCoche.acelerar(20);

        // Intento de acceso directo a atributos privados (comentado porque generaría error)
        // System.out.println(miCoche.velocidadMaxima); // Error: velocidadMaxima has private access
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller4.Ejercicios;

public class MainCoche {
    public static void main(String[] args) {
        Coche miCoche = new Coche("Toyota", "Corolla", 180);

        // Esto causaría error si lo descomentas, ya que los atributos son privados:
        // System.out.println(miCoche.marca);

        // Acceso correcto mediante getters
        System.out.println("Marca: " + miCoche.getMarca());
        System.out.println("Modelo: " + miCoche.getModelo());
        System.out.println("Velocidad Máxima: " + miCoche.getVelocidadMaxima());

        miCoche.acelerar(20);
        System.out.println("Nueva Velocidad Máxima: " + miCoche.getVelocidadMaxima());
    }
}

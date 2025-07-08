/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller3.Ejercicios;

public class MainCoche {
    public static void main(String[] args) {
        Coche c1 = new Coche("Toyota", "Corolla");
        Coche c2 = new Coche("Honda", "Civic");
        Coche c3 = new Coche("Ford", "Focus");

        c1.mostrarInfo();
        c2.mostrarInfo();
        c3.mostrarInfo();

        // Mostrar contador
        Coche.mostrarContador();
    }
}

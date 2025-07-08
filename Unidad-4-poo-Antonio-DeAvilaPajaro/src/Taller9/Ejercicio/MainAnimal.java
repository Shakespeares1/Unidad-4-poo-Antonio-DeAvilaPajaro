/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller9.Ejercicio;

public class MainAnimal {
    public static void main(String[] args) {
        Pez pez1 = new Pez("Pez Payaso", "Agua salada");
        Pez pez2 = new Pez("Pez Dorado", "Agua dulce");

        pez1.mostrarEspecie();
        System.out.println();
        pez2.mostrarEspecie();
    }
}

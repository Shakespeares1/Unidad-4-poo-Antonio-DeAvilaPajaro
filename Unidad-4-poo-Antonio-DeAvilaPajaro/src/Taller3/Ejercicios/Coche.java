/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller3.Ejercicios;

public class Coche {
    private String marca;
    private String modelo;
    private static int contadorCoches = 0;

    public Coche(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        contadorCoches++;
    }

    public void mostrarInfo() {
        System.out.println("Marca: " + marca + ", Modelo: " + modelo);
    }

    public static void mostrarContador() {
        System.out.println("Coches creados: " + contadorCoches);
    }
}

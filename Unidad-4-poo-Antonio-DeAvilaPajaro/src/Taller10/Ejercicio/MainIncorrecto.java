/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller10.Ejercicio;

public class MainIncorrecto {
    public static void main(String[] args) {
        IncorrectoFirma obj = new HijoIncorrectoFirma();
        obj.saludar("Antonio"); // Llama al método de la clase padre, no al hijo
    }
}

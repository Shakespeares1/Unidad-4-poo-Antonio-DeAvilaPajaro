/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller8.Ejercicio;

public class MainPrueba {
    public static void main(String[] args) {
        // Descomenta cada línea una por una para probar los errores
        
        // Error 1: Herencia múltiple no permitida
        // ClaseC objC = new ClaseC();
        // objC.metodoA();
        // objC.metodoB();

        // Error 2: Acceso a atributo privado en subclase
        Cochee cochee = new Cochee("Toyota");
        cochee.mostrarMarca();
    }
}


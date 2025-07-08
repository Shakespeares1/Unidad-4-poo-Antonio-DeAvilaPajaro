/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller5.personas;

public class MainPersona {
    public static void main(String[] args) {
        Persona p = new Persona("Antonio", 28);
        
        // Accedemos mediante getters y directamente al atributo default
        System.out.println("Nombre (usando getter): " + p.getNombre());
        System.out.println("Edad (default): " + p.edad);

        // Probamos el método mostrarInfo
        p.mostrarInfo();
    }
}


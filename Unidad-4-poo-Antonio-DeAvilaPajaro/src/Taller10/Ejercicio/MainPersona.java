/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller10.Ejercicio;

public class MainPersona {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        Persona estudiante = new Estudiante();
        Persona profesor = new Profesor();

        persona1.presentarse();      // Salida: Hola, soy una persona.
        estudiante.presentarse();    // Salida: Hola, soy un estudiante.
        profesor.presentarse();      // Salida: Hola, soy un profesor.
    }
}


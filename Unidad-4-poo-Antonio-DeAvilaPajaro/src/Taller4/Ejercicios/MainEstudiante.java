/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller4.Ejercicios;

public class MainEstudiante {
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante("Antonio", 27, 4.5);
        System.out.println("Nombre: " + estudiante1.getNombre());
        System.out.println("Edad: " + estudiante1.getEdad());
        System.out.println("Nota promedio: " + estudiante1.getNotaPromedio());

        // Probando validación
        estudiante1.setEdad(-10);  // No debe cambiar la edad
        estudiante1.setNotaPromedio(6);  // No debe cambiar la nota

        System.out.println("\nDespues de intentar valores invalidos:");
        System.out.println("Edad: " + estudiante1.getEdad());  // Debe seguir siendo 21
        System.out.println("Nota promedio: " + estudiante1.getNotaPromedio());  // Debe seguir siendo 4.5
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller1.Ejercicios;

public class EjercicioEstudiante {
    private String nombre;
    private int edad;
    private String curso;

    // Constructor por defecto
    public EjercicioEstudiante() {
        this.nombre = "Sin nombre";
        this.edad = 0;
        this.curso = "Sin asignar";
    }

    // Constructor con nombre y edad
    public EjercicioEstudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.curso = "Sin asignar";
    }

    // Constructor completo que usa this()
    public EjercicioEstudiante(String nombre, int edad, String curso) {
        this(nombre, edad); // Llama al constructor anterior
        this.curso = curso;
    }

    // Método para mostrar datos
    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Curso: " + curso);
    }

    // Método main para probar los constructores
    public static void main(String[] args) {
        EjercicioEstudiante estudiante1 = new EjercicioEstudiante();
        EjercicioEstudiante estudiante2 = new EjercicioEstudiante("Antonio luis", 20);
        EjercicioEstudiante estudiante3 = new EjercicioEstudiante("Kiara polo", 22, "POO");

        System.out.println("Estudiante 1:");
        estudiante1.mostrarDatos();
        System.out.println();

        System.out.println("Estudiante 2:");
        estudiante2.mostrarDatos();
        System.out.println();

        System.out.println("Estudiante 3:");
        estudiante3.mostrarDatos();
    }
}

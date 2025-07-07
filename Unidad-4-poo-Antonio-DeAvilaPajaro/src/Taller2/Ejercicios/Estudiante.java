/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller2.Ejercicios;

public class Estudiante extends Persona {
    private String curso;

    public Estudiante(String nombre, int edad, String curso) {
        super(nombre, edad); // llama al constructor de Persona
        this.curso = curso;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos(); // llama al método de Persona
        System.out.println("Curso: " + curso);
    }
}

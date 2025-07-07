/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller2.Ejercicios;

public class Programador extends Empleado {
    String lenguaje;

    public Programador(String nombre, double salario, String lenguaje) {
        super(nombre, salario); // Llama al constructor de Empleado
        this.lenguaje = lenguaje;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos(); // Llama al método de Empleado
        System.out.println("Lenguaje de programacion: " + lenguaje);
    }
}

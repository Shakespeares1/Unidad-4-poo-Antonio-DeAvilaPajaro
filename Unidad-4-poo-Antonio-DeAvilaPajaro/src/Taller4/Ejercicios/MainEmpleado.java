/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller4.ejercicios;

public class MainEmpleado {
    public static void main(String[] args) {
        Empleado e = new Empleado();
        // Acceso directo al atributo privado (esto causará error de compilación)
        System.out.println("Salario: " + e.salario);
    }
}


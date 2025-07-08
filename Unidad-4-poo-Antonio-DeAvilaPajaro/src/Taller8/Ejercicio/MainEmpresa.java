/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller8.Ejercicio;

public class MainEmpresa {
    public static void main(String[] args) {
        Empleado empleado = new Empleado("Carlos", 2500000);
        Gerente gerente = new Gerente("Antonio", 5800000, "Ingeniería de Software");

        System.out.println("=== Empleado ===");
        empleado.mostrarDetalles();

        System.out.println("\n=== Gerente ===");
        gerente.mostrarDetalles();
    }
}

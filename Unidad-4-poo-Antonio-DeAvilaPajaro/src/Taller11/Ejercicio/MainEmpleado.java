/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller11.Ejercicio;

public class MainEmpleado {
    public static void main(String[] args) {
        Empleado gerente = new Gerente("Carlos", 5000000, 2000000);
        Empleado vendedor = new Vendedor("Laura", 3000000, 1500000);

        gerente.mostrarDetalles();
        System.out.println("------------------------");
        vendedor.mostrarDetalles();
    }
}

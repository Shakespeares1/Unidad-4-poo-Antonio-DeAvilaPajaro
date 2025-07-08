/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller7.Ejercicio;

public class MainEmpresa {
    public static void main(String[] args) {
        Empleado emp = new Empleado("Antonio", 4200000);

        // Acceso directo a propiedad pública
        System.out.println("Nombre del empleado: " + emp.nombre);

        // Acceso a través de métodos públicos
        System.out.println("Salario actual: " + emp.getSalario());

        emp.setSalario(5000000);
        emp.mostrarInformacion();
    }
}


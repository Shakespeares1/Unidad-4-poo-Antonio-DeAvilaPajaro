/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller2.Ejercicios;

public class EjemploThis {

    String nombre = "Antonio";

    // ❌ Este método da error porque no se puede usar 'this' en métodos static
    /*
    public static void mostrarNombreIncorrecto() {
        // Esto causará error de compilación
        System.out.println("Nombre: " + this.nombre);
    }
    */

    // ✅ Método correcto: no es estático, y sí puede usar 'this'
    public void mostrarNombreCorrecto() {
        System.out.println("Nombre (usando this correctamente): " + this.nombre);
    }

    public static void main(String[] args) {
        // ⚠️ Si descomentas esta línea, el programa no compilará por el error en el método static
        // mostrarNombreIncorrecto();

        // ✔️ Forma correcta de usar 'this'
        EjemploThis ejemplo = new EjemploThis();
        ejemplo.mostrarNombreCorrecto();
    }
}


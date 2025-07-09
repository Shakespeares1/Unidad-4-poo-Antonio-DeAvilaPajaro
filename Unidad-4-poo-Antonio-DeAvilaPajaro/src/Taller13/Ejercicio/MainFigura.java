/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller13.Ejercicio;

public class MainFigura {
    public static void main(String[] args) {
        Figura rect = new Rectangulo(10, 5);
        Figura tri = new Triangulo(8, 4);

        rect.mostrarFigura();
        System.out.println("Área del rectángulo: " + rect.calcularArea());

        tri.mostrarFigura();
        System.out.println("Área del triángulo: " + tri.calcularArea());
    }
}


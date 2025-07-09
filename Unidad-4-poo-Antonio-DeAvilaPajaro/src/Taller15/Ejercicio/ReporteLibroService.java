/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller15.Ejercicio;

public class ReporteLibroService {
    public void generarReporte(Libro libro) {
        System.out.println("==== Reporte del Libro ====");
        System.out.println("Título: " + libro.getTitulo());
        System.out.println("Autor: " + libro.getAutor());
        System.out.println("Páginas: " + libro.getPaginas());
    }
}

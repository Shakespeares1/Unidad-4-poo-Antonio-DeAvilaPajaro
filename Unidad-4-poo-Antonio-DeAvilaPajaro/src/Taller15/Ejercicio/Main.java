/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller15.Ejercicio;

public class Main {
    public static void main(String[] args) {
        Libro libro = new Libro("El Principito", "Antoine de Saint-Exupéry", 96);

        ReporteLibroService reporteService = new ReporteLibroService();
        PersistenciaLibroService persistenciaService = new PersistenciaLibroService();

        reporteService.generarReporte(libro);
        persistenciaService.guardarLibro(libro);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller1.Ejercicios;

public class EjercicioLibro {
    private String titulo;
    private String autor;
    private int numeroPaginas;

    // Constructor por defecto
    public EjercicioLibro() {
        this.titulo = "Sin titulo";
        this.autor = "Desconocido";
        this.numeroPaginas = 0;
    }

    // Constructor parametrizado
    public EjercicioLibro(String titulo, String autor, int numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    // Método para mostrar los detalles
    public void mostrarDetalles() {
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Numero de paginas: " + numeroPaginas);
    }

    // Método main para probar los constructores
    public static void main(String[] args) {
        EjercicioLibro libro1 = new EjercicioLibro(); // Constructor por defecto
        EjercicioLibro libro2 = new EjercicioLibro("Cuando las rectas se vuelven curvas", "Joan Gomez", 151); // Constructor parametrizado

        System.out.println("Libro 1:");
        libro1.mostrarDetalles();

        System.out.println("\nLibro 2:");
        libro2.mostrarDetalles();
    }
}


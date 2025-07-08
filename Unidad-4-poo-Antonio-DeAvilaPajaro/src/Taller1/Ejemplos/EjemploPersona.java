/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller1.Ejemplos;

/**
 *
 * @author Anton
 */
public class EjemploPersona {
    String nombre;
    
    // Constructor
    public EjemploPersona(){
        nombre = "Sin nombre";
    }
    // Para Mostrar nombre
    public void mostrarNombre() {
        System.out.println("nombre: " + nombre);
    }
    
    // metodo main para probar
    
    public static void main (String[] args){
        EjemploPersona persona = new EjemploPersona();
        persona.mostrarNombre();
    }
}

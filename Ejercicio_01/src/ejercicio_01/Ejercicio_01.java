/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_01;

import Entidad.Libro;
import java.util.Scanner;

/**
 *
 * @author Martin
 */

//Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
//Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
//constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y
//luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
//numero de páginas. 


public class Ejercicio_01 {


    /**
     * @param args the command line arguments
     */
    
    Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        // TODO code application logic here

        Libro libro01 = new Libro();

        libro01.cargarLibro();
        System.out.println("");
        libro01.mostrarLibro();
    }
    
}

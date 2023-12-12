/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author Martin
 */

//Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
//Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
//constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y
//luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
//numero de páginas. 

import java.util.Scanner;



public class Libro {
    
        Scanner entrada = new Scanner(System.in);

    private int ISBN;
    public String titulo;
    private String autor;
    private int numPag;

    public Libro() {

    }

    public Libro( int ISBN, String titulo, String autor, int numPag) {
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
        this.numPag = numPag;
    }
    
    public void cargarLibro() {
        System.out.println("ISBN del libro");
        ISBN = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Titulo del libro");
        titulo = entrada.nextLine();
        System.out.println("Autor del libro");
        autor = entrada.nextLine();
        System.out.println("cantidad de paginas del libro");
        numPag = entrada.nextInt();
    }
    
        public void mostrarLibro() {
        System.out.println("ISBN del libro es "+ISBN);
        System.out.println("Titulo del libro es "+titulo);
        System.out.println("Autor del libro es "+autor);
        System.out.println("cantidad de paginas que tiene el libro son "+numPag);
    }
    
    

 @Override
    public String toString() {
        return "Libro {" + "\n ISBN = " + ISBN + ", \n titulo = " + titulo + ", \n autor = " + autor + ", \n numPaginas = " + numPag + "\n }";
    }

}









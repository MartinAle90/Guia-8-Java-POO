/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioextra_01;

import Entidad.Cancion;
import java.util.Scanner;

/**
 *
 * @author Martin
 */
public class EjercicioExtra_01 {

    /**
     * @param args the command line arguments
     */
    static Scanner entrada = new Scanner(System.in);
    
//    Desarrollar una clase Cancion con los siguientes atributos: titulo y autor. Se deberá́
//definir además dos constructores: uno vacío que inicializa el titulo y el autor a cadenas
//vacías y otro que reciba como parámetros el titulo y el autor de la canción. Se deberán
//además definir los métodos getters y setters correspondientes. 
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Cancion cancion01 = new Cancion();
        System.out.println("Ingrese el nombre de autor de la cancion");
        cancion01.setAutor(entrada.nextLine());
        System.out.println("Ingrese el titulo de la cancion");
        cancion01.setTitulo(entrada.nextLine());
        System.out.println("");
        System.out.println(cancion01.toString());
        System.out.println("");
    }
    
}

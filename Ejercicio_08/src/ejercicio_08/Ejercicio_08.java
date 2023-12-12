/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_08;

import Entidad.Cadena;
import Servicio.ServicioCadena;
import java.util.Scanner;

/**
 *
 * @author Martin
 */
public class Ejercicio_08 {

    /**
     * @param args the command line arguments
     */
    
    static Scanner entrada = new Scanner(System.in);
    
//    En el main se creará el objeto y se le pedirá al usuario que ingrese
//una frase que puede ser una palabra o varias palabras separadas por un espacio en
//blanco y a través de los métodos set, se guardará la frase y la longitud de manera
//automática según la longitud de la frase ingresada. Deberá además implementar los
//siguientes métodos: 
    
    public static void main(String[] args) {
        // TODO code application logic here
        ServicioCadena sc = new ServicioCadena();
        Cadena cad1 = new Cadena();
        System.out.println("Ingrese una nueva frase");
        cad1.setFrase(entrada.nextLine());
        cad1.setFraseLongitud(cad1.getFrase().length());
        System.out.println("");
        sc.mostrarVocales(cad1);
        System.out.println("");
        sc.invertirFrase(cad1);
        System.out.println("");
        System.out.println("ingrese un caracter a buscar en la frase");
        String caracter = entrada.nextLine();
        System.out.println("");
        sc.vecesRepetido(caracter, cad1);
        System.out.println("");
        System.out.println("Ingrese una nueva frase");
        String frase = entrada.nextLine();
        System.out.println("");
        sc.compararLongitud(cad1, frase);
        System.out.println("");
        sc.unirFrases(cad1, frase);
        
    }
    
}

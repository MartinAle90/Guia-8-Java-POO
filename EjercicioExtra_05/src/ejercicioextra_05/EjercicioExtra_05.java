/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioextra_05;

import Entidad.Arreglo;
import java.util.Scanner;

/**
 *
 * @author Martin
 */
public class EjercicioExtra_05 {

    /**
     * @param args the command line arguments
     */
    
    static Scanner entrada = new Scanner(System.in);
    
    public static void main(String[] args) {
        // TODO code application logic here

        Arreglo arreglo1 = new Arreglo();

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String adivina;

        do {
            System.out.println("Adivina cual es el mes secreto");
            adivina = leer.next();

            if (adivina.equalsIgnoreCase(arreglo1.getMesSecreto())) {
                System.out.println("Joya, era ese");
            } else {
                System.out.println("No era ese, try again");
            }
        } while (!adivina.equalsIgnoreCase(arreglo1.getMesSecreto()));
    }
    
}

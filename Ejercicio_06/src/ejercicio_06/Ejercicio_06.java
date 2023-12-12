/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_06;

import Entidad.Cafetera;
import Servicio.ServicioCafetera;
import java.util.Scanner;

/**
 *
 * @author Martin
 */
public class Ejercicio_06 {

    /**
     * @param args the command line arguments
     */
    
    static Scanner entrada = new Scanner(System.in);
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        ServicioCafetera sc = new ServicioCafetera();
        Cafetera cafetera1 = sc.crearCafetera();
        
        sc.llenarCafetera(cafetera1);
        
        System.out.println("ingrese el tamaño de la taza vacia");
        int taza = entrada.nextInt();
        sc.servirTaza(cafetera1, taza);
        
        System.out.println("ingrese el tamaño de la taza vacia");
        taza = entrada.nextInt();
        sc.servirTaza(cafetera1, taza);

        System.out.println("Ingrese la cantidad de cafe");
        int cafe = entrada.nextInt();
        sc.agregarCafe(cafetera1, cafe);
        
    }
    
}

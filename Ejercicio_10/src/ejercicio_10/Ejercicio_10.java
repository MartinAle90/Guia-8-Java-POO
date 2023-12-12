/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_10;

import Servicio.ServicioArreglo;
import java.lang.reflect.Array;
import java.util.Arrays;

/**
 *
 * @author Martin
 */
public class Ejercicio_10 {

    /**
     * @param args the command line arguments
     */
    
//    Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo A
//de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
//programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla.
//Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 números
//ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor
//0.5. Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado de
//20. 


    public static void main(String[] args) {
        // TODO code application logic here
        
        ServicioArreglo sa = new ServicioArreglo();
        
        double [] arrayA = new double[50];
        double [] arrayB = new double[20];
        
        sa.llenarArray(arrayA);
        sa.llenarArray(arrayB);
        sa.mostrarArray(arrayA);
        sa.mostrarArray(arrayB);
        System.out.println("");
        Arrays.sort(arrayA, 0, 49);
        sa.mostrarArray(arrayA);
        System.out.println("");
        Arrays.fill(arrayB, 0.5);
        sa.mostrarArray(arrayB);
        System.out.println("");
        System.arraycopy(arrayA, 0, arrayB, 0, 10);
        sa.mostrarArray(arrayA);
        sa.mostrarArray(arrayB);

    }
    
}

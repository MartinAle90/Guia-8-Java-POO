/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_11;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Martin
 */

//Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con la
//clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la clase
//Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le pedirán al
//usuario para poner el constructor del objeto Date. Una vez creada la fecha de tipo Date,
//deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la fecha actual, que
//se puede conseguir instanciando un objeto Date con constructor vacío.
//Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
//Ejemplo fecha actual: Date fechaActual = new Date(); 

public class Ejercicio_11 {

    /**
     * @param args the command line arguments
     */
    static Scanner entrada = new Scanner(System.in);
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        int dia;
        int mes;
        int anio;
        
        System.out.println("Ingrese el dia");
        dia = entrada.nextInt();

        System.out.println("Ingrese el mes");
        mes = entrada.nextInt();

        System.out.println("Ingrese el año");
        anio = entrada.nextInt();
        
        Date fechaIngresada = new Date(anio-1900, mes-1, dia);
        Date fechaActual = new Date();
        System.out.println(fechaIngresada);
        System.out.println(fechaActual);
        
        int anioCalculado = fechaActual.getYear()-fechaIngresada.getYear();
        System.out.println("Pasaron "+anioCalculado+" años");
        
        
        
    }
    
}

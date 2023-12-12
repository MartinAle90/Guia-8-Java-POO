/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Persona;
import java.util.Scanner;

/**
 *
 * @author Martin
 */

//Metodo crearPersona(): el método crear persona, le pide los valores de los atributos
//al usuario y después se le asignan a sus respectivos atributos para llenar el objeto
//Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o
//O. Si no es correcto se deberá mostrar un mensaje

public class ServicioPersona {
    
    static Scanner entrada = new Scanner(System.in);
    
    public Persona crearPersona(){
        
        Persona gente = new Persona();
        char sex;
        System.out.println("ingrese su nombre");
        gente.setNombre(entrada.nextLine());
        System.out.println("ingrese su edad");
        gente.setEdad(entrada.nextInt());
        do {
            System.out.println("ingrese su sexo (H: Hombre; M: Mujer; O: Otro)");
            sex = entrada.next().charAt(0);
            sex = Character.toUpperCase(sex);
        } while (sex!='H' && sex!='M' && sex!='O');
        gente.setSexo(sex);
        System.out.println("ingrese su peso");
        gente.setPeso(entrada.nextInt());
        System.out.println("ingrese su altura en mts");
        gente.setAltura(entrada.nextDouble());
        
        return gente;
    }
    
    // Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
//kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20,
//significa que la persona está por debajo de su peso ideal y la función devuelve un -1.
//Si la fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la
//persona está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado
//de la fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
//función devuelve un 1.
    public int calcularIMC(Persona gente) {

        double imc = (gente.getPeso() / Math.pow(gente.getAltura(), 2));
        int imcF;
        
        if (imc < 20) {
            imcF = -1;
        } else if (imc >= 20 && imc <= 25) {
            imcF = 0;
        } else {
            imcF = 1;
        }
        
        return imcF;
    }
    
    // Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
//devuelve un booleano. 
    public boolean esMayorDeEdad(Persona gente) {

        boolean mayor = false;
        
        if (gente.getEdad() >= 18) {
            mayor = true;
        }
        
        return mayor;
    }
    
}

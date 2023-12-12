/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author Martin
 */
public class ServicioRectangulo {
    
    Scanner entrada = new Scanner(System.in);
    
    public Rectangulo crearRectangulo(){
        
        Rectangulo rect1 = new Rectangulo();
        
        System.out.println("Ingrese la base del rectangulo");
        int base = entrada.nextInt();
        System.out.println("Ingrese la altura del rectangulo");
        int altura = entrada.nextInt();
        
        rect1.setBase(base);
        rect1.setAltura(altura);
        
        return rect1;
    }

    public int calcularSuperficie(Rectangulo rect1) {
        return (rect1.getBase() * rect1.getAltura());
    }

    public int calcularPerimetro(Rectangulo rect1) {
        return (rect1.getBase() + rect1.getBase() + rect1.getAltura() + rect1.getAltura());
    }

    public void dibujarRectangulo(Rectangulo rect1) {
        int b = rect1.getBase();
        int a = rect1.getAltura();
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                if (i == 0 || i == a - 1) {
                    System.out.print("* ");
                } else {
                    if (j == 0 || j == b - 1) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
            }
            System.out.println("");
        }
    } 
    
}

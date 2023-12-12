/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Puntos;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Martin
 */
public class ServicioPuntos {
    
    static Scanner entrada = new Scanner(System.in);
    
    public Puntos crearPuntos(){
        
        Puntos ptos = new Puntos();
        System.out.println("Ingrese la posicion X del punto 1");
        ptos.setX1(entrada.nextInt());
        System.out.println("Ingrese la posicion Y del punto 1");
        ptos.setY1(entrada.nextInt());
        System.out.println("Ingrese la posicion X del punto 2");
        ptos.setX2(entrada.nextInt());
        System.out.println("Ingrese la posicion Y del punto 2");
        ptos.setY2(entrada.nextInt());
        return ptos;
    }
    
//    Después, a través de otro método calcular y devolver la distancia
//que existe entre los dos puntos que existen en la clase Puntos.
    
    public void calcularDistancia(Puntos ptos){
        
        DecimalFormat df = new DecimalFormat("0.00");
        
        double xFinal;
        double yFinal;
        if (ptos.getX1()>ptos.getX2()) {
          xFinal = ptos.getX1() - ptos.getX2();
        }else{
            xFinal = ptos.getX2() - ptos.getX1();
        }
        if (ptos.getY1() > ptos.getY2()) {
            yFinal = ptos.getY1() - ptos.getY2();
        } else {
            yFinal = ptos.getY2() - ptos.getY1();
        }
        double dist = Math.sqrt(Math.pow(xFinal, 2) + Math.pow(yFinal, 2));
        System.out.println("La distancia entre el punto 1 y el punto 2 es "+ df.format(dist));
    }
}

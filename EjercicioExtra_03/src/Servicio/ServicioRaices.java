/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Raices;
import java.util.Scanner;

/**
 *
 * @author Martin
 */

public class ServicioRaices {
    
    static Scanner entrada = new Scanner(System.in);

    public Raices crearRaices() {

        Raices raiz = new Raices();
        System.out.println("ingrese un valor para el coeficiente a");
        raiz.setA(entrada.nextInt());
        System.out.println("ingrese un valor para el coeficiente b");
        raiz.setB(entrada.nextInt());
        System.out.println("ingrese un valor para el coeficiente c");
        raiz.setC(entrada.nextInt());
        return raiz;
    }
    
// Método getDiscriminante(): devuelve el valor del discriminante (double). El
//discriminante tiene la siguiente formula: (b^2)-4*a*c
    public double getDiscriminante(Raices raiz){
        
        double discriminante;
        discriminante = ((Math.pow(raiz.getB(), 2))-(4*raiz.getA()*raiz.getC()));
        return discriminante;
    }
        
// Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para
//que esto ocurra, el discriminante debe ser mayor o igual que 0.
    public boolean tieneRaices(Raices raiz){
        
        boolean bandera = false;
        double disc = getDiscriminante(raiz);
        if (disc >= 0) {
            bandera = true;
        }
        return bandera;
    }
    
// Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución, para
//que esto ocurra, el discriminante debe ser igual que 0.
    public boolean tieneRaiz(Raices raiz){
        
        boolean bandera = false;
        double disc = getDiscriminante(raiz);
        if (disc == 0) {
            bandera = true;
        }
        return bandera;
    }
    
    
// Método obtenerRaices(): llama a tieneRaíces() y si devolvió́ true, imprime las 2
//posibles soluciones.
    public void obtenerRaices(Raices raiz){
        
        boolean band = tieneRaices(raiz);
        if (band == true) {
          double r1 =(-raiz.getB()+Math.sqrt(((Math.pow(raiz.getB(), 2))-(4*raiz.getA()*raiz.getC()))))/(2*raiz.getA());
            double r2 = (-raiz.getB()-Math.sqrt(((Math.pow(raiz.getB(), 2))-(4*raiz.getA()*raiz.getC()))))/(2*raiz.getA());
            System.out.println("Las raices son "+r1+" y "+r2);
        }else {
            System.out.println("la ecuacion no tiene raices");
        }
    }
    
    
// Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́ true imprime una única raíz.
//Es en el caso en que se tenga una única solución posible.
    public void obtenerRaiz(Raices raiz){

        boolean band = tieneRaiz(raiz);
        if (band == true) {
            double r1 = (-raiz.getB() + Math.sqrt(((Math.pow(raiz.getB(), 2)) - (4 * raiz.getA() * raiz.getC())))) / (2 * raiz.getA());
            System.out.println("Las raiz es " + r1);
        } else {
            System.out.println("la ecuacion no tiene una unica raiz");
        }
    }
    
    
// Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará por
//pantalla las posibles soluciones que tiene nuestra ecuación con los métodos
//obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos y en caso
//de no existir solución, se mostrará un mensaje.
//Nota: Formula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a) Solo varia el signo
//delante de -b
    public void calcular(Raices raiz) {

        if (tieneRaiz(raiz) == true) {
            obtenerRaiz(raiz);
        } else if (tieneRaices(raiz) == true) {
            obtenerRaices(raiz);
        } else {
            System.out.println("No existen raices");
        }
    }
        
}

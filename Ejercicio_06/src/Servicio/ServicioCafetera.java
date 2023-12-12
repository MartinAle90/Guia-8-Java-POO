/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Cafetera;
import java.util.Scanner;

/**
 *
 * @author Martin
 */
public class ServicioCafetera {

    static Scanner entrada = new Scanner(System.in);

// Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad
//máxima.
    
// Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
//tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
//cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
//método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
//cuanto quedó la taza.
    
// Método vaciarCafetera(): pone la cantidad de café actual en cero.
    
// Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
//recibe y se añade a la cafetera la cantidad de café indicada. 
    
    public Cafetera crearCafetera() {

        Cafetera caf = new Cafetera();
        System.out.println("ingrese la capacidad maxima de la cafetera");
        int capMax = entrada.nextInt();
        caf.setCapacidadMaxima(capMax);
        caf.setCantidadActual(0);
        return caf;
    }

    public void llenarCafetera(Cafetera caf) {
        caf.setCantidadActual(caf.getCapacidadMaxima());
    }

    public void servirTaza(Cafetera caf, int taza) {

        if (caf.getCantidadActual() >= taza) {
            System.out.println("Se lleno la taza");
            caf.setCantidadActual(caf.getCantidadActual() - taza);
        } else {
            System.out.println("No se lleno la taza \nLa taza quedo en " + caf.getCantidadActual());
            caf.setCantidadActual(0);
        }
    }

    public void agregarCafe(Cafetera caf, int cafe) {

        if ((caf.getCapacidadMaxima() - caf.getCantidadActual()) == cafe) {
            System.out.println("Se lleno la cafetera");
            caf.setCantidadActual(caf.getCantidadActual() + cafe);
        } else if ((caf.getCapacidadMaxima() - caf.getCantidadActual()) > cafe) {
            caf.setCantidadActual(caf.getCantidadActual() + cafe);
            System.out.println("No se termino de llenar la cafetera, esta quedo en "+caf.getCantidadActual());      
        } else {
            System.out.println("La cafetera se lleno, pero se rebalso");
            caf.setCantidadActual(caf.getCapacidadMaxima());
        }
    }
    
}

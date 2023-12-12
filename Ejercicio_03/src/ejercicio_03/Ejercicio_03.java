/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_03;

import Entidad.Operacion;
import Servicio.ServicioOperacion;

/**
 *
 * @author Martin
 */
public class Ejercicio_03 { 

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ServicioOperacion so = new ServicioOperacion();
        Operacion oper = so.crearOperacion();
        so.sumar(oper);
        System.out.println("La suma es : " + so.sumar(oper));
        System.out.println("La resta es : " + so.restar(oper));
        System.out.println("La multiplicacion es : " + so.multiplicar(oper));
        System.out.println("La division es : " + so.dividir(oper));
    }
    
}

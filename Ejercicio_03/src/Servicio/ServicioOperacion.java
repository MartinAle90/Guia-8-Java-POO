/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Operacion;
import java.util.Scanner;

/**
 *
 * @author Martin
 */
public class ServicioOperacion {
    
    Scanner entrada = new Scanner(System.in);
    
    public Operacion crearOperacion(){
        
        Operacion o1 = new Operacion();
        
        System.out.println("Ingrese el numero 1");
        int numero1 = entrada.nextInt();
        System.out.println("Ingrese el numero 2");
        int numero2 = entrada.nextInt();
        
        o1.setNumero1(numero1);
        o1.setNumero2(numero2);
        
        return o1;
    }
    
    
    public int sumar(Operacion o1) {
        return (o1.getNumero1() + o1.getNumero2());
    }

    public int restar(Operacion o1) {
        return (o1.getNumero1() - o1.getNumero2());
    }

    public int multiplicar(Operacion o1) {
        return (o1.getNumero1() * o1.getNumero2());
    }

    public double dividir(Operacion o1) {
        if (o1.getNumero2() != 0) {
            return (o1.getNumero1()*1.0 / o1.getNumero2());

        } else {
            System.out.println("El numero 2 no puede ser cero");
            return 0;
        }
    }
    
    
}

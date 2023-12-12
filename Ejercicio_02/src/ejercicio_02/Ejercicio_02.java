/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_02;

import Entidad.Circunferencia;
import Servicios.ServicioCircunferencia;

/**
 *
 * @author Martin
 */
public class Ejercicio_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ServicioCircunferencia sc = new ServicioCircunferencia(); 
        Circunferencia circunferencia = sc.crearCircunferencia();
        
        sc.area(circunferencia);
        
        sc.perimetro(circunferencia);
        
        
        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

/**
 *
 * @author Martin
 */
public class ServicioArreglo {
    
    public void llenarArray(double [] array){
        
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random()*10;
        }
    }
    
    public void mostrarArray(double [] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print("["+array[i]+"] ");
        }
        System.out.println("");
    }
    
    
    
}

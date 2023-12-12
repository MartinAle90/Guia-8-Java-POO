/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Matematica;

/**
 *
 * @author Martin
 */

//Deberá además implementar los siguientes métodos:
//a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
//b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase
//elevado al menor número. Previamente se deben redondear ambos valores.
//c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
//Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número. 

public class ServicioMatematica {
    
    Matematica mat = new Matematica();
    public double mayor;
    public double menor;
    
    public double devolverMayor(Matematica mat) {

        if (mat.getNum1() >= mat.getNum2()) {
            mayor = mat.getNum1();
            menor = mat.getNum2();
        } else {
            mayor = mat.getNum2();
            menor = mat.getNum2();
        }
        return mayor;
    }
    
    public void calcularPotencia(){
        
        double auxMayor, auxMenor;
        System.out.println("");
        auxMayor=Math.round(mayor);
        auxMenor=Math.round(menor);
        System.out.println(auxMenor);
        System.out.println(auxMayor);
        System.out.println(Math.pow(auxMayor, auxMenor));
        
    }
    
    public void calculaRaiz(){
        
        int absMenor;
        absMenor =(int) Math.abs(menor);
        System.out.println(absMenor);
        System.out.println(Math.sqrt(absMenor));
    }
    
}

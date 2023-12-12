/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioextra_03;

import Entidad.Raices;
import Servicio.ServicioRaices;
import java.util.Scanner;

/**
 *
 * @author Martin
 */
public class EjercicioExtra_03 {

    /**
     * @param args the command line arguments
     */
    
    static Scanner entrada = new Scanner(System.in);
    
//    Vamos a realizar una clase llamada Raices, donde representaremos los valores de una
//ecuación de 2o grado. Tendremos los 3 coeficientes como atributos, llamémosles a, b y c.
//Hay que insertar estos 3 valores para construir el objeto a través de un método
//constructor. 
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        ServicioRaices sr = new ServicioRaices();
        Raices rz = sr.crearRaices();
        sr.calcular(rz);
    }
    
}

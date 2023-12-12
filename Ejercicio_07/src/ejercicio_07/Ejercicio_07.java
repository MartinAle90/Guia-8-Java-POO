/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_07;

import Entidad.Persona;
import Servicio.ServicioPersona;

/**
 *
 * @author Martin
 */
public class Ejercicio_07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        ServicioPersona sp = new ServicioPersona();
        Persona persona1 = sp.crearPersona();

        System.out.println(persona1.getNombre() + "\n" + persona1.getEdad() + "\n" + persona1.getSexo() + "\n" + persona1.getPeso() + "\n" + persona1.getAltura());

        switch (sp.calcularIMC(persona1)) {
            case -1:
                System.out.println(persona1.getNombre() + " se encuentra por debajo de su peso ideal");
                break;
            case 0:
                System.out.println(persona1.getNombre() + " se encuentra en su peso ideal");
                break;
            case 1:
                System.out.println(persona1.getNombre() + " se encuentra con sobrepeso");
                break;
        }

        if (sp.esMayorDeEdad(persona1)) {
            System.out.println(persona1.getNombre() + " es mayor de edad");
        } else {
            System.out.println(persona1.getNombre() + " es menor de edad");
        }
    }
    
}
